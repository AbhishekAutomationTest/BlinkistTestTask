package com.blinkslabs.blinkist.android.challenge.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blinkslabs.blinkist.android.challenge.data.BooksService
import com.blinkslabs.blinkist.android.challenge.data.model.Book
import com.blinkslabs.blinkist.android.challenge.util.BLSchedulers
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber
import javax.inject.Inject

class BooksViewModel @Inject constructor(private val booksService: BooksService) : ViewModel() {

    private val subscriptions = CompositeDisposable()

    private val books = MutableLiveData<List<Book>>()

    fun books(): LiveData<List<Book>> = books

    fun fetchBooks() {
        subscriptions.add(
            booksService.getBooks()
                .subscribeOn(BLSchedulers.io())
                .observeOn(BLSchedulers.main())
                .subscribe({
                    books.value = it
                }, { throwable ->
                    Timber.e(throwable, "while loading data")
                })
        )
    }

    override fun onCleared() {
        subscriptions.clear()
    }
}

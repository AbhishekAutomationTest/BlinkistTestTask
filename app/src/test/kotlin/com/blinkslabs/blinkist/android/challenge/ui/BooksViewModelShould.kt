package com.blinkslabs.blinkist.android.challenge.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.blinkslabs.blinkist.android.challenge.data.BooksService
import com.blinkslabs.blinkist.android.challenge.data.model.Book
import com.blinkslabs.blinkist.android.challenge.util.BLSchedulers
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BooksViewModelShould {

    @get:Rule val liveDataRule = InstantTaskExecutorRule()

    @Mock lateinit var booksService: BooksService

    @InjectMocks lateinit var viewModel: BooksViewModel

    private val mockBooks: List<Book> = listOf(mock(), mock(), mock())

    @Before fun setUp() {
        BLSchedulers.enableTesting()
    }

    @After fun tearDown() {
        BLSchedulers.disableTesting()
    }

    @Test fun callGetBooksOnServiceWhenFetchBooksIsCalled() {
        givenASuccessfulBooksServiceCall(mockBooks)
        viewModel.fetchBooks()
        verify(booksService).getBooks()
    }

    @Test fun showBooksOnViewWhenFetchBooksIsSuccessful() {
        givenASuccessfulBooksServiceCall(mockBooks)
        viewModel.fetchBooks()
        viewModel.books().observeForever {
            assertEquals(mockBooks, it)
        }
    }

    private fun givenASuccessfulBooksServiceCall(result: List<Book>) {
        whenever(booksService.getBooks()).thenReturn(Single.just(result))
    }
}

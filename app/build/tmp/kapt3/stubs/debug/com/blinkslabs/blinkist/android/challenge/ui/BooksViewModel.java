package com.blinkslabs.blinkist.android.challenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/ui/BooksViewModel;", "Landroidx/lifecycle/ViewModel;", "booksService", "Lcom/blinkslabs/blinkist/android/challenge/data/BooksService;", "(Lcom/blinkslabs/blinkist/android/challenge/data/BooksService;)V", "books", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/blinkslabs/blinkist/android/challenge/data/model/Book;", "subscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "Landroidx/lifecycle/LiveData;", "fetchBooks", "", "onCleared", "app_debug"})
public final class BooksViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable subscriptions = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.blinkslabs.blinkist.android.challenge.data.model.Book>> books = null;
    private final com.blinkslabs.blinkist.android.challenge.data.BooksService booksService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.blinkslabs.blinkist.android.challenge.data.model.Book>> books() {
        return null;
    }
    
    public final void fetchBooks() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public BooksViewModel(@org.jetbrains.annotations.NotNull()
    com.blinkslabs.blinkist.android.challenge.data.BooksService booksService) {
        super();
    }
}
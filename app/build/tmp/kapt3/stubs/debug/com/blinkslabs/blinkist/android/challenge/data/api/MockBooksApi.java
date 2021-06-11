package com.blinkslabs.blinkist.android.challenge.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/data/api/MockBooksApi;", "Lcom/blinkslabs/blinkist/android/challenge/data/api/BooksApi;", "()V", "getAllBooks", "Lio/reactivex/Single;", "", "Lcom/blinkslabs/blinkist/android/challenge/data/model/Book;", "app_debug"})
public final class MockBooksApi implements com.blinkslabs.blinkist.android.challenge.data.api.BooksApi {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.blinkslabs.blinkist.android.challenge.data.model.Book>> getAllBooks() {
        return null;
    }
    
    @javax.inject.Inject()
    public MockBooksApi() {
        super();
    }
}
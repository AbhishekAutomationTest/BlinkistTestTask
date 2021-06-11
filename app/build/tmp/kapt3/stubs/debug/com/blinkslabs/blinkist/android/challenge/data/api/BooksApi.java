package com.blinkslabs.blinkist.android.challenge.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/data/api/BooksApi;", "", "getAllBooks", "Lio/reactivex/Single;", "", "Lcom/blinkslabs/blinkist/android/challenge/data/model/Book;", "app_debug"})
public abstract interface BooksApi {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.blinkslabs.blinkist.android.challenge.data.model.Book>> getAllBooks();
}
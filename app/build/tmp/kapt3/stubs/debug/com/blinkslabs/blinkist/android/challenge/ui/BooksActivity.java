package com.blinkslabs.blinkist.android.challenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/ui/BooksActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter$OnItemClickListener;", "()V", "booksViewModelFactory", "Lcom/blinkslabs/blinkist/android/challenge/ui/BooksViewModelFactory;", "getBooksViewModelFactory", "()Lcom/blinkslabs/blinkist/android/challenge/ui/BooksViewModelFactory;", "setBooksViewModelFactory", "(Lcom/blinkslabs/blinkist/android/challenge/ui/BooksViewModelFactory;)V", "recyclerAdapter", "Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter;", "viewModel", "Lcom/blinkslabs/blinkist/android/challenge/ui/BooksViewModel;", "getViewModel", "()Lcom/blinkslabs/blinkist/android/challenge/ui/BooksViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "alertDialog", "", "title", "", "hideLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showBooks", "books", "", "Lcom/blinkslabs/blinkist/android/challenge/data/model/Book;", "showLoading", "app_debug"})
public final class BooksActivity extends androidx.appcompat.app.AppCompatActivity implements com.blinkslabs.blinkist.android.challenge.ui.BookListRecyclerAdapter.OnItemClickListener {
    @javax.inject.Inject()
    public com.blinkslabs.blinkist.android.challenge.ui.BooksViewModelFactory booksViewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.blinkslabs.blinkist.android.challenge.ui.BookListRecyclerAdapter recyclerAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.blinkslabs.blinkist.android.challenge.ui.BooksViewModelFactory getBooksViewModelFactory() {
        return null;
    }
    
    public final void setBooksViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.blinkslabs.blinkist.android.challenge.ui.BooksViewModelFactory p0) {
    }
    
    private final com.blinkslabs.blinkist.android.challenge.ui.BooksViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void showBooks(java.util.List<com.blinkslabs.blinkist.android.challenge.data.model.Book> books) {
    }
    
    @java.lang.Override()
    public void alertDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public BooksActivity() {
        super();
    }
}
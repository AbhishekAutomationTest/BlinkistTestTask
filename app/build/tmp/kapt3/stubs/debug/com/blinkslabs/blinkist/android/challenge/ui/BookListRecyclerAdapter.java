package com.blinkslabs.blinkist.android.challenge.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter$OnItemClickListener;", "(Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter$OnItemClickListener;)V", "items", "Ljava/util/ArrayList;", "Lcom/blinkslabs/blinkist/android/challenge/data/model/Book;", "getItems", "()Ljava/util/ArrayList;", "getListener", "()Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter$OnItemClickListener;", "setListener", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "BookViewHolder", "OnItemClickListener", "app_debug"})
public final class BookListRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.blinkslabs.blinkist.android.challenge.data.model.Book> items = null;
    @org.jetbrains.annotations.NotNull()
    private com.blinkslabs.blinkist.android.challenge.ui.BookListRecyclerAdapter.OnItemClickListener listener;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.blinkslabs.blinkist.android.challenge.data.model.Book> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.blinkslabs.blinkist.android.challenge.data.model.Book> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.blinkslabs.blinkist.android.challenge.ui.BookListRecyclerAdapter.OnItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.blinkslabs.blinkist.android.challenge.ui.BookListRecyclerAdapter.OnItemClickListener p0) {
    }
    
    public BookListRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.blinkslabs.blinkist.android.challenge.ui.BookListRecyclerAdapter.OnItemClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter$OnItemClickListener;", "", "alertDialog", "", "title", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void alertDialog(@org.jetbrains.annotations.NotNull()
        java.lang.String title);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter$BookViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "v", "Landroid/view/View;", "(Lcom/blinkslabs/blinkist/android/challenge/ui/BookListRecyclerAdapter;Landroid/view/View;)V", "authorTextView", "Landroid/widget/TextView;", "getAuthorTextView", "()Landroid/widget/TextView;", "setAuthorTextView", "(Landroid/widget/TextView;)V", "coverImageView", "Landroid/widget/ImageView;", "getCoverImageView", "()Landroid/widget/ImageView;", "setCoverImageView", "(Landroid/widget/ImageView;)V", "titleTextView", "getTitleTextView", "setTitleTextView", "onClick", "", "app_debug"})
    public final class BookViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView authorTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView titleTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView coverImageView;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAuthorTextView() {
            return null;
        }
        
        public final void setAuthorTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        public final void setTitleTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCoverImageView() {
            return null;
        }
        
        public final void setCoverImageView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public BookViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}
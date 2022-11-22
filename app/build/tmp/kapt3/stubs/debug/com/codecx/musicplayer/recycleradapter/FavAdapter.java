package com.codecx.musicplayer.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001b+B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0016H\u0016J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/FavAdapter;", "Lcom/codecx/musicplayer/recycleradapter/RVBaseAdapter;", "context", "Landroid/app/Activity;", "dataset", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "getContext", "()Landroid/app/Activity;", "dataSend", "Lcom/codecx/musicplayer/recycleradapter/FavAdapter$OnDataSend;", "getDataSend", "()Lcom/codecx/musicplayer/recycleradapter/FavAdapter$OnDataSend;", "setDataSend", "(Lcom/codecx/musicplayer/recycleradapter/FavAdapter$OnDataSend;)V", "getDataset", "()Ljava/util/ArrayList;", "setDataset", "(Ljava/util/ArrayList;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "OnDataSend", "", "getCurrentPosition", "getItemCount", "getSong", "getSongUri", "Landroid/net/Uri;", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updatePosition", "newIndex", "RecyclerViewViewHolder", "app_debug"})
public final class FavAdapter extends com.codecx.musicplayer.recycleradapter.RVBaseAdapter {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> dataset;
    private int position = 0;
    public com.codecx.musicplayer.recycleradapter.FavAdapter.OnDataSend dataSend;
    
    public FavAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> dataset) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getDataset() {
        return null;
    }
    
    public final void setDataset(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.FavAdapter.OnDataSend getDataSend() {
        return null;
    }
    
    public final void setDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.FavAdapter.OnDataSend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void updatePosition(int newIndex) {
    }
    
    @java.lang.Override()
    public int getCurrentPosition() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getSongUri(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.musicdatabase.entities.SongModel getSong(int position) {
        return null;
    }
    
    public final void OnDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.FavAdapter.OnDataSend dataSend) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/FavAdapter$RecyclerViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codecx/musicplayer/databinding/FavRvItemBinding;", "(Lcom/codecx/musicplayer/recycleradapter/FavAdapter;Lcom/codecx/musicplayer/databinding/FavRvItemBinding;)V", "getBinding", "()Lcom/codecx/musicplayer/databinding/FavRvItemBinding;", "app_debug"})
    public class RecyclerViewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.codecx.musicplayer.databinding.FavRvItemBinding binding = null;
        
        public RecyclerViewViewHolder(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.databinding.FavRvItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.databinding.FavRvItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/FavAdapter$OnDataSend;", "", "onSend", "", "context", "Landroid/app/Activity;", "songModel", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "app_debug"})
    public static abstract interface OnDataSend {
        
        public abstract void onSend(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, @org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicdatabase.entities.SongModel songModel);
    }
}
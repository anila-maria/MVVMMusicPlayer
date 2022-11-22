package com.codecx.musicplayer.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002!2B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0016H\u0002J\u0018\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001cH\u0016J\u000e\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00063"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater;", "Lcom/codecx/musicplayer/recycleradapter/RVBaseAdapter;", "dataset", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "context", "Landroid/app/Activity;", "(Ljava/util/ArrayList;Landroid/app/Activity;)V", "getContext", "()Landroid/app/Activity;", "dataSend", "Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater$OnDataSend;", "getDataSend", "()Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater$OnDataSend;", "setDataSend", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater$OnDataSend;)V", "getDataset", "()Ljava/util/ArrayList;", "setDataset", "(Ljava/util/ArrayList;)V", "playlist_name", "", "getPlaylist_name", "()Ljava/lang/String;", "setPlaylist_name", "(Ljava/lang/String;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "OnDataSend", "", "getCurrentPosition", "getItemCount", "handleMenuButtonClickListener", "", "itemId", "songId", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updatePosition", "newIndex", "RecyclerViewViewHolder", "app_debug"})
public final class PlaylistPageAdapater extends com.codecx.musicplayer.recycleradapter.RVBaseAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> dataset;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    private int position = 0;
    public com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater.OnDataSend dataSend;
    public java.lang.String playlist_name;
    
    public PlaylistPageAdapater(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> dataset, @org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getDataset() {
        return null;
    }
    
    public final void setDataset(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater.OnDataSend getDataSend() {
        return null;
    }
    
    public final void setDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater.OnDataSend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaylist_name() {
        return null;
    }
    
    public final void setPlaylist_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    private final boolean handleMenuButtonClickListener(int itemId, java.lang.String songId) {
        return false;
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
    
    public final void OnDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater.OnDataSend dataSend) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater$OnDataSend;", "", "onDelete", "", "id", "", "onSend", "context", "Landroid/app/Activity;", "app_debug"})
    public static abstract interface OnDataSend {
        
        public abstract void onSend(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, @org.jetbrains.annotations.NotNull()
        java.lang.String id);
        
        public abstract void onDelete(@org.jetbrains.annotations.NotNull()
        java.lang.String id);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater$RecyclerViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codecx/musicplayer/databinding/PlaylistSongRvItemBinding;", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater;Lcom/codecx/musicplayer/databinding/PlaylistSongRvItemBinding;)V", "getBinding", "()Lcom/codecx/musicplayer/databinding/PlaylistSongRvItemBinding;", "app_debug"})
    public class RecyclerViewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.codecx.musicplayer.databinding.PlaylistSongRvItemBinding binding = null;
        
        public RecyclerViewViewHolder(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.databinding.PlaylistSongRvItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.databinding.PlaylistSongRvItemBinding getBinding() {
            return null;
        }
    }
}
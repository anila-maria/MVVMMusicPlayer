package com.codecx.musicplayer.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001e0B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J \u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020!H\u0002J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020!H\u0017J\u0018\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020!H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00061"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter;", "Lcom/codecx/musicplayer/recycleradapter/RVBaseAdapter;", "context", "Landroid/app/Activity;", "arrayList", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "Lkotlin/collections/ArrayList;", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "dataSend", "Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$OnDataSend;", "getDataSend", "()Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$OnDataSend;", "setDataSend", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$OnDataSend;)V", "dataset", "getDataset", "()Ljava/util/ArrayList;", "setDataset", "(Ljava/util/ArrayList;)V", "viewHolder", "Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$RecyclerViewViewHolder;", "getViewHolder", "()Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$RecyclerViewViewHolder;", "setViewHolder", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$RecyclerViewViewHolder;)V", "OnDataSend", "", "getCurrentPosition", "", "getItemCount", "handleMenuButtonClickListener", "", "itemId", "playlistId", "", "position", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RecyclerViewViewHolder", "app_debug"})
public final class PlaylistAdapter extends com.codecx.musicplayer.recycleradapter.RVBaseAdapter {
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity context;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> dataset;
    public com.codecx.musicplayer.recycleradapter.PlaylistAdapter.RecyclerViewViewHolder viewHolder;
    public com.codecx.musicplayer.recycleradapter.PlaylistAdapter.OnDataSend dataSend;
    
    public PlaylistAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> arrayList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getDataset() {
        return null;
    }
    
    public final void setDataset(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.PlaylistAdapter.RecyclerViewViewHolder getViewHolder() {
        return null;
    }
    
    public final void setViewHolder(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.PlaylistAdapter.RecyclerViewViewHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.PlaylistAdapter.OnDataSend getDataSend() {
        return null;
    }
    
    public final void setDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.PlaylistAdapter.OnDataSend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getCurrentPosition() {
        return 0;
    }
    
    private final boolean handleMenuButtonClickListener(int itemId, long playlistId, int position) {
        return false;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void OnDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.PlaylistAdapter.OnDataSend dataSend) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$OnDataSend;", "", "onSend", "", "context", "Landroid/app/Activity;", "id", "", "openPlaylist", "app_debug"})
    public static abstract interface OnDataSend {
        
        public abstract void onSend(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, long id);
        
        public abstract void openPlaylist(long id);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter$RecyclerViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codecx/musicplayer/databinding/PlaylistItemBinding;", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter;Lcom/codecx/musicplayer/databinding/PlaylistItemBinding;)V", "getBinding", "()Lcom/codecx/musicplayer/databinding/PlaylistItemBinding;", "app_debug"})
    public class RecyclerViewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.codecx.musicplayer.databinding.PlaylistItemBinding binding = null;
        
        public RecyclerViewViewHolder(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.databinding.PlaylistItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.databinding.PlaylistItemBinding getBinding() {
            return null;
        }
    }
}
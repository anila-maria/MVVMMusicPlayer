package com.codecx.musicplayer.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002%:B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0017H\u0016J\u000e\u0010+\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u00101\u001a\u00020&2\u0006\u00102\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u00104\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0017H\u0016J\u000e\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001e\u0010\u001f\u001a\u00060 R\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006;"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/SongsAdapter;", "Lcom/codecx/musicplayer/recycleradapter/RVBaseAdapter;", "Landroid/widget/Filterable;", "context", "Landroid/app/Activity;", "dataset", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "getContext", "()Landroid/app/Activity;", "dataSend", "Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$OnDataSend;", "getDataSend", "()Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$OnDataSend;", "setDataSend", "(Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$OnDataSend;)V", "getDataset", "()Ljava/util/ArrayList;", "setDataset", "(Ljava/util/ArrayList;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "songFilterList", "getSongFilterList", "setSongFilterList", "viewHolder", "Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$RecyclerViewViewHolder;", "getViewHolder", "()Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$RecyclerViewViewHolder;", "setViewHolder", "(Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$RecyclerViewViewHolder;)V", "OnDataSend", "", "getCurrentPosition", "getFilter", "Landroid/widget/Filter;", "getItemCount", "getSong", "getSongUri", "Landroid/net/Uri;", "handleMenuButtonClickListener", "", "itemId", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updatePosition", "newIndex", "RecyclerViewViewHolder", "app_debug"})
public final class SongsAdapter extends com.codecx.musicplayer.recycleradapter.RVBaseAdapter implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> dataset;
    private int position = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> songFilterList;
    public com.codecx.musicplayer.recycleradapter.SongsAdapter.OnDataSend dataSend;
    public com.codecx.musicplayer.recycleradapter.SongsAdapter.RecyclerViewViewHolder viewHolder;
    
    public SongsAdapter(@org.jetbrains.annotations.NotNull()
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
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getSongFilterList() {
        return null;
    }
    
    public final void setSongFilterList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.SongsAdapter.OnDataSend getDataSend() {
        return null;
    }
    
    public final void setDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.SongsAdapter.OnDataSend p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.SongsAdapter.RecyclerViewViewHolder getViewHolder() {
        return null;
    }
    
    public final void setViewHolder(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.SongsAdapter.RecyclerViewViewHolder p0) {
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
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    public final boolean handleMenuButtonClickListener(int itemId, int position) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getSongUri(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.musicdatabase.entities.SongModel getSong(int position) {
        return null;
    }
    
    public final void OnDataSend(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.SongsAdapter.OnDataSend dataSend) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$RecyclerViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codecx/musicplayer/databinding/SongRvItemBinding;", "(Lcom/codecx/musicplayer/recycleradapter/SongsAdapter;Lcom/codecx/musicplayer/databinding/SongRvItemBinding;)V", "getBinding", "()Lcom/codecx/musicplayer/databinding/SongRvItemBinding;", "app_debug"})
    public class RecyclerViewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.codecx.musicplayer.databinding.SongRvItemBinding binding = null;
        
        public RecyclerViewViewHolder(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.databinding.SongRvItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.databinding.SongRvItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/SongsAdapter$OnDataSend;", "", "onSend", "", "context", "Landroid/app/Activity;", "songModel", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "app_debug"})
    public static abstract interface OnDataSend {
        
        public abstract void onSend(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, @org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicdatabase.entities.SongModel songModel);
    }
}
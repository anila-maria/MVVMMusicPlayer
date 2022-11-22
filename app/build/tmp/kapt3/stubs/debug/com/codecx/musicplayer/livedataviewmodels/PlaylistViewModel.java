package com.codecx.musicplayer.livedataviewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0005j\b\u0012\u0004\u0012\u00020\u0015`\u0007J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR0\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/codecx/musicplayer/livedataviewmodels/PlaylistViewModel;", "Lcom/codecx/musicplayer/livedataviewmodels/BaseViewModel;", "()V", "dataset", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDataset", "()Landroidx/lifecycle/MutableLiveData;", "setDataset", "(Landroidx/lifecycle/MutableLiveData;)V", "playlistRepository", "Lcom/codecx/musicplayer/repo/PlaylistRepository;", "getPlaylistRepository", "()Lcom/codecx/musicplayer/repo/PlaylistRepository;", "setPlaylistRepository", "(Lcom/codecx/musicplayer/repo/PlaylistRepository;)V", "fillRecyclerView", "", "getDataSet", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "setFragmentContext", "context", "Landroid/content/Context;", "updateDataset", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class PlaylistViewModel extends com.codecx.musicplayer.livedataviewmodels.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> dataset;
    public com.codecx.musicplayer.repo.PlaylistRepository playlistRepository;
    
    public PlaylistViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> getDataset() {
        return null;
    }
    
    @java.lang.Override()
    public void setDataset(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.repo.PlaylistRepository getPlaylistRepository() {
        return null;
    }
    
    public final void setPlaylistRepository(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.repo.PlaylistRepository p0) {
    }
    
    public final void setFragmentContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void fillRecyclerView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getDataSet() {
        return null;
    }
}
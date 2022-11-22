package com.codecx.musicplayer.livedataviewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0007j\b\u0012\u0004\u0012\u00020\u0014`\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u0013R0\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/codecx/musicplayer/livedataviewmodels/PlaylistPageViewModel;", "Lcom/codecx/musicplayer/livedataviewmodels/BaseViewModel;", "playlistPageRepository", "Lcom/codecx/musicplayer/repo/PlaylistPageRepository;", "(Lcom/codecx/musicplayer/repo/PlaylistPageRepository;)V", "dataset", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDataset", "()Landroidx/lifecycle/MutableLiveData;", "setDataset", "(Landroidx/lifecycle/MutableLiveData;)V", "playlistId", "", "getPlaylistPageRepository", "()Lcom/codecx/musicplayer/repo/PlaylistPageRepository;", "fillRecyclerView", "Lkotlinx/coroutines/Job;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "setPlayllistId", "", "pId", "updateDataset", "app_debug"})
public final class PlaylistPageViewModel extends com.codecx.musicplayer.livedataviewmodels.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.codecx.musicplayer.repo.PlaylistPageRepository playlistPageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> dataset;
    private long playlistId = -1L;
    
    public PlaylistPageViewModel(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.repo.PlaylistPageRepository playlistPageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.repo.PlaylistPageRepository getPlaylistPageRepository() {
        return null;
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
    
    public final void setPlayllistId(long pId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fillRecyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getDataset() {
        return null;
    }
}
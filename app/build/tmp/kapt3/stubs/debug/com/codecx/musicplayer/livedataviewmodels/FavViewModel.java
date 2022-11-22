package com.codecx.musicplayer.livedataviewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0007j\b\u0012\u0004\u0012\u00020\u0013`\tJ\u0006\u0010\u0014\u001a\u00020\u0015R0\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004\u00a8\u0006\u0016"}, d2 = {"Lcom/codecx/musicplayer/livedataviewmodels/FavViewModel;", "Lcom/codecx/musicplayer/livedataviewmodels/BaseViewModel;", "favRepository", "Lcom/codecx/musicplayer/repo/FavRepository;", "(Lcom/codecx/musicplayer/repo/FavRepository;)V", "dataset", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDataset", "()Landroidx/lifecycle/MutableLiveData;", "setDataset", "(Landroidx/lifecycle/MutableLiveData;)V", "getFavRepository", "()Lcom/codecx/musicplayer/repo/FavRepository;", "setFavRepository", "fillRecyclerView", "", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "updateDataset", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class FavViewModel extends com.codecx.musicplayer.livedataviewmodels.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.codecx.musicplayer.repo.FavRepository favRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> dataset;
    
    public FavViewModel(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.repo.FavRepository favRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.repo.FavRepository getFavRepository() {
        return null;
    }
    
    public final void setFavRepository(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.repo.FavRepository p0) {
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
    
    public final void fillRecyclerView() {
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
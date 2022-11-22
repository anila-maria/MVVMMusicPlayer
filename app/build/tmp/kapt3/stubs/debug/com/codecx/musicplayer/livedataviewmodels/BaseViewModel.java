package com.codecx.musicplayer.livedataviewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R0\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/codecx/musicplayer/livedataviewmodels/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dataset", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDataset", "()Landroidx/lifecycle/MutableLiveData;", "setDataset", "(Landroidx/lifecycle/MutableLiveData;)V", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    public androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> dataset;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> getDataset() {
        return null;
    }
    
    public void setDataset(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Object>> p0) {
    }
}
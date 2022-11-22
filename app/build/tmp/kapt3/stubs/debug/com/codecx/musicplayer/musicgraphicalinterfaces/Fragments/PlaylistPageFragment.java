package com.codecx.musicplayer.musicgraphicalinterfaces.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0002R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlaylistPageFragment;", "Lcom/codecx/musicplayer/baseclasses/BaseFragment;", "playlistId", "", "(J)V", "binding", "Lcom/codecx/musicplayer/databinding/FragmentPlaylistPageBinding;", "getBinding", "()Lcom/codecx/musicplayer/databinding/FragmentPlaylistPageBinding;", "getPlaylistId", "()J", "playlistSongsAdapter", "Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater;", "getPlaylistSongsAdapter", "()Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater;", "setPlaylistSongsAdapter", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistPageAdapater;)V", "playlistSongsObserver", "Landroidx/lifecycle/Observer;", "Ljava/util/ArrayList;", "", "viewModel", "Lcom/codecx/musicplayer/livedataviewmodels/PlaylistPageViewModel;", "getViewModel", "()Lcom/codecx/musicplayer/livedataviewmodels/PlaylistPageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getPlaylistName", "", "id", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupViewModel", "app_debug"})
public final class PlaylistPageFragment extends com.codecx.musicplayer.baseclasses.BaseFragment {
    private final long playlistId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    public com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater playlistSongsAdapter;
    private final androidx.lifecycle.Observer<java.util.ArrayList<java.lang.Object>> playlistSongsObserver = null;
    
    public PlaylistPageFragment(long playlistId) {
        super(0);
    }
    
    public final long getPlaylistId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.databinding.FragmentPlaylistPageBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.livedataviewmodels.PlaylistPageViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater getPlaylistSongsAdapter() {
        return null;
    }
    
    public final void setPlaylistSongsAdapter(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.recycleradapter.PlaylistPageAdapater p0) {
    }
    
    private final void setupViewModel() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaylistName(long id) {
        return null;
    }
}
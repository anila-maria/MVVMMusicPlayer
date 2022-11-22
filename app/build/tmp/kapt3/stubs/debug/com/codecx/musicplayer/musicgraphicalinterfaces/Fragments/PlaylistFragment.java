package com.codecx.musicplayer.musicgraphicalinterfaces.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlaylistFragment;", "Lcom/codecx/musicplayer/baseclasses/BaseFragment;", "Lcom/codecx/musicplayer/interfaces/PassData;", "()V", "binding", "Lcom/codecx/musicplayer/databinding/FragmentPlaylistBinding;", "getBinding", "()Lcom/codecx/musicplayer/databinding/FragmentPlaylistBinding;", "newPlaylistName", "", "playlistAdapter", "Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter;", "getPlaylistAdapter", "()Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter;", "setPlaylistAdapter", "(Lcom/codecx/musicplayer/recycleradapter/PlaylistAdapter;)V", "playlistUpdateObserver", "Landroidx/lifecycle/Observer;", "Ljava/util/ArrayList;", "", "onResume", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "passDataToInvokingFragment", "str", "setupViewModel", "Companion", "app_debug"})
public final class PlaylistFragment extends com.codecx.musicplayer.baseclasses.BaseFragment implements com.codecx.musicplayer.interfaces.PassData {
    @org.jetbrains.annotations.Nullable()
    private com.codecx.musicplayer.recycleradapter.PlaylistAdapter playlistAdapter;
    private java.lang.String newPlaylistName = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.musicgraphicalinterfaces.Fragments.PlaylistFragment.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.codecx.musicplayer.livedataviewmodels.PlaylistViewModel viewModel;
    private final androidx.lifecycle.Observer<java.util.ArrayList<java.lang.Object>> playlistUpdateObserver = null;
    
    public PlaylistFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codecx.musicplayer.recycleradapter.PlaylistAdapter getPlaylistAdapter() {
        return null;
    }
    
    public final void setPlaylistAdapter(@org.jetbrains.annotations.Nullable()
    com.codecx.musicplayer.recycleradapter.PlaylistAdapter p0) {
    }
    
    private final com.codecx.musicplayer.databinding.FragmentPlaylistBinding getBinding() {
        return null;
    }
    
    private final void setupViewModel() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void passDataToInvokingFragment(@org.jetbrains.annotations.Nullable()
    java.lang.String str) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlaylistFragment$Companion;", "", "()V", "viewModel", "Lcom/codecx/musicplayer/livedataviewmodels/PlaylistViewModel;", "getViewModel", "()Lcom/codecx/musicplayer/livedataviewmodels/PlaylistViewModel;", "setViewModel", "(Lcom/codecx/musicplayer/livedataviewmodels/PlaylistViewModel;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.codecx.musicplayer.livedataviewmodels.PlaylistViewModel getViewModel() {
            return null;
        }
        
        public final void setViewModel(@org.jetbrains.annotations.Nullable()
        com.codecx.musicplayer.livedataviewmodels.PlaylistViewModel p0) {
        }
    }
}
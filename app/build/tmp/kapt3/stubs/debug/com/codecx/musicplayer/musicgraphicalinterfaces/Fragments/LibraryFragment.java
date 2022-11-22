package com.codecx.musicplayer.musicgraphicalinterfaces.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002J\u0006\u0010\u0011\u001a\u00020\rJ\"\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\u0018\u001a\u00020\rH\u0016J\u001a\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J \u0010\u001e\u001a\u00020\r2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f` H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/LibraryFragment;", "Lcom/codecx/musicplayer/baseclasses/BaseFragment;", "Lcom/codecx/musicplayer/interfaces/PassDataForSelectPlaylists;", "()V", "binding", "Lcom/codecx/musicplayer/databinding/FragmentLibraryBinding;", "getBinding", "()Lcom/codecx/musicplayer/databinding/FragmentLibraryBinding;", "songListUpdateObserver", "Landroidx/lifecycle/Observer;", "Ljava/util/ArrayList;", "", "addSongToPlaylist", "", "playlist", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "addSongToSelectedPlaylist", "createDialogToSelectPlaylist", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "passDataToInvokingFragment", "playlists", "Lkotlin/collections/ArrayList;", "Library", "app_debug"})
public final class LibraryFragment extends com.codecx.musicplayer.baseclasses.BaseFragment implements com.codecx.musicplayer.interfaces.PassDataForSelectPlaylists {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.musicgraphicalinterfaces.Fragments.LibraryFragment.Library Library = null;
    @org.jetbrains.annotations.Nullable()
    private static com.codecx.musicplayer.recycleradapter.SongsAdapter songsAdapter;
    public static com.codecx.musicplayer.livedataviewmodels.SongsViewModel viewModel;
    public static androidx.fragment.app.FragmentActivity mactivity;
    public static com.codecx.musicplayer.musicdatabase.entities.SongModel selectedSong;
    public static java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> selectedPlaylists;
    public static final int DELETE_REQUEST_CODE = 2;
    private final androidx.lifecycle.Observer<java.util.ArrayList<java.lang.Object>> songListUpdateObserver = null;
    
    public LibraryFragment() {
        super(0);
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final com.codecx.musicplayer.databinding.FragmentLibraryBinding getBinding() {
        return null;
    }
    
    public final void createDialogToSelectPlaylist() {
    }
    
    @java.lang.Override()
    public void passDataToInvokingFragment(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> playlists) {
    }
    
    private final void addSongToSelectedPlaylist() {
    }
    
    public final void addSongToPlaylist(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006\'"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/LibraryFragment$Library;", "", "()V", "DELETE_REQUEST_CODE", "", "mactivity", "Landroidx/fragment/app/FragmentActivity;", "getMactivity", "()Landroidx/fragment/app/FragmentActivity;", "setMactivity", "(Landroidx/fragment/app/FragmentActivity;)V", "selectedPlaylists", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "Lkotlin/collections/ArrayList;", "getSelectedPlaylists", "()Ljava/util/ArrayList;", "setSelectedPlaylists", "(Ljava/util/ArrayList;)V", "selectedSong", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "getSelectedSong", "()Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "setSelectedSong", "(Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;)V", "songsAdapter", "Lcom/codecx/musicplayer/recycleradapter/SongsAdapter;", "getSongsAdapter", "()Lcom/codecx/musicplayer/recycleradapter/SongsAdapter;", "setSongsAdapter", "(Lcom/codecx/musicplayer/recycleradapter/SongsAdapter;)V", "viewModel", "Lcom/codecx/musicplayer/livedataviewmodels/SongsViewModel;", "getViewModel", "()Lcom/codecx/musicplayer/livedataviewmodels/SongsViewModel;", "setViewModel", "(Lcom/codecx/musicplayer/livedataviewmodels/SongsViewModel;)V", "notifyDataSetChanges", "", "app_debug"})
    public static final class Library {
        
        private Library() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.codecx.musicplayer.recycleradapter.SongsAdapter getSongsAdapter() {
            return null;
        }
        
        public final void setSongsAdapter(@org.jetbrains.annotations.Nullable()
        com.codecx.musicplayer.recycleradapter.SongsAdapter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.livedataviewmodels.SongsViewModel getViewModel() {
            return null;
        }
        
        public final void setViewModel(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.livedataviewmodels.SongsViewModel p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.FragmentActivity getMactivity() {
            return null;
        }
        
        public final void setMactivity(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.musicdatabase.entities.SongModel getSelectedSong() {
            return null;
        }
        
        public final void setSelectedSong(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicdatabase.entities.SongModel p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getSelectedPlaylists() {
            return null;
        }
        
        public final void setSelectedPlaylists(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> p0) {
        }
        
        public final void notifyDataSetChanges() {
        }
    }
}
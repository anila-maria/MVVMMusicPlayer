package com.codecx.musicplayer.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001e"}, d2 = {"Lcom/codecx/musicplayer/repo/PlaylistRepository;", "Lcom/codecx/musicplayer/interfaces/PlaylistRepoInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "createPlaylist", "", "name", "", "createPlaylistInStorage", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "getIdByName", "", "getIdOfSongsStoredInPlaylist", "plylist_id", "getPlaylistById", "id", "getPlaylistId", "getPlaylists", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "removePlaylist", "", "removePlaylistFromStorage", "playlist_Id", "removeSongFromPlaylist", "playlistId", "songsId", "app_debug"})
public final class PlaylistRepository implements com.codecx.musicplayer.interfaces.PlaylistRepoInterface {
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context context = null;
    
    public PlaylistRepository(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void createPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    private final com.codecx.musicplayer.musicdatabase.entities.PlaylistModel createPlaylistInStorage(java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public boolean removePlaylist(long id) {
        return false;
    }
    
    private final boolean removePlaylistFromStorage(long playlist_Id) {
        return false;
    }
    
    public final void removeSongFromPlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String songsId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getPlaylists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getIdOfSongsStoredInPlaylist(long plylist_id) {
        return null;
    }
    
    @java.lang.Override()
    public long getPlaylistId(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return 0L;
    }
    
    @java.lang.Override()
    public long getIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.codecx.musicplayer.musicdatabase.entities.PlaylistModel getPlaylistById(long id) {
        return null;
    }
}
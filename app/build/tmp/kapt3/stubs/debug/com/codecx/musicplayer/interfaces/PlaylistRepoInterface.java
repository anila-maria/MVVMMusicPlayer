package com.codecx.musicplayer.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000fj\b\u0012\u0004\u0012\u00020\u000b`\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0007H&\u00a8\u0006\u0013"}, d2 = {"Lcom/codecx/musicplayer/interfaces/PlaylistRepoInterface;", "", "createPlaylist", "", "name", "", "getIdByName", "", "getIdOfSongsStoredInPlaylist", "plylist_id", "getPlaylistById", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "id", "getPlaylistId", "getPlaylists", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "removePlaylist", "", "app_debug"})
public abstract interface PlaylistRepoInterface {
    
    public abstract void createPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getPlaylists();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getIdOfSongsStoredInPlaylist(long plylist_id);
    
    public abstract long getPlaylistId(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract boolean removePlaylist(long id);
    
    public abstract long getIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.codecx.musicplayer.musicdatabase.entities.PlaylistModel getPlaylistById(long id);
}
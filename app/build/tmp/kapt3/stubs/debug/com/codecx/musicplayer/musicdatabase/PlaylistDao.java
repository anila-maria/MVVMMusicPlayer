package com.codecx.musicplayer.musicdatabase;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\'J\u0019\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0013H\'J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/codecx/musicplayer/musicdatabase/PlaylistDao;", "", "addPlaylist", "", "playlist", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "(Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSongToPlaylist", "id", "", "songs", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylist", "playlistId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountOfSongsInPlaylist", "", "getPlaylists", "", "getSongsOfPlaylist", "setCountOfSongs", "count", "updateSongs", "app_debug"})
public abstract interface PlaylistDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object addPlaylist(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM playlist_table WHERE id = :playlistId")
    public abstract java.lang.Object deletePlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM playlist_table")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM playlist_table")
    public abstract java.util.List<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getPlaylists();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE playlist_table SET songs=:songs WHERE id = :id")
    public abstract java.lang.Object addSongToPlaylist(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT songs FROM playlist_table WHERE id = :id")
    public abstract java.lang.Object getSongsOfPlaylist(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @androidx.room.Query(value = "SELECT countOfSongs FROM playlist_table WHERE id = :id")
    public abstract int getCountOfSongsInPlaylist(long id);
    
    @androidx.room.Query(value = "UPDATE playlist_table SET countOfSongs = :count WHERE id = :id")
    public abstract void setCountOfSongs(long id, int count);
    
    @androidx.room.Query(value = "UPDATE playlist_table SET songs = :songs WHERE id = :id")
    public abstract void updateSongs(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String songs);
}
package com.codecx.musicplayer.musicdatabase;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/codecx/musicplayer/musicdatabase/FavoriteDao;", "", "addSong", "", "song", "Lcom/codecx/musicplayer/musicdatabase/entities/Favorites;", "(Lcom/codecx/musicplayer/musicdatabase/entities/Favorites;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSong", "getFavs", "", "app_debug"})
public abstract interface FavoriteDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object addSong(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.Favorites song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteSong(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.Favorites song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM playlist_table")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favorites_table")
    public abstract java.util.List<com.codecx.musicplayer.musicdatabase.entities.Favorites> getFavs();
}
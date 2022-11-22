package com.codecx.musicplayer.musicdatabase;

import java.lang.System;

@androidx.room.Database(entities = {com.codecx.musicplayer.musicdatabase.entities.PlaylistModel.class, com.codecx.musicplayer.musicdatabase.entities.Favorites.class}, version = 2)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/codecx/musicplayer/musicdatabase/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favoriteDao", "Lcom/codecx/musicplayer/musicdatabase/FavoriteDao;", "playlistDao", "Lcom/codecx/musicplayer/musicdatabase/PlaylistDao;", "Companion", "MyDatabaseCallback", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.musicdatabase.MyDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.codecx.musicplayer.musicdatabase.MyDatabase INSTANCE;
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codecx.musicplayer.musicdatabase.PlaylistDao playlistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codecx.musicplayer.musicdatabase.FavoriteDao favoriteDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0019\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/codecx/musicplayer/musicdatabase/MyDatabase$MyDatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "populateFavoriteDatabase", "favoriteDao", "Lcom/codecx/musicplayer/musicdatabase/FavoriteDao;", "(Lcom/codecx/musicplayer/musicdatabase/FavoriteDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "populatePlaylistDatabase", "playlistDao", "Lcom/codecx/musicplayer/musicdatabase/PlaylistDao;", "(Lcom/codecx/musicplayer/musicdatabase/PlaylistDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    static final class MyDatabaseCallback extends androidx.room.RoomDatabase.Callback {
        private final kotlinx.coroutines.CoroutineScope scope = null;
        
        public MyDatabaseCallback(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            super();
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object populatePlaylistDatabase(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicdatabase.PlaylistDao playlistDao, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object populateFavoriteDatabase(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicdatabase.FavoriteDao favoriteDao, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/codecx/musicplayer/musicdatabase/MyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/codecx/musicplayer/musicdatabase/MyDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.musicdatabase.MyDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
    }
}
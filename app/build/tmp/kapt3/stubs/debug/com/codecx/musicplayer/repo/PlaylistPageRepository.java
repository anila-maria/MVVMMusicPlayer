package com.codecx.musicplayer.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\u0007J!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0006j\b\u0012\u0004\u0012\u00020\u000b`\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/codecx/musicplayer/repo/PlaylistPageRepository;", "Lcom/codecx/musicplayer/interfaces/PlaylistPageRepositoryInterface;", "()V", "playlistId", "", "convertStringToArraylist", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "songs", "getSongs", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSongsIdFromDatabase", "removeSongFromPlaylist", "", "songId", "setPlayListId", "id", "songsIdToSongModelConverter", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PlaylistPageRepository implements com.codecx.musicplayer.interfaces.PlaylistPageRepositoryInterface {
    private long playlistId = 0L;
    
    public PlaylistPageRepository() {
        super();
    }
    
    public final void setPlayListId(long id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSongsIdFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object songsIdToSongModelConverter(@org.jetbrains.annotations.NotNull()
    java.lang.String songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codecx.musicplayer.musicdatabase.entities.SongModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> convertStringToArraylist(@org.jetbrains.annotations.NotNull()
    java.lang.String songs) {
        return null;
    }
    
    public final void removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String songId) {
    }
}
package com.codecx.musicplayer.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/codecx/musicplayer/interfaces/PlaylistPageRepositoryInterface;", "", "getSongs", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSongsIdFromDatabase", "", "songsIdToSongModelConverter", "songId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PlaylistPageRepositoryInterface {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSongsIdFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object songsIdToSongModelConverter(@org.jetbrains.annotations.NotNull()
    java.lang.String songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codecx.musicplayer.musicdatabase.entities.SongModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel>> continuation);
}
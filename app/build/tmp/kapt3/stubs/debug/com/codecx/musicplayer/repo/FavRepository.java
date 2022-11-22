package com.codecx.musicplayer.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/codecx/musicplayer/repo/FavRepository;", "", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "getFavSongs", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "Companion", "app_debug"})
public final class FavRepository {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.repo.FavRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> cashedFavArray;
    
    public FavRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getFavSongs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/codecx/musicplayer/repo/FavRepository$Companion;", "", "()V", "cashedFavArray", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "getCashedFavArray", "()Ljava/util/ArrayList;", "setCashedFavArray", "(Ljava/util/ArrayList;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getCashedFavArray() {
            return null;
        }
        
        public final void setCashedFavArray(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0) {
        }
    }
}
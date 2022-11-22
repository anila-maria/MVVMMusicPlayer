package com.codecx.musicplayer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005\u001a\u0006\u0010\u000e\u001a\u00020\u0005\u001a&\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f\u00a8\u0006\u0012"}, d2 = {"deleteFromPlaylist", "", "context", "Landroid/content/Context;", "playlistId", "", "trackId", "getMusicsRelatedToSpecificPlaylist", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "getPlaylistSize", "", "playlisId", "getToTalDuration", "playlistItemReorder", "oldPos", "newPos", "app_debug"})
public final class PlaylistUtilsKt {
    
    public static final int getPlaylistSize(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlisId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getMusicsRelatedToSpecificPlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlistId) {
        return null;
    }
    
    public static final void deleteFromPlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlistId, long trackId) {
    }
    
    public static final void playlistItemReorder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlistId, int oldPos, int newPos) {
    }
    
    public static final long getToTalDuration() {
        return 0L;
    }
}
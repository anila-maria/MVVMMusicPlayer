package com.codecx.musicplayer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/codecx/musicplayer/utils/PlaylistUtils;", "", "()V", "playlists", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "getPlaylists", "()Ljava/util/ArrayList;", "setPlaylists", "(Ljava/util/ArrayList;)V", "createPlaylist", "context", "Landroid/content/Context;", "name", "", "deletePlaylist", "", "playlist_Id", "", "app_debug"})
public final class PlaylistUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.utils.PlaylistUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> playlists;
    
    private PlaylistUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getPlaylists() {
        return null;
    }
    
    public final void setPlaylists(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.musicdatabase.entities.PlaylistModel createPlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void deletePlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlist_Id) {
    }
}
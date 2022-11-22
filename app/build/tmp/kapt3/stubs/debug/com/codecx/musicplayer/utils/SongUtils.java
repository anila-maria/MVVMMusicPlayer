package com.codecx.musicplayer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J?\u0010\u0013\u001a\u00020\u000422\u0010\u0014\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0015\"\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/codecx/musicplayer/utils/SongUtils;", "", "()V", "del", "", "songId", "", "uris", "Landroid/net/Uri;", "deleteMusic", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "uri", "getSongById", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "id", "", "shareMultipleMusics", "positions", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "([Ljava/util/ArrayList;)V", "shareMusic", "song", "app_debug"})
public final class SongUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.utils.SongUtils INSTANCE = null;
    
    private SongUtils() {
        super();
    }
    
    public final void shareMusic(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.SongModel song) {
    }
    
    public final void deleteMusic(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void del(@org.jetbrains.annotations.NotNull()
    java.lang.String songId, @org.jetbrains.annotations.NotNull()
    android.net.Uri uris) {
    }
    
    public final void shareMultipleMusics(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer>... positions) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codecx.musicplayer.musicdatabase.entities.SongModel getSongById(long id) {
        return null;
    }
}
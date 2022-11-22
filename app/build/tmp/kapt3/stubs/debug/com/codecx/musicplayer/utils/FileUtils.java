package com.codecx.musicplayer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006JY\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0015\u00a8\u0006\u0017"}, d2 = {"Lcom/codecx/musicplayer/utils/FileUtils;", "", "()V", "convertSongToFile", "Ljava/io/File;", "fileUri", "", "fetchFiles", "Landroid/database/Cursor;", "fileType", "Lcom/codecx/musicplayer/utils/FileUtils$FILE_TYPES;", "context", "Landroid/content/Context;", "projection", "", "selection", "selectionArgs", "sortOrder", "(Lcom/codecx/musicplayer/utils/FileUtils$FILE_TYPES;Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "shareFile", "", "Landroid/net/Uri;", "FILE_TYPES", "app_debug"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.utils.FileUtils INSTANCE = null;
    
    private FileUtils() {
        super();
    }
    
    public final void shareFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File convertSongToFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileUri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.Cursor fetchFiles(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.utils.FileUtils.FILE_TYPES fileType, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/codecx/musicplayer/utils/FileUtils$FILE_TYPES;", "", "(Ljava/lang/String;I)V", "MUSIC", "PLAYLIST", "app_debug"})
    public static enum FILE_TYPES {
        /*public static final*/ MUSIC /* = new @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/codecx/musicplayer/utils/FileUtils$FILE_TYPES$MUSIC;", "Lcom/codecx/musicplayer/utils/FileUtils$FILE_TYPES;", "path", "Landroid/net/Uri;", "getPath", "()Landroid/net/Uri;", "app_debug"}) MUSIC(){
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri path = null;
    
    MUSIC() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getPath() {
        return null;
    }
} */,
        /*public static final*/ PLAYLIST /* = new PLAYLIST() */;
        
        FILE_TYPES() {
        }
    }
}
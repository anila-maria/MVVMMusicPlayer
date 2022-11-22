package com.codecx.musicplayer.musicdatabase.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0019J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00e6\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020\u0013H\u00d6\u0001J\t\u0010M\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b&\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\'\u0010\u001dR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103\u00a8\u0006N"}, d2 = {"Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "", "id", "", "title", "", "duration", "data", "dateAdded", "artist", "uri", "Landroid/net/Uri;", "albumId", "size", "bitrate", "image", "Landroid/graphics/Bitmap;", "trackNumber", "year", "", "dateModified", "artistId", "artistName", "composer", "albumArtist", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlbumArtist", "()Ljava/lang/String;", "getAlbumId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getArtist", "getArtistId", "getArtistName", "getBitrate", "getComposer", "getData", "getDateAdded", "getDateModified", "getDuration", "getId", "getImage", "()Landroid/graphics/Bitmap;", "getSize", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getTrackNumber", "getUri", "()Landroid/net/Uri;", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class SongModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long duration = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dateAdded = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String artist = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri uri = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long albumId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String size = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bitrate = null;
    @org.jetbrains.annotations.Nullable()
    private final android.graphics.Bitmap image = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String trackNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer year = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dateModified = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long artistId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String artistName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String composer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String albumArtist = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.musicdatabase.entities.SongModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Long duration, @org.jetbrains.annotations.Nullable()
    java.lang.String data, @org.jetbrains.annotations.Nullable()
    java.lang.String dateAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String artist, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.Long albumId, @org.jetbrains.annotations.Nullable()
    java.lang.String size, @org.jetbrains.annotations.Nullable()
    java.lang.String bitrate, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap image, @org.jetbrains.annotations.Nullable()
    java.lang.String trackNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateModified, @org.jetbrains.annotations.Nullable()
    java.lang.Long artistId, @org.jetbrains.annotations.Nullable()
    java.lang.String artistName, @org.jetbrains.annotations.Nullable()
    java.lang.String composer, @org.jetbrains.annotations.Nullable()
    java.lang.String albumArtist) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SongModel() {
        super();
    }
    
    public SongModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Long duration, @org.jetbrains.annotations.Nullable()
    java.lang.String data, @org.jetbrains.annotations.Nullable()
    java.lang.String dateAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String artist, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.Long albumId, @org.jetbrains.annotations.Nullable()
    java.lang.String size, @org.jetbrains.annotations.Nullable()
    java.lang.String bitrate, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap image, @org.jetbrains.annotations.Nullable()
    java.lang.String trackNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateModified, @org.jetbrains.annotations.Nullable()
    java.lang.Long artistId, @org.jetbrains.annotations.Nullable()
    java.lang.String artistName, @org.jetbrains.annotations.Nullable()
    java.lang.String composer, @org.jetbrains.annotations.Nullable()
    java.lang.String albumArtist) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAlbumId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBitrate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrackNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateModified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getArtistId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComposer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbumArtist() {
        return null;
    }
}
package com.codecx.musicplayer.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020!H\u0016J\b\u0010-\u001a\u00020\u000bH\u0016J\n\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016J\u0006\u0010/\u001a\u00020!J\b\u00100\u001a\u00020!H\u0016J\b\u00101\u001a\u00020\u000bH\u0016J\n\u00102\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020!H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u000209H\u0016J\b\u0010=\u001a\u000209H\u0016J\u0010\u0010>\u001a\u0002092\u0006\u0010;\u001a\u00020\u000bH\u0016J\b\u0010?\u001a\u000209H\u0016J\b\u0010@\u001a\u000209H\u0016J\u0010\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020!H\u0016J\u0010\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u000209H\u0016J\u0016\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004J\u0006\u0010J\u001a\u000209J\b\u0010K\u001a\u000209H\u0016J\u000e\u0010L\u001a\u0002092\u0006\u0010;\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\u001dX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020!X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%\u00a8\u0006M"}, d2 = {"Lcom/codecx/musicplayer/helper/Coordinator;", "Lcom/codecx/musicplayer/interfaces/CoordinatorInterface;", "()V", "SourceOfSelectedSong", "", "getSourceOfSelectedSong", "()Ljava/lang/String;", "setSourceOfSelectedSong", "(Ljava/lang/String;)V", "currentDataSource", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "getCurrentDataSource", "()Ljava/util/ArrayList;", "setCurrentDataSource", "(Ljava/util/ArrayList;)V", "value", "currentPlayingSong", "getCurrentPlayingSong", "()Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "setCurrentPlayingSong", "(Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;)V", "mediaPlayerAgent", "Lcom/codecx/musicplayer/helper/MediaPlayerAgent;", "getMediaPlayerAgent", "()Lcom/codecx/musicplayer/helper/MediaPlayerAgent;", "setMediaPlayerAgent", "(Lcom/codecx/musicplayer/helper/MediaPlayerAgent;)V", "nowPlayingQueue", "Lkotlin/collections/ArrayList;", "getNowPlayingQueue", "setNowPlayingQueue", "position", "", "getPosition", "()I", "setPosition", "(I)V", "repeatMode", "getRepeatMode", "setRepeatMode", "shuffleMode", "getShuffleMode", "setShuffleMode", "getCurrentSongPosition", "getNextSong", "getNextSongData", "getPositionInNowPlayingQueue", "getPositionInPlayer", "getPrevSong", "getPrevSongData", "getSongAtPosition", "hasNext", "", "hasPrev", "isPlaying", "pause", "", "play", "song", "playNextSong", "playPrevSong", "playSelectedSong", "release", "resume", "seekTo", "newPosition", "setup", "context", "Landroid/content/Context;", "stop", "takeActionBasedOnRepeatMode", "actionSource", "requestedAction", "updateCurrentPlayingSongPosition", "updateNowPlayingQueue", "updatePlayerVar", "app_debug"})
public final class Coordinator implements com.codecx.musicplayer.interfaces.CoordinatorInterface {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.helper.Coordinator INSTANCE = null;
    public static java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> nowPlayingQueue;
    public static com.codecx.musicplayer.helper.MediaPlayerAgent mediaPlayerAgent;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String SourceOfSelectedSong = "library";
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> currentDataSource;
    private static int shuffleMode = android.support.v4.media.session.PlaybackStateCompat.SHUFFLE_MODE_NONE;
    private static int repeatMode = android.support.v4.media.session.PlaybackStateCompat.REPEAT_MODE_NONE;
    @org.jetbrains.annotations.Nullable()
    private static com.codecx.musicplayer.musicdatabase.entities.SongModel currentPlayingSong;
    private static int position;
    
    private Coordinator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getNowPlayingQueue() {
        return null;
    }
    
    @java.lang.Override()
    public void setNowPlayingQueue(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codecx.musicplayer.helper.MediaPlayerAgent getMediaPlayerAgent() {
        return null;
    }
    
    @java.lang.Override()
    public void setMediaPlayerAgent(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.helper.MediaPlayerAgent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceOfSelectedSong() {
        return null;
    }
    
    public final void setSourceOfSelectedSong(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getCurrentDataSource() {
        return null;
    }
    
    public final void setCurrentDataSource(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0) {
    }
    
    public final int getShuffleMode() {
        return 0;
    }
    
    public final void setShuffleMode(int p0) {
    }
    
    public final int getRepeatMode() {
        return 0;
    }
    
    public final void setRepeatMode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codecx.musicplayer.musicdatabase.entities.SongModel getCurrentPlayingSong() {
        return null;
    }
    
    public final void setCurrentPlayingSong(@org.jetbrains.annotations.Nullable()
    com.codecx.musicplayer.musicdatabase.entities.SongModel value) {
    }
    
    @java.lang.Override()
    public int getPosition() {
        return 0;
    }
    
    @java.lang.Override()
    public void setPosition(int p0) {
    }
    
    @java.lang.Override()
    public void setup(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public boolean isPlaying() {
        return false;
    }
    
    @java.lang.Override()
    public void playNextSong() {
    }
    
    @java.lang.Override()
    public void playPrevSong() {
    }
    
    @java.lang.Override()
    public void pause() {
    }
    
    @java.lang.Override()
    public void play(@org.jetbrains.annotations.NotNull()
    java.lang.String song) {
    }
    
    @java.lang.Override()
    public void resume() {
    }
    
    @java.lang.Override()
    public void seekTo(int newPosition) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void release() {
    }
    
    public final void takeActionBasedOnRepeatMode(@org.jetbrains.annotations.NotNull()
    java.lang.String actionSource, @org.jetbrains.annotations.NotNull()
    java.lang.String requestedAction) {
    }
    
    @java.lang.Override()
    public void updateNowPlayingQueue() {
    }
    
    public final void updateCurrentPlayingSongPosition() {
    }
    
    @java.lang.Override()
    public int getCurrentSongPosition() {
        return 0;
    }
    
    @java.lang.Override()
    public void playSelectedSong(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.SongModel song) {
    }
    
    public final void updatePlayerVar(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.SongModel song) {
    }
    
    @java.lang.Override()
    public int getPositionInPlayer() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean hasNext() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasPrev() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getPrevSongData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codecx.musicplayer.musicdatabase.entities.SongModel getPrevSong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getNextSongData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codecx.musicplayer.musicdatabase.entities.SongModel getNextSong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getSongAtPosition(int position) {
        return null;
    }
    
    public final int getPositionInNowPlayingQueue() {
        return 0;
    }
}
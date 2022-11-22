package com.codecx.musicplayer.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0011H&J\b\u0010\u0017\u001a\u00020\nH&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001a\u001a\u00020\u0011H&J\b\u0010\u001b\u001a\u00020\nH&J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0019H&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u001fH&J\b\u0010!\u001a\u00020\u001fH&J\b\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0019H&J\b\u0010&\u001a\u00020#H&J\b\u0010\'\u001a\u00020#H&J\u0010\u0010(\u001a\u00020#2\u0006\u0010%\u001a\u00020\nH&J\b\u0010)\u001a\u00020#H&J\b\u0010*\u001a\u00020#H&J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0011H&J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H&J\b\u00100\u001a\u00020#H&J\b\u00101\u001a\u00020#H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u00062"}, d2 = {"Lcom/codecx/musicplayer/interfaces/CoordinatorInterface;", "", "mediaPlayerAgent", "Lcom/codecx/musicplayer/helper/MediaPlayerAgent;", "getMediaPlayerAgent", "()Lcom/codecx/musicplayer/helper/MediaPlayerAgent;", "setMediaPlayerAgent", "(Lcom/codecx/musicplayer/helper/MediaPlayerAgent;)V", "nowPlayingQueue", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "getNowPlayingQueue", "()Ljava/util/ArrayList;", "setNowPlayingQueue", "(Ljava/util/ArrayList;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "getCurrentSongPosition", "getNextSong", "getNextSongData", "", "getPositionInPlayer", "getPrevSong", "getPrevSongData", "getSongAtPosition", "hasNext", "", "hasPrev", "isPlaying", "pause", "", "play", "song", "playNextSong", "playPrevSong", "playSelectedSong", "release", "resume", "seekTo", "newPosition", "setup", "context", "Landroid/content/Context;", "stop", "updateNowPlayingQueue", "app_debug"})
public abstract interface CoordinatorInterface {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> getNowPlayingQueue();
    
    public abstract void setNowPlayingQueue(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codecx.musicplayer.helper.MediaPlayerAgent getMediaPlayerAgent();
    
    public abstract void setMediaPlayerAgent(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.helper.MediaPlayerAgent p0);
    
    public abstract int getPosition();
    
    public abstract void setPosition(int p0);
    
    public abstract void setup(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void playNextSong();
    
    public abstract void playPrevSong();
    
    public abstract void pause();
    
    public abstract void play(@org.jetbrains.annotations.NotNull()
    java.lang.String song);
    
    public abstract void resume();
    
    public abstract void stop();
    
    public abstract void release();
    
    public abstract void updateNowPlayingQueue();
    
    public abstract boolean isPlaying();
    
    public abstract int getCurrentSongPosition();
    
    public abstract void playSelectedSong(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.SongModel song);
    
    public abstract int getPositionInPlayer();
    
    public abstract boolean hasNext();
    
    public abstract boolean hasPrev();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getPrevSongData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getNextSongData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codecx.musicplayer.musicdatabase.entities.SongModel getNextSong();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codecx.musicplayer.musicdatabase.entities.SongModel getPrevSong();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getSongAtPosition(int position);
    
    public abstract void seekTo(int newPosition);
}
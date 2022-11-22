package com.codecx.musicplayer.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/codecx/musicplayer/helper/MediaPlayerAgent;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getCurrentPosition", "", "getRemainingTimeInPercentage", "", "progressInPercentage", "isPlaying", "", "pauseMusic", "", "playAsService", "playMusic", "data", "", "resumePlaying", "seekTo", "newPosition", "seekToTime", "stop", "app_debug"})
public final class MediaPlayerAgent {
    private final android.content.Context context = null;
    private android.media.MediaPlayer mediaPlayer;
    
    public MediaPlayerAgent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void playMusic(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void playAsService() {
    }
    
    public final void pauseMusic() {
    }
    
    public final void resumePlaying() {
    }
    
    public final void seekTo(int newPosition) {
    }
    
    public final float getRemainingTimeInPercentage(float progressInPercentage) {
        return 0.0F;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final int getCurrentPosition() {
        return 0;
    }
    
    public final void seekToTime() {
    }
    
    public final void stop() {
    }
}
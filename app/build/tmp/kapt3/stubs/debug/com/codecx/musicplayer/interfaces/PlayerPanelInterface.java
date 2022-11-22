package com.codecx.musicplayer.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lcom/codecx/musicplayer/interfaces/PlayerPanelInterface;", "", "getPanelState", "", "seekTo", "mCurrentPosition", "", "seekbarHandler", "setDefaultVisibilities", "setPanelState", "setRemainingTime", "remainingTime", "setSongImage", "setSongTitle", "switchPlayPauseButton", "updateHeader", "updatePanelBasedOnState", "newState", "Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;", "app_debug"})
public abstract interface PlayerPanelInterface {
    
    public abstract void setDefaultVisibilities();
    
    public abstract void setSongImage();
    
    public abstract void setSongTitle();
    
    public abstract void getPanelState();
    
    public abstract void setPanelState();
    
    public abstract void updateHeader();
    
    public abstract void seekTo(int mCurrentPosition);
    
    public abstract void seekbarHandler();
    
    public abstract void setRemainingTime(int remainingTime);
    
    public abstract void switchPlayPauseButton();
    
    public abstract void updatePanelBasedOnState(@org.jetbrains.annotations.NotNull()
    com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState newState);
}
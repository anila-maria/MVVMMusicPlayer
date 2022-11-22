package com.codecx.musicplayer.musicgraphicalinterfaces.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J\"\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\u0006\u0010%\u001a\u00020\u000fJ\b\u0010&\u001a\u00020\u000fH\u0016J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020\u000fH\u0016J\b\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u000fH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0006\u0010.\u001a\u00020\u000fJ\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\"H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u00064"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlayerPanelFragment;", "Lcom/codecx/musicplayer/baseclasses/BaseFragment;", "Lcom/codecx/musicplayer/interfaces/PlayerPanelInterface;", "Landroid/view/View$OnClickListener;", "Lcom/frolo/waveformseekbar/WaveformSeekBar$OnSeekBarChangeListener;", "()V", "binding", "Lcom/codecx/musicplayer/databinding/FragmentPlayerPanelBinding;", "getBinding", "()Lcom/codecx/musicplayer/databinding/FragmentPlayerPanelBinding;", "setBinding", "(Lcom/codecx/musicplayer/databinding/FragmentPlayerPanelBinding;)V", "createWaveform", "", "getPanelState", "", "onClick", "v", "Landroid/view/View;", "onProgressInPercentageChanged", "seekBar", "Lcom/frolo/waveformseekbar/WaveformSeekBar;", "percent", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "seekTo", "mCurrentPosition", "", "seekbarHandler", "setDefaultVisibilities", "setOnEventListeners", "setPanelState", "setRemainingTime", "remainingTimeInPercentage", "setSongImage", "setSongTitle", "setupLayoutParams", "switchPlayPauseButton", "updateHeader", "updatePanel", "updatePanelBasedOnState", "newState", "Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;", "updateWheelProgress", "progressInPercentage", "app_debug"})
public final class PlayerPanelFragment extends com.codecx.musicplayer.baseclasses.BaseFragment implements com.codecx.musicplayer.interfaces.PlayerPanelInterface, android.view.View.OnClickListener, com.frolo.waveformseekbar.WaveformSeekBar.OnSeekBarChangeListener {
    public com.codecx.musicplayer.databinding.FragmentPlayerPanelBinding binding;
    
    public PlayerPanelFragment() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codecx.musicplayer.databinding.FragmentPlayerPanelBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.databinding.FragmentPlayerPanelBinding p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupLayoutParams() {
    }
    
    @java.lang.Override()
    public void setDefaultVisibilities() {
    }
    
    public final void setOnEventListeners() {
    }
    
    @java.lang.Override()
    public void setSongImage() {
    }
    
    public final void updatePanel() {
    }
    
    @java.lang.Override()
    public void setSongTitle() {
    }
    
    @java.lang.Override()
    public void getPanelState() {
    }
    
    @java.lang.Override()
    public void setPanelState() {
    }
    
    @java.lang.Override()
    public void updateHeader() {
    }
    
    @java.lang.Override()
    public void seekTo(int mCurrentPosition) {
    }
    
    @java.lang.Override()
    public void seekbarHandler() {
    }
    
    @java.lang.Override()
    public void switchPlayPauseButton() {
    }
    
    @java.lang.Override()
    public void updatePanelBasedOnState(@org.jetbrains.annotations.NotNull()
    com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState newState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final int[] createWaveform() {
        return null;
    }
    
    @java.lang.Override()
    public void setRemainingTime(int remainingTimeInPercentage) {
    }
    
    private final void updateWheelProgress(int progressInPercentage) {
    }
    
    @java.lang.Override()
    public void onProgressInPercentageChanged(@org.jetbrains.annotations.Nullable()
    com.frolo.waveformseekbar.WaveformSeekBar seekBar, float percent, boolean fromUser) {
    }
    
    @java.lang.Override()
    public void onStartTrackingTouch(@org.jetbrains.annotations.Nullable()
    com.frolo.waveformseekbar.WaveformSeekBar seekBar) {
    }
    
    @java.lang.Override()
    public void onStopTrackingTouch(@org.jetbrains.annotations.Nullable()
    com.frolo.waveformseekbar.WaveformSeekBar seekBar) {
    }
}
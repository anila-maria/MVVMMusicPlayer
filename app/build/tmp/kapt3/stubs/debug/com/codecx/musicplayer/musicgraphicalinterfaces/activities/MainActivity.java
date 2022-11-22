package com.codecx.musicplayer.musicgraphicalinterfaces.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0015J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\u0006\u0010\u001a\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/activities/MainActivity;", "Lcom/codecx/musicplayer/baseclasses/BaseActivity;", "()V", "binding", "Lcom/codecx/musicplayer/databinding/ActivityMainBinding;", "getBinding", "()Lcom/codecx/musicplayer/databinding/ActivityMainBinding;", "permissions", "", "", "[Ljava/lang/String;", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "setPrefs", "(Landroid/content/SharedPreferences;)V", "checkForPermissions", "", "initBottomSheet", "initMainFragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "updateVisibility", "Companion", "app_debug"})
public final class MainActivity extends com.codecx.musicplayer.baseclasses.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.musicgraphicalinterfaces.activities.MainActivity.Companion Companion = null;
    private static boolean permissionsGranted = false;
    public static com.codecx.musicplayer.musicgraphicalinterfaces.Fragments.PlayerPanelFragment playerPanelFragment;
    public static com.codecx.musicplayer.musicgraphicalinterfaces.activities.MainActivity activity;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences prefs;
    private final java.lang.String[] permissions = {"android.permission.READ_EXTERNAL_STORAGE"};
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    private final com.codecx.musicplayer.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void updateVisibility() {
    }
    
    private final void checkForPermissions() {
    }
    
    private final void initBottomSheet() {
    }
    
    private final void initMainFragment() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/codecx/musicplayer/musicgraphicalinterfaces/activities/MainActivity$Companion;", "", "()V", "activity", "Lcom/codecx/musicplayer/musicgraphicalinterfaces/activities/MainActivity;", "getActivity", "()Lcom/codecx/musicplayer/musicgraphicalinterfaces/activities/MainActivity;", "setActivity", "(Lcom/codecx/musicplayer/musicgraphicalinterfaces/activities/MainActivity;)V", "permissionsGranted", "", "getPermissionsGranted", "()Z", "setPermissionsGranted", "(Z)V", "playerPanelFragment", "Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlayerPanelFragment;", "getPlayerPanelFragment", "()Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlayerPanelFragment;", "setPlayerPanelFragment", "(Lcom/codecx/musicplayer/musicgraphicalinterfaces/Fragments/PlayerPanelFragment;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getPermissionsGranted() {
            return false;
        }
        
        public final void setPermissionsGranted(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.musicgraphicalinterfaces.Fragments.PlayerPanelFragment getPlayerPanelFragment() {
            return null;
        }
        
        public final void setPlayerPanelFragment(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicgraphicalinterfaces.Fragments.PlayerPanelFragment p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codecx.musicplayer.musicgraphicalinterfaces.activities.MainActivity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull()
        com.codecx.musicplayer.musicgraphicalinterfaces.activities.MainActivity p0) {
        }
    }
}
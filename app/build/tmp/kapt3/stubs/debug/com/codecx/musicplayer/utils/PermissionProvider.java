package com.codecx.musicplayer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\u00a2\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/codecx/musicplayer/utils/PermissionProvider;", "Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;", "()V", "PERMISSIONS_REQUEST_CODE", "", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "permissionIsGranted", "", "getPermissionIsGranted", "()Z", "setPermissionIsGranted", "(Z)V", "askForPermission", "", "permissions", "", "", "(Landroid/app/Activity;[Ljava/lang/String;)V", "hasPermissions", "context", "Landroid/content/Context;", "(Landroid/content/Context;[Ljava/lang/String;)Z", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
public final class PermissionProvider implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback {
    private boolean permissionIsGranted = false;
    private final int PERMISSIONS_REQUEST_CODE = 1;
    public android.app.Activity activity;
    
    public PermissionProvider() {
        super();
    }
    
    public final boolean getPermissionIsGranted() {
        return false;
    }
    
    public final void setPermissionIsGranted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    public final void askForPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
    }
    
    private final boolean hasPermissions(android.content.Context context, java.lang.String... permissions) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
}
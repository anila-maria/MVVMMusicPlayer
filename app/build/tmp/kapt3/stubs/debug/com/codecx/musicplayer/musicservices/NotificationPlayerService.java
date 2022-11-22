package com.codecx.musicplayer.musicservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0017J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/codecx/musicplayer/musicservices/NotificationPlayerService;", "Landroid/app/Service;", "()V", "broadcastNotificationReceiver", "Landroid/content/BroadcastReceiver;", "notification", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "setNotification", "(Landroid/app/Notification;)V", "createNotificationChannel", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "onTaskRemoved", "rootIntent", "unregisterReceiver", "Companion", "app_debug"})
public final class NotificationPlayerService extends android.app.Service {
    public android.app.Notification notification;
    @org.jetbrains.annotations.NotNull()
    public static final com.codecx.musicplayer.musicservices.NotificationPlayerService.Companion Companion = null;
    private final android.content.BroadcastReceiver broadcastNotificationReceiver = null;
    
    public NotificationPlayerService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification getNotification() {
        return null;
    }
    
    public final void setNotification(@org.jetbrains.annotations.NotNull()
    android.app.Notification p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void createNotificationChannel() {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    public final void unregisterReceiver() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/codecx/musicplayer/musicservices/NotificationPlayerService$Companion;", "", "()V", "startNotification", "", "context", "Landroid/content/Context;", "message", "", "stopNotification", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void startNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void stopNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}
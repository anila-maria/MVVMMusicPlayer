package com.codecx.musicplayer.musicservices

import android.annotation.SuppressLint
import android.app.*
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Color
import android.os.Build
import android.os.IBinder
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.codecx.musicplayer.R
import com.codecx.musicplayer.helper.Coordinator
import com.codecx.musicplayer.musicgraphicalinterfaces.activities.MainActivity


class NotificationPlayerService : Service() {


    lateinit var notification: Notification

    companion object {

        fun startNotification(context: Context, message: String) {
            val intent = Intent(context, NotificationPlayerService::class.java)
            intent.putExtra("inputExtra", message)
            ContextCompat.startForegroundService(context, intent)
        }

        fun stopNotification(context: Context) {
            val intent = Intent(context, NotificationPlayerService::class.java)
            context.stopService(intent)
        }
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)

        createNotificationChannel()

        try {
            registerReceiver(broadcastNotificationReceiver, IntentFilter("Songs"))
        } catch (e: Exception) {
        }


        val notificationIntent = Intent(this, MainActivity::class.java)


        val mediaSession = android.support.v4.media.session.MediaSessionCompat(
            this,
            "notif"
        )


        val style = androidx.media.app.NotificationCompat.MediaStyle()
            .setMediaSession(mediaSession.sessionToken)
            .setShowCancelButton(false)


        val intentNext = Intent(this, NotificationBroadcastReceiver::class.java)
            .setAction(getString(R.string.notification_action_next))
        val nextPendingIntent =
            PendingIntent.getBroadcast(
                this,
                0,
                intentNext,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

        val intentPlay = Intent(this, NotificationBroadcastReceiver::class.java)
            .setAction(getString(R.string.notification_action_play))
        val playPendingIntent =
            PendingIntent.getBroadcast(this, 0, intentPlay, PendingIntent.FLAG_UPDATE_CURRENT  or PendingIntent.FLAG_IMMUTABLE)

        val intentPause = Intent(this, NotificationBroadcastReceiver::class.java)
            .setAction(getString(R.string.notification_action_pause))
        val pausePendingIntent =
            PendingIntent.getBroadcast(this, 0, intentPause, PendingIntent.FLAG_UPDATE_CURRENT  or PendingIntent.FLAG_IMMUTABLE)

        val intentPrev = Intent(this, NotificationBroadcastReceiver::class.java)
            .setAction(getString(R.string.notification_action_previous))
        val prevPendingIntent =
            PendingIntent.getBroadcast(this, 0, intentPrev, PendingIntent.FLAG_UPDATE_CURRENT  or PendingIntent.FLAG_IMMUTABLE)


        notification = NotificationCompat.Builder(this, getString(R.string.notification_channel_id))
            .setContentTitle(Coordinator.currentPlayingSong?.title)
            .setNotificationSilent()
            .setContentText(Coordinator.currentPlayingSong?.artistName ?: "")
            .setStyle(style)
            .setAutoCancel(true)
            .setColor(Color.BLUE)
            .setStyle(
                androidx.media.app.NotificationCompat.MediaStyle().setShowActionsInCompactView(
                    0,
                    1,
                    2,
                    3,
                    4
                )
            )
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setSmallIcon(R.drawable.ic_play__2_)
            .setLargeIcon(Coordinator.currentPlayingSong?.image)
            .addAction(R.drawable.ic_notification_previous, "previous", prevPendingIntent)
            .addAction(R.drawable.ic_notification_play, "play", playPendingIntent)
            .addAction(R.drawable.ic_notification_pause, "pause", pausePendingIntent)
            .addAction(R.drawable.ic_notification_next, "next", nextPendingIntent)
            .build()
//            .setContentIntent(pendingIntent)

        startForeground(1, notification)

        return START_NOT_STICKY
    }


    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                getString(R.string.notification_channel_id), "Foreground Service Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            serviceChannel.description =
                getString(R.string.notification_description)
            val manager = getSystemService(NotificationManager::class.java)
            manager!!.createNotificationChannel(serviceChannel)
        }
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        stopSelf()
        unregisterReceiver()
        onDestroy()
    }

    fun unregisterReceiver() {
        unregisterReceiver(broadcastNotificationReceiver)
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


    private val broadcastNotificationReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        @RequiresApi(Build.VERSION_CODES.O)
        override fun onReceive(context: Context, intent: Intent) {
            when (intent.extras!!.getString(context.getString(R.string.extra_key))) {
                getString(R.string.notification_action_next) -> Coordinator.playNextSong()
                getString(R.string.notification_action_play) -> {
                    Coordinator.resume()
                }
                getString(R.string.notification_action_pause) -> {
                    Coordinator.pause()
                }
                getString(R.string.notification_action_previous) -> Coordinator.playPrevSong()
            }

        }
    }
}
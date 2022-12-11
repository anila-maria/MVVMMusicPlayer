package com.utils

import android.graphics.Point
import com.musicgraphicalinterfaces.activities.MainActivity

object ScreenSizeUtils {
    fun getScreenHeight(): Int {
        val display = MainActivity.activity.windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)
        return size.y
    }

    fun getScreenWidth(): Int {
        val display = MainActivity.activity.windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)
        return size.x
    }

}
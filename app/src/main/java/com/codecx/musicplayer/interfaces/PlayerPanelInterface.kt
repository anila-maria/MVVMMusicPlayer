package com.codecx.musicplayer.interfaces

import com.sothree.slidinguppanel.SlidingUpPanelLayout

interface PlayerPanelInterface {
    fun setDefaultVisibilities()
    fun setSongImage()
    fun setSongTitle()

    //    for slidingup panel
    fun getPanelState()
    fun setPanelState()
    fun updateHeader() //if panl is collapsed or expanded


    //    for seekbar
    fun seekTo(mCurrentPosition: Int)
    fun seekbarHandler()
    fun setRemainingTime(remainingTime: Int)


    fun switchPlayPauseButton()  //change play btn to pause and vice versa

    fun updatePanelBasedOnState(newState: SlidingUpPanelLayout.PanelState)


}
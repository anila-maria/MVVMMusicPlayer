package com.utils

import com.musicdatabase.entities.SongModel
import com.repo.RoomRepository

fun SongModel.isFavorite(): Boolean
{
    for (favSongs in RoomRepository.cachedFavArray) {
        if (favSongs.id!!.equals(this.id)) {
            return true
        }
    }
    return false
}
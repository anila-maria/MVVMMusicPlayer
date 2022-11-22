package com.interfaces

import com.musicdatabase.entities.SongModel

interface PlaylistPageRepositoryInterface
{
   suspend fun getSongsIdFromDatabase(): String
   suspend fun songsIdToSongModelConverter(songId: String): SongModel?
   suspend fun  getSongs(): ArrayList<SongModel>
}
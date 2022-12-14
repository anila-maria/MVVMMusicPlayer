package com.codecx.musicplayer.musicdatabase

import androidx.room.*
import com.codecx.musicplayer.musicdatabase.entities.Favorites

@Dao
interface FavoriteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSong(song: Favorites)

    @Delete
    suspend fun deleteSong(song: Favorites)

    @Query("DELETE FROM playlist_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM favorites_table")
    fun getFavs(): List<Favorites>
}

//@Query("DELETE FROM favorites_table WHERE songId = :songId")
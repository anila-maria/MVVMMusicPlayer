package com.codecx.musicplayer.interfaces

import com.codecx.musicplayer.musicdatabase.entities.Favorites
import com.codecx.musicplayer.musicdatabase.entities.PlaylistModel
import com.codecx.musicplayer.musicdatabase.entities.SongModel

interface RoomRepositoryInterface {

    // ----------------------- init Database ------------------------
    fun createDatabase()


    // ----------------------- playlist ------------------------
    fun createPlaylist(playlist: PlaylistModel)
    fun removePlaylist(id: Long): Boolean
    fun getPlaylists(): ArrayList<PlaylistModel>
    fun addSongsToPlaylist(playlist_name: String, songsId: String): Boolean
    fun removeSongFromPlaylist(playlistId: Long, songsId: String)
    fun listOfPlaylistsContainSpecificSong(songId: Long): ArrayList<Long>
    fun removeSongFromPlaylistObject(playlist: PlaylistModel, songsId: String) //check
    fun decreaseCountInDatabase(playlistId: Long, countOfSongs: Int)
    fun increaseCountInPlaylistObject(playlist: PlaylistModel)
    fun increaseCountInDatabase(playlist: PlaylistModel)
    fun addSongsToPlaylistInObject(playlist: PlaylistModel, songsId: String) //check
    fun addSongsToPlaylistInDatabase(playlist: PlaylistModel, songsId: String)
    fun getPlaylistFromDatabase(): ArrayList<PlaylistModel>


    fun updateCachedPlaylist()
    fun findPlaylistPositionInCachedArray(playlist: PlaylistModel): Int
    fun getIdByName(name: String): Long
    fun getPlaylistById(id: Long): PlaylistModel?


    // ----------------------- favorite ------------------------

    fun addSongToFavorites(songsId: Long)
    fun removeSongFromFavorites(song: SongModel)
    fun getFavoritesFromDatabase(): ArrayList<Favorites>
    fun convertFavSongsToRealSongs(): ArrayList<SongModel>
    fun songsIdToSongModelConverter(favSong: Favorites): SongModel?
}
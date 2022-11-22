package com.codecx.musicplayer.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\tH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\tH&J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000fj\b\u0012\u0004\u0012\u00020\u001a`\u0011H&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\tH&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u0005H&J\u0018\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000fj\b\u0012\u0004\u0012\u00020\f`\u0011H&J\u0018\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\f0\u000fj\b\u0012\u0004\u0012\u00020\f`\u0011H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J \u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u00112\u0006\u0010$\u001a\u00020\u0005H&J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u0010H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tH&J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\tH&J\u0012\u0010*\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u001aH&J\b\u0010,\u001a\u00020\u0003H&\u00a8\u0006-"}, d2 = {"Lcom/codecx/musicplayer/interfaces/RoomRepositoryInterface;", "", "addSongToFavorites", "", "songsId", "", "addSongsToPlaylist", "", "playlist_name", "", "addSongsToPlaylistInDatabase", "playlist", "Lcom/codecx/musicplayer/musicdatabase/entities/PlaylistModel;", "addSongsToPlaylistInObject", "convertFavSongsToRealSongs", "Ljava/util/ArrayList;", "Lcom/codecx/musicplayer/musicdatabase/entities/SongModel;", "Lkotlin/collections/ArrayList;", "createDatabase", "createPlaylist", "decreaseCountInDatabase", "playlistId", "countOfSongs", "", "findPlaylistPositionInCachedArray", "getFavoritesFromDatabase", "Lcom/codecx/musicplayer/musicdatabase/entities/Favorites;", "getIdByName", "name", "getPlaylistById", "id", "getPlaylistFromDatabase", "getPlaylists", "increaseCountInDatabase", "increaseCountInPlaylistObject", "listOfPlaylistsContainSpecificSong", "songId", "removePlaylist", "removeSongFromFavorites", "song", "removeSongFromPlaylist", "removeSongFromPlaylistObject", "songsIdToSongModelConverter", "favSong", "updateCachedPlaylist", "app_debug"})
public abstract interface RoomRepositoryInterface {
    
    public abstract void createDatabase();
    
    public abstract void createPlaylist(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist);
    
    public abstract boolean removePlaylist(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getPlaylists();
    
    public abstract boolean addSongsToPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String playlist_name, @org.jetbrains.annotations.NotNull()
    java.lang.String songsId);
    
    public abstract void removeSongFromPlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String songsId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<java.lang.Long> listOfPlaylistsContainSpecificSong(long songId);
    
    public abstract void removeSongFromPlaylistObject(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist, @org.jetbrains.annotations.NotNull()
    java.lang.String songsId);
    
    public abstract void decreaseCountInDatabase(long playlistId, int countOfSongs);
    
    public abstract void increaseCountInPlaylistObject(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist);
    
    public abstract void increaseCountInDatabase(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist);
    
    public abstract void addSongsToPlaylistInObject(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist, @org.jetbrains.annotations.NotNull()
    java.lang.String songsId);
    
    public abstract void addSongsToPlaylistInDatabase(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist, @org.jetbrains.annotations.NotNull()
    java.lang.String songsId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.PlaylistModel> getPlaylistFromDatabase();
    
    public abstract void updateCachedPlaylist();
    
    public abstract int findPlaylistPositionInCachedArray(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.PlaylistModel playlist);
    
    public abstract long getIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.codecx.musicplayer.musicdatabase.entities.PlaylistModel getPlaylistById(long id);
    
    public abstract void addSongToFavorites(long songsId);
    
    public abstract void removeSongFromFavorites(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.SongModel song);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.Favorites> getFavoritesFromDatabase();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<com.codecx.musicplayer.musicdatabase.entities.SongModel> convertFavSongsToRealSongs();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.codecx.musicplayer.musicdatabase.entities.SongModel songsIdToSongModelConverter(@org.jetbrains.annotations.NotNull()
    com.codecx.musicplayer.musicdatabase.entities.Favorites favSong);
}
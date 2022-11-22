package com.codecx.musicplayer.musicdatabase;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.codecx.musicplayer.musicdatabase.entities.PlaylistModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlaylistDao_Impl implements PlaylistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlaylistModel> __insertionAdapterOfPlaylistModel;

  private final SharedSQLiteStatement __preparedStmtOfDeletePlaylist;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfAddSongToPlaylist;

  private final SharedSQLiteStatement __preparedStmtOfSetCountOfSongs;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSongs;

  public PlaylistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlaylistModel = new EntityInsertionAdapter<PlaylistModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `playlist_table` (`name`,`countOfSongs`,`songs`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getCountOfSongs());
        if (value.getSongs() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSongs());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeletePlaylist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM playlist_table WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM playlist_table";
        return _query;
      }
    };
    this.__preparedStmtOfAddSongToPlaylist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE playlist_table SET songs=? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetCountOfSongs = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE playlist_table SET countOfSongs = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSongs = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE playlist_table SET songs = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object addPlaylist(final PlaylistModel playlist,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPlaylistModel.insert(playlist);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deletePlaylist(final long playlistId,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePlaylist.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, playlistId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeletePlaylist.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object addSongToPlaylist(final long id, final String songs,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfAddSongToPlaylist.acquire();
        int _argIndex = 1;
        if (songs == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, songs);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfAddSongToPlaylist.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public void setCountOfSongs(final long id, final int count) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetCountOfSongs.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, count);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetCountOfSongs.release(_stmt);
    }
  }

  @Override
  public void updateSongs(final long id, final String songs) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSongs.acquire();
    int _argIndex = 1;
    if (songs == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, songs);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateSongs.release(_stmt);
    }
  }

  @Override
  public List<PlaylistModel> getPlaylists() {
    final String _sql = "SELECT * FROM playlist_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCountOfSongs = CursorUtil.getColumnIndexOrThrow(_cursor, "countOfSongs");
      final int _cursorIndexOfSongs = CursorUtil.getColumnIndexOrThrow(_cursor, "songs");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<PlaylistModel> _result = new ArrayList<PlaylistModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PlaylistModel _item;
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final int _tmpCountOfSongs;
        _tmpCountOfSongs = _cursor.getInt(_cursorIndexOfCountOfSongs);
        final String _tmpSongs;
        if (_cursor.isNull(_cursorIndexOfSongs)) {
          _tmpSongs = null;
        } else {
          _tmpSongs = _cursor.getString(_cursorIndexOfSongs);
        }
        _item = new PlaylistModel(_tmpName,_tmpCountOfSongs,_tmpSongs);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getSongsOfPlaylist(final long id, final Continuation<? super String> continuation) {
    final String _sql = "SELECT songs FROM playlist_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getString(0);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public int getCountOfSongsInPlaylist(final long id) {
    final String _sql = "SELECT countOfSongs FROM playlist_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

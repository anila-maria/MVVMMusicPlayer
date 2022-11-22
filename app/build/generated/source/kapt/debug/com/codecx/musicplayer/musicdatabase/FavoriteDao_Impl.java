package com.codecx.musicplayer.musicdatabase;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.codecx.musicplayer.musicdatabase.entities.Favorites;
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
public final class FavoriteDao_Impl implements FavoriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Favorites> __insertionAdapterOfFavorites;

  private final EntityDeletionOrUpdateAdapter<Favorites> __deletionAdapterOfFavorites;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public FavoriteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavorites = new EntityInsertionAdapter<Favorites>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `favorites_table` (`songId`) VALUES (nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Favorites value) {
        stmt.bindLong(1, value.getSongId());
      }
    };
    this.__deletionAdapterOfFavorites = new EntityDeletionOrUpdateAdapter<Favorites>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorites_table` WHERE `songId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Favorites value) {
        stmt.bindLong(1, value.getSongId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM playlist_table";
        return _query;
      }
    };
  }

  @Override
  public Object addSong(final Favorites song, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavorites.insert(song);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteSong(final Favorites song, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavorites.handle(song);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
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
  public List<Favorites> getFavs() {
    final String _sql = "SELECT * FROM favorites_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSongId = CursorUtil.getColumnIndexOrThrow(_cursor, "songId");
      final List<Favorites> _result = new ArrayList<Favorites>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Favorites _item;
        final long _tmpSongId;
        _tmpSongId = _cursor.getLong(_cursorIndexOfSongId);
        _item = new Favorites(_tmpSongId);
        _result.add(_item);
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

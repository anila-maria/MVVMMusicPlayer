package com.codecx.musicplayer.musicdatabase;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyDatabase_Impl extends MyDatabase {
  private volatile PlaylistDao _playlistDao;

  private volatile FavoriteDao _favoriteDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `playlist_table` (`name` TEXT NOT NULL, `countOfSongs` INTEGER NOT NULL, `songs` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorites_table` (`songId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '92227de97efc11f55d98c868a01efbff')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `playlist_table`");
        _db.execSQL("DROP TABLE IF EXISTS `favorites_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPlaylistTable = new HashMap<String, TableInfo.Column>(4);
        _columnsPlaylistTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistTable.put("countOfSongs", new TableInfo.Column("countOfSongs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistTable.put("songs", new TableInfo.Column("songs", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylistTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlaylistTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlaylistTable = new TableInfo("playlist_table", _columnsPlaylistTable, _foreignKeysPlaylistTable, _indicesPlaylistTable);
        final TableInfo _existingPlaylistTable = TableInfo.read(_db, "playlist_table");
        if (! _infoPlaylistTable.equals(_existingPlaylistTable)) {
          return new RoomOpenHelper.ValidationResult(false, "playlist_table(com.codecx.musicplayer.musicdatabase.entities.PlaylistModel).\n"
                  + " Expected:\n" + _infoPlaylistTable + "\n"
                  + " Found:\n" + _existingPlaylistTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoritesTable = new HashMap<String, TableInfo.Column>(1);
        _columnsFavoritesTable.put("songId", new TableInfo.Column("songId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoritesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoritesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoritesTable = new TableInfo("favorites_table", _columnsFavoritesTable, _foreignKeysFavoritesTable, _indicesFavoritesTable);
        final TableInfo _existingFavoritesTable = TableInfo.read(_db, "favorites_table");
        if (! _infoFavoritesTable.equals(_existingFavoritesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "favorites_table(com.codecx.musicplayer.musicdatabase.entities.Favorites).\n"
                  + " Expected:\n" + _infoFavoritesTable + "\n"
                  + " Found:\n" + _existingFavoritesTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "92227de97efc11f55d98c868a01efbff", "5b23aee4802cf9e49a932d5ea47e4bf8");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "playlist_table","favorites_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `playlist_table`");
      _db.execSQL("DELETE FROM `favorites_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PlaylistDao.class, PlaylistDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FavoriteDao.class, FavoriteDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public PlaylistDao playlistDao() {
    if (_playlistDao != null) {
      return _playlistDao;
    } else {
      synchronized(this) {
        if(_playlistDao == null) {
          _playlistDao = new PlaylistDao_Impl(this);
        }
        return _playlistDao;
      }
    }
  }

  @Override
  public FavoriteDao favoriteDao() {
    if (_favoriteDao != null) {
      return _favoriteDao;
    } else {
      synchronized(this) {
        if(_favoriteDao == null) {
          _favoriteDao = new FavoriteDao_Impl(this);
        }
        return _favoriteDao;
      }
    }
  }
}

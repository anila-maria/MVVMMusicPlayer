package com.codecx.musicplayer;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.codecx.musicplayer.databinding.ActivityMainBindingImpl;
import com.codecx.musicplayer.databinding.ActivitySplashBindingImpl;
import com.codecx.musicplayer.databinding.AddSongToPlaylistDialogItemBindingImpl;
import com.codecx.musicplayer.databinding.ComponentAppbarBindingImpl;
import com.codecx.musicplayer.databinding.FavRvItemBindingImpl;
import com.codecx.musicplayer.databinding.FragmentFavoriteBindingImpl;
import com.codecx.musicplayer.databinding.FragmentLibraryBindingImpl;
import com.codecx.musicplayer.databinding.FragmentMainBindingImpl;
import com.codecx.musicplayer.databinding.FragmentPlaylistBindingImpl;
import com.codecx.musicplayer.databinding.FragmentPlaylistPageBindingImpl;
import com.codecx.musicplayer.databinding.PanelHeaderOnCollapsedBindingImpl;
import com.codecx.musicplayer.databinding.PanelHeaderOnExpandedBindingImpl;
import com.codecx.musicplayer.databinding.PlaylistItemBindingImpl;
import com.codecx.musicplayer.databinding.PlaylistSongRvItemBindingImpl;
import com.codecx.musicplayer.databinding.SongRvItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_ADDSONGTOPLAYLISTDIALOGITEM = 3;

  private static final int LAYOUT_COMPONENTAPPBAR = 4;

  private static final int LAYOUT_FAVRVITEM = 5;

  private static final int LAYOUT_FRAGMENTFAVORITE = 6;

  private static final int LAYOUT_FRAGMENTLIBRARY = 7;

  private static final int LAYOUT_FRAGMENTMAIN = 8;

  private static final int LAYOUT_FRAGMENTPLAYLIST = 9;

  private static final int LAYOUT_FRAGMENTPLAYLISTPAGE = 10;

  private static final int LAYOUT_PANELHEADERONCOLLAPSED = 11;

  private static final int LAYOUT_PANELHEADERONEXPANDED = 12;

  private static final int LAYOUT_PLAYLISTITEM = 13;

  private static final int LAYOUT_PLAYLISTSONGRVITEM = 14;

  private static final int LAYOUT_SONGRVITEM = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.add_song_to_playlist_dialog_item, LAYOUT_ADDSONGTOPLAYLISTDIALOGITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.component_appbar, LAYOUT_COMPONENTAPPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.fav_rv_item, LAYOUT_FAVRVITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.fragment_favorite, LAYOUT_FRAGMENTFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.fragment_library, LAYOUT_FRAGMENTLIBRARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.fragment_playlist, LAYOUT_FRAGMENTPLAYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.fragment_playlist_page, LAYOUT_FRAGMENTPLAYLISTPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.panel_header_on_collapsed, LAYOUT_PANELHEADERONCOLLAPSED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.panel_header_on_expanded, LAYOUT_PANELHEADERONEXPANDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.playlist_item, LAYOUT_PLAYLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.playlist_song_rv_item, LAYOUT_PLAYLISTSONGRVITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codecx.musicplayer.R.layout.song_rv_item, LAYOUT_SONGRVITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ADDSONGTOPLAYLISTDIALOGITEM: {
          if ("layout/add_song_to_playlist_dialog_item_0".equals(tag)) {
            return new AddSongToPlaylistDialogItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_song_to_playlist_dialog_item is invalid. Received: " + tag);
        }
        case  LAYOUT_COMPONENTAPPBAR: {
          if ("layout/component_appbar_0".equals(tag)) {
            return new ComponentAppbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for component_appbar is invalid. Received: " + tag);
        }
        case  LAYOUT_FAVRVITEM: {
          if ("layout/fav_rv_item_0".equals(tag)) {
            return new FavRvItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fav_rv_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITE: {
          if ("layout/fragment_favorite_0".equals(tag)) {
            return new FragmentFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIBRARY: {
          if ("layout/fragment_library_0".equals(tag)) {
            return new FragmentLibraryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_library is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYLIST: {
          if ("layout/fragment_playlist_0".equals(tag)) {
            return new FragmentPlaylistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_playlist is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLAYLISTPAGE: {
          if ("layout/fragment_playlist_page_0".equals(tag)) {
            return new FragmentPlaylistPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_playlist_page is invalid. Received: " + tag);
        }
        case  LAYOUT_PANELHEADERONCOLLAPSED: {
          if ("layout/panel_header_on_collapsed_0".equals(tag)) {
            return new PanelHeaderOnCollapsedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for panel_header_on_collapsed is invalid. Received: " + tag);
        }
        case  LAYOUT_PANELHEADERONEXPANDED: {
          if ("layout/panel_header_on_expanded_0".equals(tag)) {
            return new PanelHeaderOnExpandedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for panel_header_on_expanded is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYLISTITEM: {
          if ("layout/playlist_item_0".equals(tag)) {
            return new PlaylistItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for playlist_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYLISTSONGRVITEM: {
          if ("layout/playlist_song_rv_item_0".equals(tag)) {
            return new PlaylistSongRvItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for playlist_song_rv_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SONGRVITEM: {
          if ("layout/song_rv_item_0".equals(tag)) {
            return new SongRvItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for song_rv_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "artist");
      sKeys.put(2, "name");
      sKeys.put(3, "noOfSongs");
      sKeys.put(4, "title");
      sKeys.put(5, "tvName");
      sKeys.put(6, "versionName");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_main_0", com.codecx.musicplayer.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.codecx.musicplayer.R.layout.activity_splash);
      sKeys.put("layout/add_song_to_playlist_dialog_item_0", com.codecx.musicplayer.R.layout.add_song_to_playlist_dialog_item);
      sKeys.put("layout/component_appbar_0", com.codecx.musicplayer.R.layout.component_appbar);
      sKeys.put("layout/fav_rv_item_0", com.codecx.musicplayer.R.layout.fav_rv_item);
      sKeys.put("layout/fragment_favorite_0", com.codecx.musicplayer.R.layout.fragment_favorite);
      sKeys.put("layout/fragment_library_0", com.codecx.musicplayer.R.layout.fragment_library);
      sKeys.put("layout/fragment_main_0", com.codecx.musicplayer.R.layout.fragment_main);
      sKeys.put("layout/fragment_playlist_0", com.codecx.musicplayer.R.layout.fragment_playlist);
      sKeys.put("layout/fragment_playlist_page_0", com.codecx.musicplayer.R.layout.fragment_playlist_page);
      sKeys.put("layout/panel_header_on_collapsed_0", com.codecx.musicplayer.R.layout.panel_header_on_collapsed);
      sKeys.put("layout/panel_header_on_expanded_0", com.codecx.musicplayer.R.layout.panel_header_on_expanded);
      sKeys.put("layout/playlist_item_0", com.codecx.musicplayer.R.layout.playlist_item);
      sKeys.put("layout/playlist_song_rv_item_0", com.codecx.musicplayer.R.layout.playlist_song_rv_item);
      sKeys.put("layout/song_rv_item_0", com.codecx.musicplayer.R.layout.song_rv_item);
    }
  }
}

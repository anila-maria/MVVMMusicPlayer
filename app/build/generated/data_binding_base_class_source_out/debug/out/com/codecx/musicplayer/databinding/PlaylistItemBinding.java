// Generated by data binding compiler. Do not edit!
package com.codecx.musicplayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.codecx.musicplayer.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PlaylistItemBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView mMusic;

  @NonNull
  public final MaterialCardView playlistItem;

  @NonNull
  public final ImageView playlistMenuBtn;

  @NonNull
  public final TextView playlistName;

  @NonNull
  public final TextView songsCount;

  @Bindable
  protected String mNoOfSongs;

  @Bindable
  protected String mName;

  protected PlaylistItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView mMusic, MaterialCardView playlistItem, ImageView playlistMenuBtn,
      TextView playlistName, TextView songsCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mMusic = mMusic;
    this.playlistItem = playlistItem;
    this.playlistMenuBtn = playlistMenuBtn;
    this.playlistName = playlistName;
    this.songsCount = songsCount;
  }

  public abstract void setNoOfSongs(@Nullable String noOfSongs);

  @Nullable
  public String getNoOfSongs() {
    return mNoOfSongs;
  }

  public abstract void setName(@Nullable String name);

  @Nullable
  public String getName() {
    return mName;
  }

  @NonNull
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.playlist_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PlaylistItemBinding>inflateInternal(inflater, R.layout.playlist_item, root, attachToRoot, component);
  }

  @NonNull
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.playlist_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PlaylistItemBinding>inflateInternal(inflater, R.layout.playlist_item, null, false, component);
  }

  public static PlaylistItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static PlaylistItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (PlaylistItemBinding)bind(component, view, R.layout.playlist_item);
  }
}

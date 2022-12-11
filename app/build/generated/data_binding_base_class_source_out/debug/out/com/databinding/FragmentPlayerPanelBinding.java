// Generated by view binder compiler. Do not edit!
package com.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.R;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPlayerPanelBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout header;

  @NonNull
  public final MaterialCardView materialCardView;

  @NonNull
  public final ImageView musicAlbumImage;

  @NonNull
  public final LottieAnimationView musicAnimation;

  @NonNull
  public final TextView musicTitleTv;

  @NonNull
  public final PanelHeaderOnCollapsedBinding onCollapse;

  @NonNull
  public final PanelHeaderOnExpandedBinding onExpand;

  @NonNull
  public final LinearLayout playerPanel;

  @NonNull
  public final PlayerRemoteBinding playerRemote;

  private FragmentPlayerPanelBinding(@NonNull LinearLayout rootView,
      @NonNull ConstraintLayout header, @NonNull MaterialCardView materialCardView,
      @NonNull ImageView musicAlbumImage, @NonNull LottieAnimationView musicAnimation,
      @NonNull TextView musicTitleTv, @NonNull PanelHeaderOnCollapsedBinding onCollapse,
      @NonNull PanelHeaderOnExpandedBinding onExpand, @NonNull LinearLayout playerPanel,
      @NonNull PlayerRemoteBinding playerRemote) {
    this.rootView = rootView;
    this.header = header;
    this.materialCardView = materialCardView;
    this.musicAlbumImage = musicAlbumImage;
    this.musicAnimation = musicAnimation;
    this.musicTitleTv = musicTitleTv;
    this.onCollapse = onCollapse;
    this.onExpand = onExpand;
    this.playerPanel = playerPanel;
    this.playerRemote = playerRemote;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPlayerPanelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPlayerPanelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_player_panel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPlayerPanelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.header;
      ConstraintLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.materialCardView;
      MaterialCardView materialCardView = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView == null) {
        break missingId;
      }

      id = R.id.music_album_image;
      ImageView musicAlbumImage = ViewBindings.findChildViewById(rootView, id);
      if (musicAlbumImage == null) {
        break missingId;
      }

      id = R.id.musicAnimation;
      LottieAnimationView musicAnimation = ViewBindings.findChildViewById(rootView, id);
      if (musicAnimation == null) {
        break missingId;
      }

      id = R.id.music_title_tv;
      TextView musicTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (musicTitleTv == null) {
        break missingId;
      }

      id = R.id.onCollapse;
      View onCollapse = ViewBindings.findChildViewById(rootView, id);
      if (onCollapse == null) {
        break missingId;
      }
      PanelHeaderOnCollapsedBinding binding_onCollapse = PanelHeaderOnCollapsedBinding.bind(onCollapse);

      id = R.id.onExpand;
      View onExpand = ViewBindings.findChildViewById(rootView, id);
      if (onExpand == null) {
        break missingId;
      }
      PanelHeaderOnExpandedBinding binding_onExpand = PanelHeaderOnExpandedBinding.bind(onExpand);

      LinearLayout playerPanel = (LinearLayout) rootView;

      id = R.id.player_remote;
      View playerRemote = ViewBindings.findChildViewById(rootView, id);
      if (playerRemote == null) {
        break missingId;
      }
      PlayerRemoteBinding binding_playerRemote = PlayerRemoteBinding.bind(playerRemote);

      return new FragmentPlayerPanelBinding((LinearLayout) rootView, header, materialCardView,
          musicAlbumImage, musicAnimation, musicTitleTv, binding_onCollapse, binding_onExpand,
          playerPanel, binding_playerRemote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
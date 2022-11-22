package com.codecx.musicplayer.databinding;
import com.codecx.musicplayer.R;
import com.codecx.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FavRvItemBindingImpl extends FavRvItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fav_song_container, 3);
        sViewsWithIds.put(R.id.mMusic, 4);
        sViewsWithIds.put(R.id.fav_music_iv, 5);
        sViewsWithIds.put(R.id.music_info, 6);
        sViewsWithIds.put(R.id.like_btn, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FavRvItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FavRvItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.favSongArtist.setTag(null);
        this.favSongTitle.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.artist == variableId) {
            setArtist((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setArtist(@Nullable java.lang.String Artist) {
        this.mArtist = Artist;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.artist);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String title = mTitle;
        java.lang.String artist = mArtist;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.favSongArtist.setText(artist);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.favSongTitle.setText(title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): artist
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
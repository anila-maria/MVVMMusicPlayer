package com.codecx.musicplayer.databinding;
import com.codecx.musicplayer.R;
import com.codecx.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlaylistSongRvItemBindingImpl extends PlaylistSongRvItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.playlist_music_iv, 3);
        sViewsWithIds.put(R.id.music_info, 4);
        sViewsWithIds.put(R.id.playlist_music_menu_btn, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlaylistSongRvItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PlaylistSongRvItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            );
        this.playlistSongArtist.setTag(null);
        this.playlistSongContainer.setTag(null);
        this.playlistSongTitle.setTag(null);
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
        if (BR.artist == variableId) {
            setArtist((java.lang.String) variable);
        }
        else if (BR.name == variableId) {
            setName((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArtist(@Nullable java.lang.String Artist) {
        this.mArtist = Artist;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.artist);
        super.requestRebind();
    }
    public void setName(@Nullable java.lang.String Name) {
        this.mName = Name;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.name);
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
        java.lang.String artist = mArtist;
        java.lang.String name = mName;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.playlistSongArtist.setText(artist);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.playlistSongTitle.setText(name);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): artist
        flag 1 (0x2L): name
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
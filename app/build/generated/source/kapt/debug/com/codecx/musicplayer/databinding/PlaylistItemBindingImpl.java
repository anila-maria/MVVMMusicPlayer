package com.codecx.musicplayer.databinding;
import com.codecx.musicplayer.R;
import com.codecx.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlaylistItemBindingImpl extends PlaylistItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mMusic, 3);
        sViewsWithIds.put(R.id.playlist_menu_btn, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlaylistItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private PlaylistItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.playlistItem.setTag(null);
        this.playlistName.setTag(null);
        this.songsCount.setTag(null);
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
        if (BR.name == variableId) {
            setName((java.lang.String) variable);
        }
        else if (BR.noOfSongs == variableId) {
            setNoOfSongs((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setName(@Nullable java.lang.String Name) {
        this.mName = Name;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.name);
        super.requestRebind();
    }
    public void setNoOfSongs(@Nullable java.lang.String NoOfSongs) {
        this.mNoOfSongs = NoOfSongs;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.noOfSongs);
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
        java.lang.String name = mName;
        java.lang.String noOfSongs = mNoOfSongs;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.playlistName.setText(name);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.songsCount.setText(noOfSongs);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): name
        flag 1 (0x2L): noOfSongs
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
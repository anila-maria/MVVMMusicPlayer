package com.codecx.musicplayer.databinding;
import com.codecx.musicplayer.R;
import com.codecx.musicplayer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PanelHeaderOnCollapsedBindingImpl extends PanelHeaderOnCollapsedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mMusic, 1);
        sViewsWithIds.put(R.id.song_image_on_header, 2);
        sViewsWithIds.put(R.id.song_title_on_header, 3);
        sViewsWithIds.put(R.id.constraintLayout, 4);
        sViewsWithIds.put(R.id.wheelprogress, 5);
        sViewsWithIds.put(R.id.play_btn_on_header, 6);
        sViewsWithIds.put(R.id.pause_btn_on_header, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PanelHeaderOnCollapsedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private PanelHeaderOnCollapsedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (com.app.progresviews.ProgressWheel) bindings[5]
            );
        this.headerOnCollapsedState.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
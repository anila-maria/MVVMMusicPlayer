package com.codecx.musicplayer.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/codecx/musicplayer/recycleradapter/ViewPagerFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "arrayList", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "addFragment", "", "fragment", "createFragment", "position", "", "getItemCount", "app_debug"})
public final class ViewPagerFragmentAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.util.ArrayList<androidx.fragment.app.Fragment> arrayList = null;
    
    public ViewPagerFragmentAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifecycle) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
}
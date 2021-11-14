package com.example.wapecopy.view.sample;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class SampleViewPagerAdapter extends FragmentStateAdapter {

    private final int layoutId, tabCount;

    public SampleViewPagerAdapter(FragmentActivity fragmentActivity, int layoutId, int tabCount) {
        super(fragmentActivity);
        this.layoutId=layoutId;
        this.tabCount=tabCount;
    }

    @NotNull
    @Override
    public Fragment createFragment(int position) {
        return new SampleFragment(layoutId);
    }

    @Override public int getItemCount() { return tabCount; }
}
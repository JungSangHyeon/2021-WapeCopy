package com.example.wapecopy.news;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.wapecopy.rating.RatingListFragment;

public class ViewPagerAdapter3 extends FragmentStateAdapter {

    public ViewPagerAdapter3(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        return new NoDataFragment2();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
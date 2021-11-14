package com.example.wapecopy.myWatcha;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.wapecopy.news.NoDataFragment2;

public class ViewPagerAdapter4 extends FragmentStateAdapter {

    public ViewPagerAdapter4(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        return new NoDataFragment3();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
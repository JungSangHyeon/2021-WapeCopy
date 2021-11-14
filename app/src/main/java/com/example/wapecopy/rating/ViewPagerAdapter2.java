package com.example.wapecopy.rating;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.wapecopy.home.movie.view.MovieFragment;

public class ViewPagerAdapter2 extends FragmentStateAdapter {

    public ViewPagerAdapter2(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        return new RatingListFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
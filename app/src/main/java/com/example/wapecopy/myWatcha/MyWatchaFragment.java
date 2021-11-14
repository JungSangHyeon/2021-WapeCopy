package com.example.wapecopy.myWatcha;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.FragmentMyWatchaBinding;
import com.example.wapecopy.databinding.FragmentRatingBinding;
import com.example.wapecopy.rating.ViewPagerAdapter2;
import com.google.android.material.tabs.TabLayout;

public class MyWatchaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMyWatchaBinding binding = FragmentMyWatchaBinding.inflate(inflater, container, false);
        ViewPager2 viewPager2 = binding.storage.homeFragmentViewPager2;
        viewPager2.setAdapter(new ViewPagerAdapter4(getActivity()));
        viewPager2.setUserInputEnabled(false); // disable Swipe

        TabLayout tabLayout = binding.storage.homeFragmentTabLayout;
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override public void onTabSelected(TabLayout.Tab tab) { viewPager2.setCurrentItem(tab.getPosition()); } // Swipe
            @Override public void onTabUnselected(TabLayout.Tab tab) { }
            @Override public void onTabReselected(TabLayout.Tab tab) { }
        });
        return binding.getRoot();
    }
}
package com.example.wapecopy.view.homeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.wapecopy.databinding.FragmentHomeBinding;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentHomeBinding binding = FragmentHomeBinding.inflate(inflater, container, false);

        ViewPager2 viewPager2 = binding.homeFragmentViewPager2;
        viewPager2.setAdapter(new ViewPagerAdapter(getActivity()));
        viewPager2.setUserInputEnabled(false); // disable Swipe

        TabLayout tabLayout = binding.homeFragmentTabLayout;
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override public void onTabSelected(TabLayout.Tab tab) { viewPager2.setCurrentItem(tab.getPosition()); } // Swipe
            @Override public void onTabUnselected(TabLayout.Tab tab) { }
            @Override public void onTabReselected(TabLayout.Tab tab) { }
        });
        return binding.getRoot();
    }
}
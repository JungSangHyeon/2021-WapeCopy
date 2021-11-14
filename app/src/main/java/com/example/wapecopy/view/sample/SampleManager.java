package com.example.wapecopy.view.sample;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class SampleManager {

    public static void initSampleToTabAndPager(FragmentActivity fragmentActivity, int layoutId, TabLayout tab, ViewPager2 pager){
        pager.setAdapter(new SampleViewPagerAdapter(fragmentActivity, layoutId, tab.getTabCount()));
        pager.setUserInputEnabled(false); // disable Swipe

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override public void onTabSelected(TabLayout.Tab tab) { pager.setCurrentItem(tab.getPosition()); } // Swipe
            @Override public void onTabUnselected(TabLayout.Tab tab) { }
            @Override public void onTabReselected(TabLayout.Tab tab) { }
        });
    }

    public static void initSampleToRecyclerView(RecyclerView recyclerView, int layoutId, int count){
        recyclerView.setAdapter(new SampleAdapter(layoutId, count));
    }

}

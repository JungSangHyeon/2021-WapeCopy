package com.example.wapecopy.view.sample;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.wapecopy.R;
import com.example.wapecopy.view.homeFragment.movie.data.MovieSet;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

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

    public static ArrayList<MovieSet> getSampleMovieSet(){
        ArrayList<MovieSet> movieSets = new ArrayList<>();

        MovieSet movieSet = new MovieSet();
        movieSet.setNoImage(true);
        movieSet.setTitle("박스오피스 순위");
        movieSet.setNoDescription(true);
        movieSets.add(movieSet);

        movieSet = new MovieSet();
        movieSet.setNoImage(true);
        movieSet.setTitle("넷플릭스 프로그램 순위");
        movieSet.setNoDescription(true);
        movieSets.add(movieSet);

        movieSet = new MovieSet();
        movieSet.setImageId(R.drawable.vector_user);
        movieSet.setTitle("나는 공룡이 좋아!");
        movieSet.setDescription("정상님의 컬렉션");
        movieSets.add(movieSet);

        movieSet = new MovieSet();
        movieSet.setImageId(R.drawable.vector_star);
        movieSet.setTitle("나는 공룡이 엄청 좋아!");
        movieSet.setNoDescription(true);
        movieSets.add(movieSet);

        return movieSets;
    }
}

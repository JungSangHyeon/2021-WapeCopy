package com.example.wapecopy.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.R;
import com.example.wapecopy.view.sample.SampleManager;
import com.example.wapecopy.databinding.FragmentRatingBinding;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

public class RatingFragment extends Fragment {

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentRatingBinding binding = FragmentRatingBinding.inflate(inflater, container, false);
        ViewPager2 pager = binding.homeFragmentViewPager2;
        TabLayout tab = binding.homeFragmentTabLayout;
        SampleManager.initSampleToTabAndPager(getActivity(), R.layout.comp_movie_rating_horizontal, tab, pager);
        return binding.getRoot();
    }
}
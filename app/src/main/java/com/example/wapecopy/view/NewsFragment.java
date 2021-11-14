package com.example.wapecopy.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.wapecopy.R;
import com.example.wapecopy.view.sample.SampleManager;
import com.example.wapecopy.databinding.FragmentNewsBinding;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

public class NewsFragment extends Fragment {

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentNewsBinding binding = FragmentNewsBinding.inflate(inflater, container, false);
        ViewPager2 pager = binding.homeFragmentViewPager2;
        TabLayout tab = binding.homeFragmentTabLayout;
        SampleManager.initSampleToTabAndPager(getActivity(), R.layout.comp_no_data, tab, pager);
        return binding.getRoot();
    }
}
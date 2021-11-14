package com.example.wapecopy.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.R;
import com.example.wapecopy.view.sample.SampleManager;
import com.example.wapecopy.databinding.FragmentMyWatchaBinding;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

public class MyWatchaFragment extends Fragment {

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMyWatchaBinding binding = FragmentMyWatchaBinding.inflate(inflater, container, false);
        ViewPager2 pager = binding.storage.homeFragmentViewPager2;
        TabLayout tab = binding.storage.homeFragmentTabLayout;
        SampleManager.initSampleToTabAndPager(getActivity(), R.layout.layout_storage, tab, pager);
        return binding.getRoot();
    }
}
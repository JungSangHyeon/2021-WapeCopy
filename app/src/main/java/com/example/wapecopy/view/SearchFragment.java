package com.example.wapecopy.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.R;
import com.example.wapecopy.view.sample.SampleManager;
import com.example.wapecopy.databinding.FragmentSearchBinding;

import org.jetbrains.annotations.NotNull;

public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentSearchBinding binding = FragmentSearchBinding.inflate(inflater, container, false);

        RecyclerView recentMovie = binding.searchFragmentRecentMoviewRecyclerView;
        SampleManager.initSampleToRecyclerView(recentMovie, R.layout.comp_movie_image, 10);

        RecyclerView popularMovie = binding.searchFragmentPopularMovieRecyclerView;
        SampleManager.initSampleToRecyclerView(popularMovie, R.layout.comp_movie_horizontal, 10);

        return binding.getRoot();
    }
}
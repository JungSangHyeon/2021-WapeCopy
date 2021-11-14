package com.example.wapecopy.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentSearchBinding binding = FragmentSearchBinding.inflate(inflater, container, false);
        binding.searchFragmentRecentMoviewRecyclerView.setAdapter(new SimpleAdapter(R.layout.comp_movie_image));
        binding.searchFragmentPopularMovieRecyclerView.setAdapter(new SimpleAdapter(R.layout.comp_movie_horizontal));
        return binding.getRoot();
    }
}
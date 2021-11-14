package com.example.wapecopy.view.homeFragment.movie.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.wapecopy.databinding.FragmentMovieBinding;
import com.example.wapecopy.view.homeFragment.movie.data.MovieSet;
import com.example.wapecopy.view.sample.SampleManager;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    private final ArrayList<MovieSet> movies = SampleManager.getSampleMovieSet();

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMovieBinding binding = FragmentMovieBinding.inflate(inflater, container, false);
        binding.movieFragmentRecyclerView.setAdapter(new MovieSetAdapter(movies));
        return binding.getRoot();
    }
}
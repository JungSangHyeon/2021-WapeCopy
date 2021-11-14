package com.example.wapecopy.view.homeFragment.movie.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.databinding.FragmentMovieBinding;
import com.example.wapecopy.view.homeFragment.movie.data.MovieSet;
import com.example.wapecopy.view.homeFragment.movie.test.TestMoviesCreate;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    private final ArrayList<MovieSet> movies = TestMoviesCreate.create();

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMovieBinding binding = FragmentMovieBinding.inflate(inflater, container, false);
        binding.movieFragmentRecyclerView.setAdapter(new MovieSetAdapter(movies));
        return binding.getRoot();
    }
}
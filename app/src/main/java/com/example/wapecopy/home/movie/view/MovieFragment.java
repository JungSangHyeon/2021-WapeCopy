package com.example.wapecopy.home.movie.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wapecopy.databinding.FragmentMovieBinding;
import com.example.wapecopy.home.movie.data.MovieSet;
import com.example.wapecopy.home.movie.test.TestMoviesCreate;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    private ArrayList<MovieSet> movies = TestMoviesCreate.create();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMovieBinding binding = FragmentMovieBinding.inflate(inflater, container, false);
        binding.movieFragmentRecyclerView.setAdapter(new MovieSetAdapter(movies));
        return binding.getRoot();
    }
}
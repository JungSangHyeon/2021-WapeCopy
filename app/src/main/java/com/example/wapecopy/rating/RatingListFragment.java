package com.example.wapecopy.rating;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.FragmentMovieBinding;
import com.example.wapecopy.databinding.FragmentRatingListBinding;
import com.example.wapecopy.home.movie.data.MovieSet;
import com.example.wapecopy.home.movie.test.TestMoviesCreate;
import com.example.wapecopy.home.movie.view.MovieSetAdapter;
import com.example.wapecopy.search.SimpleAdapter;

import java.util.ArrayList;

public class RatingListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentRatingListBinding binding = FragmentRatingListBinding.inflate(inflater, container, false);
        binding.ratingListFragmentRecyclerView.setAdapter(new SimpleAdapter(R.layout.comp_movie_rating_horizontal));
        return binding.getRoot();
    }
}
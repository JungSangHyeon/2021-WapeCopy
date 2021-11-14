package com.example.wapecopy.rating;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.CompRatingListBinding;
import com.example.wapecopy.search.SimpleAdapter;

public class RatingListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CompRatingListBinding binding = CompRatingListBinding.inflate(inflater, container, false);
        binding.ratingListFragmentRecyclerView.setAdapter(new SimpleAdapter(R.layout.comp_movie_rating_horizontal));
        return binding.getRoot();
    }
}
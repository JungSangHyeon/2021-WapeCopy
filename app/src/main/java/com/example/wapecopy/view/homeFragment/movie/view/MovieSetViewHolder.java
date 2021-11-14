package com.example.wapecopy.view.homeFragment.movie.view;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wapecopy.databinding.CompMovieSetBinding;
import com.example.wapecopy.view.homeFragment.movie.data.MovieSet;

public class MovieSetViewHolder extends RecyclerView.ViewHolder {

    private CompMovieSetBinding binding;

    public MovieSetViewHolder(CompMovieSetBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }

    public void update(MovieSet movieSet) {
        binding.movieSetCompTitleTextView.setText(movieSet.getTitle());

        if(movieSet.isNoDescription()) binding.movieSetCompDescriptionTextView.setVisibility(View.GONE);
        else binding.movieSetCompDescriptionTextView.setText(movieSet.getDescription());

        if(movieSet.isNoImage()) binding.movieSetCompProfileImageView.setVisibility(View.GONE);
        else binding.movieSetCompProfileImageView.setImageResource(movieSet.getImageId());

        binding.movieSetCompRecyclerView.setAdapter(new MovieVerticalAdapter(movieSet.getMovies()));
    }
}
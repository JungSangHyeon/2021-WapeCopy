package com.example.wapecopy.view.homeFragment.movie.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wapecopy.databinding.CompMovieSetBinding;
import com.example.wapecopy.view.homeFragment.movie.data.MovieSet;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MovieSetAdapter extends RecyclerView.Adapter<MovieSetViewHolder> {

    private final ArrayList<MovieSet> movies;

    public MovieSetAdapter(ArrayList<MovieSet> movies) { this.movies = movies; }

    @NotNull
    @Override
    public MovieSetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CompMovieSetBinding binding = CompMovieSetBinding.inflate(inflater, parent, false);
        return new MovieSetViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MovieSetViewHolder holder, int position) {
        holder.update(movies.get(position));
    }

    @Override public int getItemCount() { return movies.size(); }
}

package com.example.wapecopy.home.movie.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wapecopy.databinding.CompMovieVerticalBinding;
import com.example.wapecopy.home.movie.data.MovieVertical;

import java.util.ArrayList;

public class MovieVerticalAdapter extends RecyclerView.Adapter<MovieVerticalViewHolder> {

    private ArrayList<MovieVertical> movies;

    public MovieVerticalAdapter(ArrayList<MovieVertical> movies) {
        this.movies=movies;
    }

    @Override
    public MovieVerticalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CompMovieVerticalBinding binding = CompMovieVerticalBinding.inflate(inflater, parent,false);
        return new MovieVerticalViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MovieVerticalViewHolder holder, int position) {
//        holder.update(movies.get(position), position); // 영화 추가할게 너무 많아서요...ㅎㅎ;
        holder.update(position);
    }

    @Override
    public int getItemCount() {
//        return movies.size();
        return 10;
    }
}

package com.example.wapecopy.home.movie.view;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.CompMovieVerticalBinding;
import com.example.wapecopy.home.movie.data.MovieVertical;

public class MovieVerticalViewHolder extends RecyclerView.ViewHolder {

    private CompMovieVerticalBinding binding;
    private String averageRating;

    public MovieVerticalViewHolder(CompMovieVerticalBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
        this.averageRating = itemView.getContext().getString(R.string.averageRating);
    }

    public void update(MovieVertical movie, int position) {
        binding.movieVerticalCompImageView.setImageResource(movie.getImageId());
        binding.movieVerticalCompTitleTextView.setText(movie.getTitle());
        binding.movieVerticalCompRatingTextView.setText(this.averageRating+movie.getRating());
        binding.movieVerticalCompInnerTextView.setText(Integer.toString(position+1)); // 1~n
    }
    public void update( int position) {
        binding.movieVerticalCompInnerTextView.setText(Integer.toString(position+1)); // 1~n
    }
}

package com.example.wapecopy.view.homeFragment.movie.view;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.CompMovieVerticalBinding;

public class MovieVerticalViewHolder extends RecyclerView.ViewHolder {

    private final CompMovieVerticalBinding binding;
    private final String averageRating;

    public MovieVerticalViewHolder(CompMovieVerticalBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
        this.averageRating = itemView.getContext().getString(R.string.averageRating);
    }

//    @SuppressLint("SetTextI18n")
//    public void update(MovieVertical movie, int position) {
//        binding.movieVerticalCompImageView.setImageResource(movie.getImageId());
//        binding.movieVerticalCompTitleTextView.setText(movie.getTitle());
//        binding.movieVerticalCompRatingTextView.setText(averageRating + movie.getRating());
//        update(position);
//    }
    public void update(int position) {
        updateIndexView(position);
    }
    private void updateIndexView(int position) {
        String positionFrom1 = Integer.toString(position+1);
        binding.movieVerticalCompInnerTextView.setText(positionFrom1);
    }
}

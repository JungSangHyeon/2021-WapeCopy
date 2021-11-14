package com.example.wapecopy.view.homeFragment.movie.test;

import com.example.wapecopy.R;
import com.example.wapecopy.view.homeFragment.movie.data.MovieSet;

import java.util.ArrayList;

public class TestMoviesCreate {

    public static ArrayList<MovieSet> create(){
        ArrayList<MovieSet> movieSets = new ArrayList<>();

        MovieSet movieSet = new MovieSet();
        movieSet.setNoImage(true);
        movieSet.setTitle("박스오피스 순위");
        movieSet.setNoDescription(true);
        movieSets.add(movieSet);

        movieSet = new MovieSet();
        movieSet.setNoImage(true);
        movieSet.setTitle("넷플릭스 프로그램 순위");
        movieSet.setNoDescription(true);
        movieSets.add(movieSet);

        movieSet = new MovieSet();
        movieSet.setImageId(R.drawable.ic_sharp_person_24);
        movieSet.setTitle("나는 공룡이 좋아!");
        movieSet.setDescription("정상님의 컬렉션");
        movieSets.add(movieSet);

        movieSet = new MovieSet();
        movieSet.setImageId(R.drawable.ic_baseline_star_24);
        movieSet.setTitle("나는 공룡이 엄청 좋아!");
        movieSet.setNoDescription(true);
        movieSets.add(movieSet);

        return movieSets;
    }

}

package com.example.wapecopy.view.homeFragment.movie.data;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieSet {

    private int imageId;
    private String description, title;
    private boolean noDescription, noImage;

    private ArrayList<MovieVertical> movies;
}

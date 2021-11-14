package com.example.wapecopy.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.wapecopy.R;
import com.example.wapecopy.databinding.FragmentNoDataBinding;
import com.example.wapecopy.databinding.FragmentRatingListBinding;
import com.example.wapecopy.search.SimpleAdapter;

public class NoDataFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentNoDataBinding binding = FragmentNoDataBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
package com.example.wapecopy.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.wapecopy.databinding.CompNoDataBinding;

public class NoDataFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CompNoDataBinding binding = CompNoDataBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
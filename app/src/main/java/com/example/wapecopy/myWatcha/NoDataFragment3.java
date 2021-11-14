package com.example.wapecopy.myWatcha;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.wapecopy.databinding.CompNoDataBinding;
import com.example.wapecopy.databinding.LayoutStorageBinding;

public class NoDataFragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutStorageBinding binding = LayoutStorageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
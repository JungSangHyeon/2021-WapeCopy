package com.example.wapecopy.view.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {

    private final int layoutId;

    public SampleFragment(int layoutId){ this.layoutId=layoutId; }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(layoutId, container, false);
    }
}
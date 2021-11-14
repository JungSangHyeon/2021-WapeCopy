package com.example.wapecopy.view.sample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class SampleAdapter extends RecyclerView.Adapter<SampleViewHolder> {

    private final int layoutId, count;

    public SampleAdapter(int layoutId, int count){
        this.layoutId=layoutId;
        this.count=count;
    }

    @NotNull
    @Override
    public SampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(layoutId, parent, false);
        return new SampleViewHolder(view);
    }

    @Override public int getItemCount() { return count; }

    @Override public void onBindViewHolder(SampleViewHolder holder, int position) { }
}

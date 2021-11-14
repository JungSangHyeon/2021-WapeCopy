package com.example.wapecopy.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    private int layoutId;

    public SimpleAdapter(int layoutId){
        this.layoutId=layoutId;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(layoutId, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override public int getItemCount() { return 10; }

    @Override public void onBindViewHolder(SimpleViewHolder holder, int position) { }
}

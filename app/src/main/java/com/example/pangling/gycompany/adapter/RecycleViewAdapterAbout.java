package com.example.pangling.gycompany.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.viewholder.viewholderabout;
import com.example.pangling.gycompany.model.ModelAbout;

import java.util.ArrayList;

/**
 * Created by Pangling on 11/25/2017.
 */

public class RecycleViewAdapterAbout extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<ModelAbout> data;

    public RecycleViewAdapterAbout(Context context, ArrayList<ModelAbout> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_owner,parent,false);
        return new viewholderabout(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof viewholderabout){
            ((viewholderabout) holder).setUpData(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

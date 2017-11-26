package com.example.pangling.gycompany.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.viewholder.viewholdertimelineowner;
import com.example.pangling.gycompany.model.ModelTimelineOwner;

import java.util.ArrayList;

/**
 * Created by Pangling on 11/24/2017.
 */

public class RecycleViewAdapterTimeline extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<ModelTimelineOwner> data;

    public RecycleViewAdapterTimeline(Context context, ArrayList<ModelTimelineOwner> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_timeline,parent,false);
        return new viewholdertimelineowner(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof viewholdertimelineowner){
            ((viewholdertimelineowner) holder).setUpData(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

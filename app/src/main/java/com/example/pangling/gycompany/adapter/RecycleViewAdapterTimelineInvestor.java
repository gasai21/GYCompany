package com.example.pangling.gycompany.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.viewholder.viewholdertimelineinvestor;
import com.example.pangling.gycompany.model.ModelTimelineInvestor;

import java.util.ArrayList;

/**
 * Created by Pangling on 11/24/2017.
 */

public class RecycleViewAdapterTimelineInvestor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<ModelTimelineInvestor> data;

    public RecycleViewAdapterTimelineInvestor(Context context, ArrayList<ModelTimelineInvestor> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_timeline_investor,parent,false);
        return new viewholdertimelineinvestor(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof viewholdertimelineinvestor){
            ((viewholdertimelineinvestor) holder).setUpData(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

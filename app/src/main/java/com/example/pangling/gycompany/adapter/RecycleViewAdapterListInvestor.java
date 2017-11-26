package com.example.pangling.gycompany.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.viewholder.viewholderlistinvestor;
import com.example.pangling.gycompany.model.ModelListInvestor;

import java.util.ArrayList;

/**
 * Created by Pangling on 11/24/2017.
 */

public class RecycleViewAdapterListInvestor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<ModelListInvestor> data;

    public RecycleViewAdapterListInvestor(Context context, ArrayList<ModelListInvestor> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_owner,parent,false);
        return new viewholderlistinvestor(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof viewholderlistinvestor){
            ((viewholderlistinvestor) holder).setUpData(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

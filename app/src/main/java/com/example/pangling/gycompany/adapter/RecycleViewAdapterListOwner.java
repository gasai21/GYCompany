package com.example.pangling.gycompany.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.viewholder.viewholderlistowner;
import com.example.pangling.gycompany.model.ModelListOwner;

import java.util.ArrayList;

/**
 * Created by Pangling on 11/22/2017.
 */

public class RecycleViewAdapterListOwner extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<ModelListOwner> data;

    public RecycleViewAdapterListOwner(Context context, ArrayList<ModelListOwner> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_owner,parent,false);
        return new viewholderlistowner(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof viewholderlistowner){
            ((viewholderlistowner) holder).setUpData(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }
}

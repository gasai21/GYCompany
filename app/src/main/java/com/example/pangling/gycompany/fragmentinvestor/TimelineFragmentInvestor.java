package com.example.pangling.gycompany.fragmentinvestor;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.RecycleViewAdapterTimelineInvestor;
import com.example.pangling.gycompany.model.ModelTimelineInvestor;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimelineFragmentInvestor extends Fragment {

    ArrayList<ModelTimelineInvestor> data = new ArrayList<>();
    RecyclerView recyclerView;
    RecycleViewAdapterTimelineInvestor adapter;
    public TimelineFragmentInvestor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_timeline_fragment_investor, container, false);

        //inisialisasi
        recyclerView = (RecyclerView) v.findViewById(R.id.rvTimelineInvestor);
        dataDummy();
        setAdapter();
        return v;
    }

    private void setAdapter(){
        adapter = new RecycleViewAdapterTimelineInvestor(getContext(),data);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    private void dataDummy(){
        data.add(new ModelTimelineInvestor(R.drawable.logo,"Arixan","Aplikasi ini adalah aplikasi arisan online","089618287850","https://youtu.be/3ov1fNsDd8Y","Liquid"));
        data.add(new ModelTimelineInvestor(R.drawable.logo,"SPByJamu","Aplikasi ini adalah aplikasi Solving proble by jamu","089618287850","https://youtu.be/3ov1fNsDd8Y","Liquid"));
        data.add(new ModelTimelineInvestor(R.drawable.dasd,"GYCompany","Aplikasi ini adalah aplikasi Untuk mempertemuka antara investor dengan startapp baru","089618287850","https://youtu.be/3ov1fNsDd8Y","Ranger"));
        data.add(new ModelTimelineInvestor(R.drawable.dasd,"Temukanbarangmu","Aplikasi ini adalah aplikasi untuk menemukan barang yang hilang","089618287850","https://youtu.be/3ov1fNsDd8Y","Ranger"));
    }

}

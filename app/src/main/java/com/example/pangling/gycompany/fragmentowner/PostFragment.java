package com.example.pangling.gycompany.fragmentowner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pangling.gycompany.AmbilNilai.iNilai;
import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.RecycleViewAdapterTimeline;
import com.example.pangling.gycompany.model.ModelTimelineOwner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ModelTimelineOwner> data = new ArrayList<>();
    RecycleViewAdapterTimeline adapter;
    public PostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_post, container, false);

        //inisialisasi
        recyclerView = (RecyclerView) v.findViewById(R.id.rvTimelineOwner);

        if(iNilai.nilai.equals("Ismi")){
            dataDummy();

        }else{
            dataDummy2();

        }
        setAdapter();
        adapter.notifyDataSetChanged();
        Toast.makeText(getContext(),String.valueOf(data.size()),Toast.LENGTH_SHORT).show();
        return v;
    }

    private void dataDummy(){
        data.add(new ModelTimelineOwner(R.drawable.logo,"Arixan","Aplikasi ini adalah aplikasi arisan online"));
        data.add(new ModelTimelineOwner(R.drawable.logo,"SPByJamu","Aplikasi ini adalah aplikasi Solving proble by jamu"));

    }

    private void dataDummy2(){
        data.add(new ModelTimelineOwner(R.drawable.dasd,"GYCompany","Aplikasi ini adalah aplikasi Untuk mempertemuka antara investor dengan startapp baru"));
        data.add(new ModelTimelineOwner(R.drawable.dasd,"Temukanbarangmu","Aplikasi ini adalah aplikasi untuk menemukan barang yang hilang"));
    }

    private void setAdapter(){
        adapter = new RecycleViewAdapterTimeline(getContext(),data);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

    public void tambahdata2(String da, String du){
        data.add(new ModelTimelineOwner(R.drawable.dasd,da,du));

    }

    public void tambahdata(String da, String du){
        data.add(new ModelTimelineOwner(R.drawable.logo,da,du));

    }

}

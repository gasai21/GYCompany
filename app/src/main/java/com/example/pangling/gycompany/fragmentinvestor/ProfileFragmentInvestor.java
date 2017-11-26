package com.example.pangling.gycompany.fragmentinvestor;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pangling.gycompany.EditProfileInvestorActivity;
import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.RecycleViewAdapterListInvestor;
import com.example.pangling.gycompany.model.ModelListInvestor;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragmentInvestor extends Fragment {

    RecycleViewAdapterListInvestor adapter;
    RecyclerView recyclerView;
    ImageView img;
    TextView nama,titlee,keterangan;
    ArrayList<ModelListInvestor> data = new ArrayList<>();
    FloatingActionButton fab ;
    public ProfileFragmentInvestor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile_fragment_investor, container, false);

        //inisialisasi
        recyclerView = (RecyclerView) v.findViewById(R.id.rvInvestor);
        img = (ImageView) v.findViewById(R.id.imgProfilInvestor);
        nama = (TextView) v.findViewById(R.id.tvNamaInvestor);
        titlee = (TextView) v.findViewById(R.id.tvTitleInvestor);
        keterangan = (TextView) v.findViewById(R.id.tvKeteranganInvestor);
        fab = (FloatingActionButton) v.findViewById(R.id.btnEditProfilInvestor);

        mengisiBiodata();
        datadummy();
        setAdapter();
        ngeclick();
        return v;
    }

    private void datadummy(){
        data.add(new ModelListInvestor(R.drawable.ic_kontak,"ini adalah blabla"));
        data.add(new ModelListInvestor(R.drawable.ic_add_post,"ini adalah blabla"));
        data.add(new ModelListInvestor(R.drawable.ic_timeline,"ini adalah blabla"));
    }

    private void mengisiBiodata(){
        nama.setText("Liquid Production");
        keterangan.setText("Liquid Production adalah perusahaan yang berjalan di bidang IT, seperti pembuatan apps berjenis Web, Android maupun Destop");
        titlee.setText("Kepuasaan Cutomer adalah prioritas");
        img.setImageResource(R.drawable.dasd);
    }

    private void setAdapter(){
        adapter = new RecycleViewAdapterListInvestor(getContext(),data);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    private void ngeclick(){
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), EditProfileInvestorActivity.class);
                i.putExtra("nama",nama.getText().toString());
                i.putExtra("quotes",titlee.getText().toString());
                i.putExtra("keterangan",keterangan.getText().toString());
                startActivity(i);
            }
        });
    }

}

package com.example.pangling.gycompany.fragmentowner;


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

import com.example.pangling.gycompany.AmbilNilai.iNilai;
import com.example.pangling.gycompany.EditProfileOwnerActivity;
import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.adapter.RecycleViewAdapterListOwner;
import com.example.pangling.gycompany.model.ModelListOwner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<ModelListOwner> data = new ArrayList<>();
    RecycleViewAdapterListOwner adapter;
    TextView Nama,penjelasan,title;
    ImageView logo;
    FloatingActionButton edit;
    public ProfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_profil, container, false);

        //inisialisasi
        recyclerView = (RecyclerView) v.findViewById(R.id.rvOwner);
        Nama = (TextView) v.findViewById(R.id.tvNamaOwner);
        penjelasan = (TextView) v.findViewById(R.id.tvKeteranganOwner);
        title = (TextView) v.findViewById(R.id.tvTitleOwner);
        logo = (ImageView) v.findViewById(R.id.imgProfilOwner);
        edit = (FloatingActionButton) v.findViewById(R.id.btnEditProfil);

        clickEdit();
        mengisiBiodata();
        ambildata();
        if(iNilai.nilai.equals("Ismi")){
            mengisiBiodata();
        }else{
            mengisiBiodata2();
        }
        setAdapter();
        return v;
    }

    private void clickEdit(){
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), EditProfileOwnerActivity.class);
                i.putExtra("nama",Nama.getText().toString());
                i.putExtra("quotes",title.getText().toString());
                i.putExtra("keterangan",penjelasan.getText().toString());
                startActivity(i);
            }
        });
    }

    private void ambildata(){
        data.add(new ModelListOwner(R.drawable.ic_kontak,"ini adalah blabla"));
        data.add(new ModelListOwner(R.drawable.ic_add_post,"ini adalah blabla"));
        data.add(new ModelListOwner(R.drawable.ic_timeline,"ini adalah blabla"));
    }

    private void mengisiBiodata(){
        Nama.setText("Liquid");
        penjelasan.setText("Liquid adalah perusahaan yang berjalan di bidang IT, seperti pembuatan apps berjenis Web, Android maupun Destop");
        title.setText("Kepuasaan Cutomer adalah prioritas");
        logo.setImageResource(R.drawable.logo);
    }

    private void mengisiBiodata2(){
        Nama.setText("Ranger");
        penjelasan.setText("Ranger Production adalah perusahaan yang berjalan di bidang IT, seperti pembuatan apps berjenis Web, Android maupun Destop");
        title.setText("Kepuasaan Cutomer adalah prioritas");
        logo.setImageResource(R.drawable.dasd);
    }

    private void setAdapter(){
            adapter = new RecycleViewAdapterListOwner(getActivity().getApplicationContext(), data);


            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(adapter);
//            final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
//            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//            recyclerView.setLayoutManager(layoutManager);
//            recyclerView.setAdapter(adapter);

    }

}

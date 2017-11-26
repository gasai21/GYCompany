package com.example.pangling.gycompany.fragmentowner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pangling.gycompany.AmbilNilai.iNilai;
import com.example.pangling.gycompany.R;
import com.example.pangling.gycompany.model.ModelTimelineOwner;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddPostFragment extends Fragment {

    EditText title,keterangan;
    Button btnKirim;
    private ArrayList<ModelTimelineOwner> data = new ArrayList<>();
    public AddPostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_post, container, false);
        title = (EditText) v.findViewById(R.id.txttitleOwner);
        keterangan = (EditText) v.findViewById(R.id.txtketeranganOwner);
        btnKirim = (Button) v.findViewById(R.id.btnPost);


        if(iNilai.nilai.equals("Ismi")){
            ngeclick();
        }else{
            ngeclick2();
        }
        return v;
    }

    public void ngeclick(){
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Data Berhasil Di tambah!",Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void ngeclick2(){
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Data Berhasil Di tambah!",Toast.LENGTH_SHORT).show();

            }
        });
    }

}

package com.example.pangling.gycompany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pangling.gycompany.adapter.RecycleViewAdapterAbout;
import com.example.pangling.gycompany.model.ModelAbout;

import java.util.ArrayList;

public class DetailPostActivity extends AppCompatActivity {

    ArrayList<String> data = new ArrayList<>();
    ArrayAdapter adapter;
    ListView lv;
    RecycleViewAdapterAbout adapterAbout;
    ArrayList<ModelAbout> data2 = new ArrayList<>();
    RecyclerView recyclerView;
    Intent in ;
    ImageView lg,prdk;
    Toolbar toolbar;
    TextView keterangan,keunikan,judul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_post);
        getSupportActionBar().hide();

        //inisialisasi
        lv = (ListView) findViewById(R.id.lvFeature);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.rvAbout);
        lg = (ImageView) findViewById(R.id.imgCompanyDetail);
        prdk = (ImageView) findViewById(R.id.logoProdukdetail);
        keterangan = (TextView) findViewById(R.id.tvDeskripsiDetail);
        keunikan = (TextView) findViewById(R.id.tvKeunikanDetail);
        judul = (TextView) findViewById(R.id.titleDetailPost);

        dataDummy();
        setAdapter();
        adapter.notifyDataSetChanged();
        dummy2();
        setAdapter2();
        setdataa();

    }

    private void setdataa(){
        in = getIntent();
        judul.setText(in.getStringExtra("judul"));
        String doo = in.getStringExtra("dari");
        String dooo = in.getStringExtra("projek");
        if(doo.equals("Liquid")){
            toolbar.setTitle(doo);
            lg.setImageResource(R.drawable.logo);
            if(dooo.equals("Arixan")){
                prdk.setImageResource(R.drawable.a);
                keterangan.setText("Arixan Adalah aplikasi untuk bermain arisan online dimana pemain diharuskan memiliki pulsa minimal 5000 untuk memulai");
                keunikan.setText("Keunikan aplikasi ini adalah dengan adanya bot yang mengatur jalannya aplikasi sehingga meminimalisir kecurangan yang terjadi");

            }else{
                prdk.setImageResource(R.drawable.b);
                keterangan.setText("SPByJamu adalah aplikasi untuk mendeteksi segala penyakit dengan solusi jamu, karena jamu ialah salah satu icon yang cukup menonjol di indonesia");
                keunikan.setText("Keunikan aplikasi ini adalah kita bisa mendeteksi dan melihat hasil diagnosa dari penyakit yang kita derita");
            }
        }else {
            toolbar.setTitle(doo);
            lg.setImageResource(R.drawable.dasd);

            if(dooo.equals("GYCompany")){
                prdk.setImageResource(R.drawable.c);
                keterangan.setText("GYCompany adalah aplikasi yang berguna untuk menjembatani antara startapp baru dengan investor yang sedang mencari produk untuk di sponsori");
                keunikan.setText("Keunikan aplikasi ini adalah user akan mendapatkan notif jika postnya di lihat oleh orang");
            }else{
                prdk.setImageResource(R.drawable.d);
                keterangan.setText("Temukanbarangmu adalah aplikasi untuk membatu dalam mencari barang yang ilang");
                keunikan.setText("Keunikan aplikasi ini adalah user bisa mencari barang yang hilang dengan menggunakan aplikasi ini");
            }
        }
    }

    private void dummy2(){
        data2.add(new ModelAbout(R.drawable.ic_email,"Example@gmail.com"));
        data2.add(new ModelAbout(R.drawable.ic_telepon,"(081)293748537"));
        data2.add(new ModelAbout(R.drawable.ic_web,"http://www.example.com"));
    }

    private void setAdapter2(){
        adapterAbout = new RecycleViewAdapterAbout(DetailPostActivity.this,data2);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapterAbout);
    }

    private void dataDummy(){
        data.add("Hemat Biaya");
        data.add("Terpercaya");
        data.add("Kuat");

    }

    private void setAdapter(){
        adapter = new ArrayAdapter<String>(DetailPostActivity.this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
    }

}

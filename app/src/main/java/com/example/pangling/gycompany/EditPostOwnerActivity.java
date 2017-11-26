package com.example.pangling.gycompany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditPostOwnerActivity extends AppCompatActivity {

    EditText nama,keterangan;
    Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_post_owner);

        nama = (EditText) findViewById(R.id.txtNamaAppsEditInvestor);
        keterangan = (EditText) findViewById(R.id.txtKeteranganEditInvestor);
        edit = (Button) findViewById(R.id.btnEditPostOwner);

        ngeclick();
        isiform();
    }

    private void ngeclick(){
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Nama Tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else if(keterangan.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Keterangan Tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Data berhasil di edit!",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    private void isiform(){
        Intent i = getIntent();
        nama.setText(i.getStringExtra("judul"));
        keterangan.setText(i.getStringExtra("keterangan"));
    }
}

package com.example.pangling.gycompany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfileOwnerActivity extends AppCompatActivity {

    EditText nama,title,keterangan;
    Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_owner);

        //inisialisasi
        nama = (EditText) findViewById(R.id.txtNamaEditOwner);
        title = (EditText) findViewById(R.id.txtQuotesEditOwner);
        keterangan = (EditText) findViewById(R.id.txtKeteranganEditOwner);
        edit = (Button) findViewById(R.id.btnEditOwner);

        Intent i = getIntent();
        nama.setText(i.getStringExtra("nama"));
        title.setText(i.getStringExtra("quotes"));
        keterangan.setText(i.getStringExtra("keterangan"));

        ngeclick();
    }

    private void ngeclick(){
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Nama tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else if(title.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Quotes tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else if(keterangan.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Keterangan tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Data Berhasil di Edit!",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}

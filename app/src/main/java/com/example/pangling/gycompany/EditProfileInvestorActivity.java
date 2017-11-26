package com.example.pangling.gycompany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfileInvestorActivity extends AppCompatActivity {

    EditText nama,quotes,keterangan;
    Button btnEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_investor);

        //inisialisasi
        nama = (EditText) findViewById(R.id.txtNamaEditInvestor);
        quotes = (EditText) findViewById(R.id.txtQuotesEditInvestor);
        keterangan = (EditText) findViewById(R.id.txtKeteranganEditInvestor);
        btnEdit = (Button) findViewById(R.id.btnEditInvestor);

        ambildata();
        ngeclick();
    }

    private void ngeclick(){
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Nama tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else if(quotes.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Quotes tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else if(keterangan.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"Keterangan tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Data berhasil diedit!",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    private void ambildata(){
        Intent i = getIntent();
        nama.setText(i.getStringExtra("nama"));
        quotes.setText(i.getStringExtra("quotes"));
        keterangan.setText(i.getStringExtra("keterangan"));
    }
}

package com.example.pangling.gycompany;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText nama,username,password,email;
    Spinner posisi;
    Button regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        //inisialisasi
        nama = (EditText) findViewById(R.id.txtNamaRegistrasi);
        username = (EditText) findViewById(R.id.txtUsernameRegistrasi);
        password = (EditText) findViewById(R.id.txtPasswordRegistrasi);
        email = (EditText) findViewById(R.id.txtEmailRegistrasi);
        posisi = (Spinner) findViewById(R.id.cbPosisi);
        regis = (Button) findViewById(R.id.btnRegisterRegister);
        ngeclick();
    }

    private void clearr(){
        nama.setText("");
        username.setText("");
        password.setText("");
        email.setText("");
    }

    private void ngeclick(){
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regis.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(nama.getText().toString().length()==0){
                            Toast.makeText(getApplicationContext(),"Nama tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                        }else if(username.getText().toString().length()==0){
                            Toast.makeText(getApplicationContext(),"Username tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                        }else if(password.getText().toString().length()==0){
                            Toast.makeText(getApplicationContext(),"Password tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                        }else if(email.getText().toString().length()==0){
                            Toast.makeText(getApplicationContext(),"Email tidak boleh kosong!",Toast.LENGTH_SHORT).show();
                        }else{
                            if(posisi.getSelectedItem().toString().equals("Investor")){
                                alerttttt();
                            }else{
                                Toast.makeText(getApplicationContext(),"Selamat anda berhasil Mendaftar",Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        }
                    }
                });
            }
        });
    }

    private void alerttttt(){
        // Membuat layout
        LinearLayout layoutinput = new LinearLayout(RegisterActivity.this);
        layoutinput.setOrientation(LinearLayout.VERTICAL);
        layoutinput.setPadding(50,50,50,50);

        // buat id tersembunyi di alertbuilder
        final TextView txtv = new TextView(RegisterActivity.this);
        txtv.setText("Mohon lakukan pembayaran" + "\n" +" ke akun ini : 983723787384");
        txtv.setTextColor(Color.BLACK);
        layoutinput.addView(txtv);

        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
        builder.setTitle("Message");
        builder.setView(layoutinput);
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                clearr();
            }
        });
        //Membuat tombol positif
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"verifikasi pembayaran akan di lakukan melalui email",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        builder.show();
    }

}

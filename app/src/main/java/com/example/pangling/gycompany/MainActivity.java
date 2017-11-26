package com.example.pangling.gycompany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username,password;
    TextView regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //inisialisasi
        regis = (TextView) findViewById(R.id.btnRegis);
        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.txtUsernameLogin);
        password = (EditText) findViewById(R.id.txtPasswordLogin);

        doLogin();
        toRegister();
    }

    private void doLogin(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("Gagah") && password.getText().toString().equals("123")){
                    Intent i = new Intent(MainActivity.this,InvestorActivity.class);
                    startActivity(i);
                }else if(username.getText().toString().equals("Ismi") && password.getText().toString().equals("123")){
                    Intent i = new Intent(MainActivity.this,OwnerActivity.class);
                    i.putExtra("nama",username.getText().toString());
                    startActivity(i);
                }else if(username.getText().toString().equals("Gasai") && password.getText().toString().equals("123")){
                    Intent i = new Intent(MainActivity.this,OwnerActivity.class);
                    i.putExtra("nama",username.getText().toString());
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Username datau Password Salah",Toast.LENGTH_SHORT).show();
                    clear();
                }
            }
        });
    }

    private void toRegister(){
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }

    private void clear(){

        username.setText("");
        password.setText("");

    }
}

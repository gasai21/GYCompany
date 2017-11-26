package com.example.pangling.gycompany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.pangling.gycompany.AmbilNilai.iNilai;
import com.example.pangling.gycompany.fragmentowner.AddPostFragment;
import com.example.pangling.gycompany.fragmentowner.PostFragment;
import com.example.pangling.gycompany.fragmentowner.ProfilFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class OwnerActivity extends AppCompatActivity {

    BottomBar bottomBar;
    public static String nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        bottomBar = (BottomBar) findViewById(R.id.bottombarowner);
        setBottomBarttombar();

        Intent i = getIntent();
        iNilai.nilai = i.getStringExtra("nama");
        Toast.makeText(getApplicationContext(),iNilai.nilai,Toast.LENGTH_SHORT).show();
    }

    private void setBottomBarttombar(){
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            android.support.v4.app.Fragment fragment = null;
            @Override
            public void onTabSelected(int tabId) {
                if(tabId == R.id.tab_profil){
                    fragment = new ProfilFragment();
                }else if(tabId == R.id.tab_timeline){
                    fragment = new PostFragment();
                }else if(tabId == R.id.tab_add){
                    fragment = new AddPostFragment();
                }
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentowner,fragment)
                        .commit();
            }
        });
    }
}

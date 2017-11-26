package com.example.pangling.gycompany;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pangling.gycompany.fragmentinvestor.ProfileFragmentInvestor;
import com.example.pangling.gycompany.fragmentinvestor.TimelineFragmentInvestor;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class InvestorActivity extends AppCompatActivity {

    BottomBar bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor);

        bottomBar = (BottomBar) findViewById(R.id.bottominvestor);
        setBottomBarttombar();
    }

    private void setBottomBarttombar(){
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            android.support.v4.app.Fragment fragment = null;
            @Override
            public void onTabSelected(int tabId) {
                if(tabId == R.id.tab_profil_investor){
                    fragment = new ProfileFragmentInvestor();
                }else if(tabId == R.id.tab_timeline_investor){
                    fragment = new TimelineFragmentInvestor();
                }
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentinvestor,fragment)
                        .commit();
            }
        });
    }
}

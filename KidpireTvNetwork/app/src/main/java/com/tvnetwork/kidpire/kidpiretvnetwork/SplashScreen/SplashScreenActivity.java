package com.tvnetwork.kidpire.kidpiretvnetwork.SplashScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tvnetwork.kidpire.kidpiretvnetwork.HomePageActivity;
import com.tvnetwork.kidpire.kidpiretvnetwork.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 5000){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent(SplashScreenActivity.this,HomePageActivity.class));
                }

                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally{
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}

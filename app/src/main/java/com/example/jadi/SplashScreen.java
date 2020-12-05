package com.example.jadi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splashscreen);
            Thread thread = new Thread() {
                public void run () {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        startActivity(new Intent(SplashScreen.this, Profile.class));
                        finish();
                    }
                }
            };
            thread.start();
        }
    }


package com.example.centrealmanardevarenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class WelcomSplashScreenActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_splash_screen);

        progressBar=findViewById(R.id.progressbarId);

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {

                progressWork();
                startApp();

            }
        });

        thread.start();
    }

    void progressWork()
    {
        for(prog=20;prog<=100;prog=prog+40)
        {

            try {
                Thread.sleep(500);
                progressBar.setProgress(prog);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    void startApp()
    {
        Intent intent= new Intent(WelcomSplashScreenActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
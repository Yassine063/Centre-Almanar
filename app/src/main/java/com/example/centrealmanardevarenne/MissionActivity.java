package com.example.centrealmanardevarenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MissionActivity extends AppCompatActivity {
    Button butAccuiel;
    TextView textMisssion, contMission;
    ImageView imgMission;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);

        textMisssion = findViewById(R.id.textView);
        contMission = findViewById(R.id.textView3);
        imgMission = findViewById(R.id.imageView3);
        butAccuiel = findViewById(R.id.butAcueilMission);

        butAccuiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Accuiel();
            }
        });
    }

    private void Accuiel() {

        Intent intent= new Intent(MissionActivity.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
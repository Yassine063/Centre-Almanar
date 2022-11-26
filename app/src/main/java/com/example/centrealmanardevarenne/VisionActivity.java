package com.example.centrealmanardevarenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class VisionActivity extends AppCompatActivity {
    Button butAccuiel;
    TextView textVision, contVision;
    ImageView imageVision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision);

        textVision = findViewById(R.id.textVision);
        contVision = findViewById(R.id.textContVision);
        imageVision = findViewById(R.id.imageView2);

        butAccuiel = findViewById(R.id.butAcueilVision);
        butAccuiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Accuiel();
            }
        });
    }

    private void Accuiel() {

        Intent intent= new Intent(VisionActivity.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
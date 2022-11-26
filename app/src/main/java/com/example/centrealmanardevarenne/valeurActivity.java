package com.example.centrealmanardevarenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class valeurActivity extends AppCompatActivity {

Button butAccuiel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valeur);
        butAccuiel = findViewById(R.id.butAcueilIdent);

        butAccuiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Accuiel();
            }
        });
    }

    private void Accuiel() {

        Intent intent= new Intent(valeurActivity.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
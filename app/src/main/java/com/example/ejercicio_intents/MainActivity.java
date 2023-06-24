package com.example.ejercicio_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int imagen1 = R.drawable.baseline_android_24;
    int imagen2 = R.drawable.baseline_escalator_warning_24;
    int imagen3 = R.drawable.baseline_filter_vintage_24;
    int imagen4 = R.drawable.baseline_hiking_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(imagen1);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(imagen2);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(imagen3);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(imagen4);
            }
        });
    }

    private void goToSecondActivity(int imagen) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("vector", imagen);
        startActivity(intent);
    }
}
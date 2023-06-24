package com.example.ejercicio_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListeners();
    }

    private void initListeners() {
        Button backBtn = findViewById(R.id.backBtn);
        ImageView avatar = findViewById(R.id.avatar);

        int vectorDrawableId = getIntent().getIntExtra("vector", 0);

        if(vectorDrawableId != 0) {
            avatar.setImageResource(vectorDrawableId);
        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
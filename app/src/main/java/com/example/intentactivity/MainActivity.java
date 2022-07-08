package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bwalya,gloria,phaless,gabby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bwalya = findViewById(R.id.bwalyaButton);
        gloria = findViewById(R.id.gloriaButton);
        phaless = findViewById(R.id.phalessButton);
        gabby = findViewById(R.id.gabbyButton);

        bwalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bwalya = new Intent(MainActivity.this,Bwalya.class);
                startActivity(bwalya);
            }
        });

        gloria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gloria =new Intent(MainActivity.this,Gloria.class);
                startActivity(gloria);
            }
        });

        phaless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phaless =new Intent(MainActivity.this,Phaless.class);
                startActivity(phaless);
            }
        });

        gabby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gabby = new Intent(MainActivity.this,Gabby.class);
                startActivity(gabby);
            }
        });

    }
}


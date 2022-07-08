package com.example.intentactivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bwalya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bwalya);

        //Back arrow function
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView  screen = findViewById(R.id.bwalyaScreen);
        screen.setText("I am Bwalya the Java developer \n Happy coding!!! \n Oh welcome to my website");
    }

}
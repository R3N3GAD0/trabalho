package com.example.aaaa;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab = findViewById(R.id.fab);
fab.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
    });
}
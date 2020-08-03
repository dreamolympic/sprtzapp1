package com.example.sportzerplbschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Allplayerslist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allplayerslist);

        //getSupportActionBar().setTitle("All Players List");

        FloatingActionButton fab = findViewById(R.id.fab_add_player);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allplayerslist.this, Addplayer.class);
                startActivity(intent);

            }
        });



    }
}
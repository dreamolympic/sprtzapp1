package com.example.sportzerplbschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Allroleslist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allroleslist);

       // getSupportActionBar().setTitle("All Roles List");

        FloatingActionButton fab = findViewById(R.id.fab_add_role);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Allroleslist.this, Addrole.class);
                startActivity(intent);

            }
        });


    }
}
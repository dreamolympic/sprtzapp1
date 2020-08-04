package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Contactus extends AppCompatActivity {

    Button btnCallus;
    Button btnWritetous;
    Button btnHelpfaq;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contact Us");

        //to implement back button on tool bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCallus = (Button) findViewById(R.id.btncallus);
        btnWritetous = (Button) findViewById(R.id.writetous);
        btnHelpfaq = (Button) findViewById(R.id.helpfaq);


        btnCallus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Need to give official number
                // Permission request to be added while downloading this app to allow this app to call to this number from his phone.
               String phone = "9959190935";
               String s1 = "tel:" + phone;

               Intent intent = new Intent(Intent.ACTION_CALL);
               intent.setData(Uri.parse(s1));
               startActivity(intent);

            }
        });

        btnWritetous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Need to give valid email id.
               String email = "info@dreamolympic.co";
               String s2 = "mailto:" + email;
               Intent intent1 = new Intent(Intent.ACTION_SENDTO);
               intent1.setData(Uri.parse(s2));
               intent1.putExtra(Intent.EXTRA_SUBJECT, "Enter mail subject here");
               intent1.putExtra(Intent.EXTRA_TEXT, "Enter mail body text here");
               startActivity(Intent.createChooser(intent1, "Choose your email application"));
            }

        });

        btnHelpfaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent in1 = new Intent(Contactus.this, Helpfaq.class);
               startActivity(in1);
            }

        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

         //to define action on back button press
          if (item.getItemId() == android.R.id.home)
             {
               finish();
               }

        return super.onOptionsItemSelected(item);
    }

}
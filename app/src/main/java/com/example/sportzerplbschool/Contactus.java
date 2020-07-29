package com.example.sportzerplbschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contactus extends AppCompatActivity {

    Button btnCallus;
    Button btnWritetous;
    Button btnHelpfaq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        getSupportActionBar().setTitle("Contact Us");

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

}
package com.example.sportzerplbschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class Helpfaq extends AppCompatActivity {

    //need to work on this as pdf is not showing blank.
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpfaq);

        //getSupportActionBar().setTitle("Help and FAQs");

        pdfView = (PDFView)findViewById(R.id.helpfaq);

        pdfView.fromAsset("helpfaq.pdf").load();


    }
}
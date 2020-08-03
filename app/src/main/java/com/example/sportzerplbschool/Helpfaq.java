package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

public class Helpfaq extends AppCompatActivity {

    PDFView pdfView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpfaq);


        toolbar = (Toolbar)findViewById(R.id.toolbarhelpfaq);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Help and FAQs");

        //to implement back button on tool bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        pdfView = (PDFView)findViewById(R.id.helpfaq);
        pdfView.fromAsset("helpfaq.pdf").load();

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
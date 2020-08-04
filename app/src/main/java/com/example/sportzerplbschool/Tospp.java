package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

public class Tospp extends AppCompatActivity {

    WebView webView;
    String filename = "privacy_policy";
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tospp);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Terms of Service and Privacy Policy");

        //to implement back button on tool bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

           webView = (WebView) findViewById(R.id.privacyid);

          //To display content in webview from stored html file in Asset folder
          webView.getSettings().setJavaScriptEnabled(true);
          webView.loadUrl("file:///android_asset/privacy_policy.html");

        //To contorl the web view zoom in/out
          webView.getSettings().setBuiltInZoomControls(true);
          webView.getSettings().setDisplayZoomControls(false);

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
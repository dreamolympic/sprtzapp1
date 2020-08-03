package com.example.sportzerplbschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Tospp extends AppCompatActivity {

    WebView webView;
    String filename = "privacy_policy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tospp);

        //getSupportActionBar().setTitle("Terms of Service and Privacy Policy");

         webView = (WebView) findViewById(R.id.privacyid);

          //To display content in webview from stored html file in Asset folder
          webView.getSettings().setJavaScriptEnabled(true);
          webView.loadUrl("file:///android_asset/privacy_policy.html");

        //To contorl the web view zoom in/out
          webView.getSettings().setBuiltInZoomControls(true);
          webView.getSettings().setDisplayZoomControls(false);

    }
}
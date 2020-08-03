package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ToolbarWidgetWrapper;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class Login extends AppCompatActivity {

      Button login_button;
      EditText etMobilenumbertologin;
      EditText etPasswordtologin;
      TextView ToS;
      Spinner spinner;
      androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar = (androidx.appcompat.widget.Toolbar)findViewById(R.id.toolbarlogin);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login Page of Mobile App");

        login_button = (Button)findViewById(R.id.btnlogin);
        etMobilenumbertologin = (EditText) findViewById(R.id.etmobilenumbertologin);
        etPasswordtologin = (EditText) findViewById(R.id.etpasswordtologin);
        ToS = (TextView) findViewById(R.id.tvTOS2);

        spinner = (Spinner)findViewById(R.id.spusertype);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.user_type, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        String text = "Terms of Serivce and Privacy Policy";
        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
        ForegroundColorSpan fcsMagenta = new ForegroundColorSpan(Color.MAGENTA);

        ss.setSpan(fcsRed,0,16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsMagenta,21,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        UnderlineSpan underlineSpan1 = new UnderlineSpan();
        ss.setSpan(underlineSpan1,0,16,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        UnderlineSpan underlineSpan2 = new UnderlineSpan();
        ss.setSpan(underlineSpan2,21,35,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        ToS.setText(ss);

     // ToS.setPaintFlags(ToS.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

      ToS.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Intent in1 = new Intent(Login.this, Tospp.class);
             startActivity(in1);
          }
      });


      login_button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String mobilenumber1 = etMobilenumbertologin.getText().toString().trim();
              String item1 = spinner.getSelectedItem().toString();

              if (etMobilenumbertologin.getText().toString().equals("manager") && etPasswordtologin.getText().toString().equals("manager") && item1.equals("manager"))
                {
                  Intent i = new Intent(Login.this, DashboardManager.class);
                  i.putExtra("mobilenumberfromlogin", mobilenumber1);
                  startActivity(i);
                  finish();
                    }
              else {
                  if (etMobilenumbertologin.getText().toString().equals("user") && etPasswordtologin.getText().toString().equals("user") && item1.equals("user"))
                      {
                      Intent i2 = new Intent(Login.this, DashboardUser.class);
                      i2.putExtra("mobilenumberfromlogin", mobilenumber1);
                      startActivity(i2);
                      finish();
                      }
                      else
                         Toast.makeText(getApplicationContext(), "Error in login", Toast.LENGTH_LONG).show();
                   }

          }
      });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contactmenu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.contactus:
                Intent intent1 = new Intent(Login.this,Contactus.class);
                startActivity(intent1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DashboardManager extends AppCompatActivity {

    TextView mnumbermanager, countplayers, countcenters, countstaff, countroles, countfeeplans ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_manager);

        //getSupportActionBar().setTitle("Academy Profile");

        mnumbermanager = (TextView)findViewById(R.id.tvmnumbermanager);
        Bundle b = getIntent().getExtras();
        String number = b.getString("mobilenumberfromlogin");
        mnumbermanager.setText("Hello " + number);

        int centerscount = 2;
        countcenters = (TextView)findViewById(R.id.tvdashboardcenters);
        countcenters.setText(centerscount+"  Centers");

        countcenters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DashboardManager.this, Allcenterslist.class);
                startActivity(intent1);
            }
        });

        int playerscount = 10;
        countplayers = (TextView)findViewById(R.id.tvdashboardplayers);
        countplayers.setText(playerscount+"  Players");


        countplayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DashboardManager.this, Allplayerslist.class);
                startActivity(intent2);
            }
        });

        int staffcount = 11;
        countstaff = (TextView)findViewById(R.id.tvdashboardstaff);
        countstaff.setText(staffcount+"  Staff");

        countstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(DashboardManager.this, Allstafflist.class);
                startActivity(intent3);
            }
        });

        int rolescount = 4;
        countroles = (TextView)findViewById(R.id.tvdashboardroles);
        countroles.setText(rolescount+"  Roles");

        countroles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(DashboardManager.this, Allroleslist.class);
                startActivity(intent4);
            }
        });


        int feeplanscount = 2;
        countfeeplans = (TextView)findViewById(R.id.tvdashboardfeeplans);
        countfeeplans.setText(feeplanscount+"  Fee Plans");

        countfeeplans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(DashboardManager.this, Allfeeplanslist.class);
                startActivity(intent5);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.manager_dashboard_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.editacademy:
                Intent intent1 = new Intent(DashboardManager.this, AcademyDetails.class);
                startActivity(intent1);
                return true;

            case R.id.deleteacademy:
                Intent intent2 = new Intent(DashboardManager.this, DashboardManager.class);
                startActivity(intent2);
                return true;

            default:
            return super.onOptionsItemSelected(item);

        }

    }



}
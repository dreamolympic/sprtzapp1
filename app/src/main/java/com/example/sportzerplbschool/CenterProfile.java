package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class CenterProfile extends AppCompatActivity {

       TextView   countbatches, countplayers, countstaff;
       DrawerLayout drawerLayout;
       Toolbar toolbar;
       ActionBarDrawerToggle toggle;
       NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_profile);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Center Profile");

        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        nav = (NavigationView)findViewById(R.id.nav);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        startActivity(new Intent(CenterProfile.this, DashboardManager.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.centers :
                        startActivity(new Intent(CenterProfile.this, Allcenterslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.players :
                        startActivity(new Intent(CenterProfile.this, Allplayerslist.class ));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.staff :
                        startActivity(new Intent(CenterProfile.this, Allstafflist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.roles :
                        startActivity(new Intent(CenterProfile.this, Allroleslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.feeplans :
                        startActivity(new Intent(CenterProfile.this, Allfeeplanslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.tags :
                        Toast.makeText(getApplicationContext(),"Tags panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.calendar :
                        Toast.makeText(getApplicationContext(),"Calendar panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.assessments :
                        Toast.makeText(getApplicationContext(),"Assessments panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.competitions :
                        Toast.makeText(getApplicationContext(),"Competitions panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.messaging :
                        Toast.makeText(getApplicationContext(),"Messaging panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.staffrating :
                        Toast.makeText(getApplicationContext(),"Staff Rating panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.requests :
                        Toast.makeText(getApplicationContext(),"Requests panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.post :
                        Toast.makeText(getApplicationContext(),"Post panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.preferences :
                        Toast.makeText(getApplicationContext(),"Preferences panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.logout :
                        startActivity(new Intent(CenterProfile.this, Login.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        finish();
                        break;

                }


                return true;

            }
        });

        int batchescount = 13;
        countbatches = (TextView)findViewById(R.id.tvcenterdashboardbatches);
        countbatches.setText(batchescount+ " Batches");

        countbatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CenterProfile.this, CenterBatches.class));
            }
        });

        int playerscount = 11;
        countplayers = (TextView)findViewById(R.id.tvcenterdashboardplayers);
        countplayers.setText(playerscount+" Players");

        countplayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CenterProfile.this, CenterPlayers.class));

            }
        });

        int staffcount = 4;
        countstaff = (TextView)findViewById(R.id.tvcenterdashboardstaff);
        countstaff.setText(staffcount+" Staff");

        countstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CenterProfile.this, CenterStaff.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options_center_profile,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.editcenter:
                startActivity(new Intent(CenterProfile.this, Editcenter.class));
                return true;

            case R.id.deletecenter:
                Toast.makeText(getApplicationContext(), "Delete screen yet to create", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }


}
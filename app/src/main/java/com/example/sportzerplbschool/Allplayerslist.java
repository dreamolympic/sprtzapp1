package com.example.sportzerplbschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class Allplayerslist extends AppCompatActivity {

       TextView textView; //to be removed once this is re-pointed.
       DrawerLayout drawerLayout;
       Toolbar toolbar;
       ActionBarDrawerToggle toggle;
       NavigationView nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allplayerslist);

        textView = (TextView)findViewById(R.id.tvtext123) ;//to be removed later

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("All Players List");


        FloatingActionButton fab = findViewById(R.id.fab_add_player);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allplayerslist.this, Addplayer.class);
                startActivity(intent);

            }
        });


        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        nav = (NavigationView)findViewById(R.id.nav);
        toggle = new ActionBarDrawerToggle(Allplayerslist.this, drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(Allplayerslist.this, DashboardManager.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.centers:
                        startActivity(new Intent(Allplayerslist.this, Allcenterslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.players:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.staff:
                        startActivity(new Intent(Allplayerslist.this, Allstafflist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.roles:
                        startActivity(new Intent(Allplayerslist.this, Allroleslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.feeplans:
                        startActivity(new Intent(Allplayerslist.this, Allfeeplanslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.tags:
                        Toast.makeText(getApplicationContext(), "Tags panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.calendar:
                        Toast.makeText(getApplicationContext(), "Calendar panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.assessments:
                        Toast.makeText(getApplicationContext(), "Assessment panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.competitions:
                        Toast.makeText(getApplicationContext(), "Competitions panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.messaging:
                        Toast.makeText(getApplicationContext(), "Messaging panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.staffrating:
                        Toast.makeText(getApplicationContext(), "Staff Rating panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.requests:
                        Toast.makeText(getApplicationContext(), "Requests panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.post:
                        Toast.makeText(getApplicationContext(), "Post panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.preferences:
                        Toast.makeText(getApplicationContext(), "Preferences panel is open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.logout:
                        startActivity(new Intent(Allplayerslist.this, Login.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        finish();
                        break;
                }
                return true;

            }
        });

        //to be removed later
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Allplayerslist.this, Player_profile_manager.class));
            }
        });



    }



}
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

public class DashboardManager extends AppCompatActivity {

    TextView mnumbermanager, countplayers, countcenters, countstaff, countroles, countfeeplans ;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    NavigationView nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_manager);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Academy Profile");

        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayoutmanager);
        nav = (NavigationView)findViewById(R.id.nav);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.centers :
                        startActivity(new Intent(DashboardManager.this, Allcenterslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.players :
                        startActivity(new Intent(DashboardManager.this, Allplayerslist.class ));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.staff :
                        startActivity(new Intent(DashboardManager.this, Allstafflist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.roles :
                        startActivity(new Intent(DashboardManager.this, Allroleslist.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.feeplans :
                        startActivity(new Intent(DashboardManager.this, Allfeeplanslist.class));
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
                        startActivity(new Intent(DashboardManager.this, Login.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        finish();
                        break;

                }


                return true;
            }
        });


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
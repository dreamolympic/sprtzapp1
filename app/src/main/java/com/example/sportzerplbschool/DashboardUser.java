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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DashboardUser extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_user);

        Bundle b = getIntent().getExtras();
        String number = b.getString("mobilenumberfromlogin");

         toolbar = (Toolbar)findViewById(R.id.toolbaruserdashboard);
         setSupportActionBar(toolbar);
         getSupportActionBar().setTitle("User Dashbaord Title");

         drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
         nav = (NavigationView)findViewById(R.id.nav);
         toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

         drawerLayout.addDrawerListener(toggle);
         toggle.syncState();

         nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 switch (item.getItemId())
                 {
                     case R.id.menu_home:
                         Toast.makeText(getApplicationContext(),"Home panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;


                     case R.id.parents_info :
                         Toast.makeText(getApplicationContext(),"Parent panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;
                 }
                 return true;
             }
         });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.user_dashboard_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Intent intent1 = new Intent(DashboardUser.this, Login.class);
                startActivity(intent1);
                finish();
                return true;
            case R.id.myprofile:
               Intent intent2 = new Intent(DashboardUser.this, Myprofile.class);
               startActivity(intent2);
               return true;
            case R.id.parentsinfo:
                Intent intent3 = new Intent(DashboardUser.this, Parentsinfo.class);
                startActivity(intent3);
                return true;

            case R.id.shareapp:
                //To share the mobile app. Subject line and body line with mobile link -- link to be updated once our app released to playstore.
                Intent shareIntent12 = new Intent(Intent.ACTION_SEND);
                shareIntent12.setType("text/plain");
                String shareSub = "Sportzer PLB@Schools Mobile App";
                String shareBody = "Hey... Download our Sportzer@PLB Schools Mobile app to know 'How to Play' and 'Where to Play Baseball:-https://play.google.com/store/apps/details?id=com.kheloindia.mobile.app&hl=en";
                shareIntent12.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                shareIntent12.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(shareIntent12,"Share Via"));
                return true;

            case R.id.privacypolicy:
                Intent intent13 = new Intent(DashboardUser.this, Tospp.class);
                startActivity(intent13);
                return true;

            case R.id.contactus:
                Intent intent14 = new Intent(DashboardUser.this, Contactus.class);
                startActivity(intent14);
                return true;


            default:
                return super.onOptionsItemSelected(item);

        }
    }



}
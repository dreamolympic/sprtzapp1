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

         toolbar = (Toolbar)findViewById(R.id.toolbar);
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
                     case R.id.home:
                        // Toast.makeText(getApplicationContext(),"Home panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.profile:
                         startActivity(new Intent(DashboardUser.this, Profile.class));
                        // Toast.makeText(getApplicationContext(),"Profile panel is clicked",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.parents_info :
                         startActivity(new Intent(DashboardUser.this, Parentsinfo.class));
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

                     case R.id.feeplan :
                         Toast.makeText(getApplicationContext(),"Fee Plan panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.paymentdue :
                         Toast.makeText(getApplicationContext(),"Payment Due panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.paymenthistory :
                         Toast.makeText(getApplicationContext(),"Payment History panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.ratestaff :
                         Toast.makeText(getApplicationContext(),"Rate Staff panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.post :
                         Toast.makeText(getApplicationContext(),"Post panel is open",Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.logout :
                         startActivity(new Intent(DashboardUser.this, Login.class));
                         drawerLayout.closeDrawer(GravityCompat.START);
                         finish();
                         break;

                 }
                 return true;
             }
         });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options_dashboard_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
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
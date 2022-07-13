package com.example.project_eco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private ImageView menu,info;
    ImageView searchbar,shutter;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.menu);
        info = findViewById(R.id.info);
        searchbar = findViewById(R.id.search_bar);
        shutter = findViewById(R.id.shutter);
        shutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campage();
            }
        });
        searchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchpage();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info1();
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,null,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    public void info1(){
        Intent info1 = new Intent(this,activity_info_1.class);
        startActivity(info1);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_home:
            {drawerLayout.closeDrawer((GravityCompat.START));
                break;}
            case R.id.RUO:
            {regular();
            break;}
            case R.id.CHI:
            {common();
                break;}
            case R.id.electronics:
            {elec();
            break;}
            case R.id.metals:
            {
                metals();
                break;
            }
        }

        return true;
    }

    @Override
    public void onClick(View v) {

    }
    public void searchpage(){
        Intent search = new Intent(this,Searchpage.class);
        startActivity(search);
    }
    public void regular(){
        Intent regular = new Intent(this,regular.class);
        startActivity(regular);
    }
    public void elec(){
        Intent elec = new Intent(this, Electronics.class);
        startActivity(elec);
    }
    public void common(){
        Intent common = new Intent(this, Common.class);
        startActivity(common);
    }
    public void metals(){
        Intent metal = new Intent(this,Metals.class);
        startActivity(metal);
    }
    public void campage(){
    }
}
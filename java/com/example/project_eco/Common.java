package com.example.project_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Common extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_common);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();

        list.add("Aerosol Cans");
        list.add("Ammonia");
        list.add("Batteries");
        list.add("Cooking Oils");
        list.add("Motor Oils");
        list.add("Paint");
        list.add("High Density Polyethylene");
        list.add("Low Density Polyethylene");
        list.add("Polyethylene Terephthalate");
        list.add("Polypropylene");
        list.add("Polystyrene");
        list.add("Polyvinyl Chloride");
        list.add("Other Plastics");
        list.add("Aluminium");
        list.add("Ferrous");
        list.add("Non-Ferrous");
        list.add("Steel");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);

        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)aero();
                if(position==1)ammonia();
                if(position==2)batteries();
                if(position==3)cooking_oil();
                if(position==4)motor_oil();
                if(position==5)paint();
                if(position==6)high();
                if(position==7)low();
                if(position==8)terephalate();
                if(position==9)polypropylene();
                if(position==10)polystrene();
                if(position==11)pvc();
                if(position==12)other();
                if(position==13)aluminium();
                if(position==14)ferrous();
                if(position==15)nonferrous();
                if(position==16)steel();
            }
        });
    }
    public void aero(){
        Intent aerosol = new Intent(this,Aerosol_cans.class);
        startActivity(aerosol);
    }
    public void ammonia(){
        Intent ammonia = new Intent(this,ammonea.class);
        startActivity(ammonia);
    }
    public void batteries(){
        Intent aerosol = new Intent(this,Batteries.class);
        startActivity(aerosol);
    }
    public void cooking_oil(){
        Intent aerosol = new Intent(this,Cooking_oil.class);
        startActivity(aerosol);
    }
    public void motor_oil(){
        Intent aerosol = new Intent(this,motor_oil.class);
        startActivity(aerosol);
    }
    public void paint(){
        Intent aerosol = new Intent(this,Paints.class);
        startActivity(aerosol);
    }
    public void high(){
        Intent aerosol = new Intent(this,highdensity.class);
        startActivity(aerosol);
    }
    public void low(){
        Intent aerosol = new Intent(this,lowdensity.class);
        startActivity(aerosol);
    }
    public void terephalate(){
        Intent aerosol = new Intent(this,terephalate.class);
        startActivity(aerosol);
    }
    public void polypropylene(){
        Intent aerosol = new Intent(this,polypropylene.class);
        startActivity(aerosol);
    }
    public void polystrene(){
        Intent aerosol = new Intent(this,polystyrene.class);
        startActivity(aerosol);
    }
    public void pvc(){
        Intent aerosol = new Intent(this,pvc.class);
        startActivity(aerosol);
    }
    public void other(){
        Intent aerosol = new Intent(this,otherplastics.class);
        startActivity(aerosol);
    }
    public void aluminium(){
        Intent aerosol = new Intent(this,Aluminium.class);
        startActivity(aerosol);
    }
    public void ferrous(){
        Intent ferrous = new Intent(this,Ferrous.class);
        startActivity(ferrous);
    }
    public void nonferrous(){
        Intent nonferrous = new Intent(this, nonferrous.class);
        startActivity(nonferrous);
    }
    public void steel(){
        Intent steel = new Intent(this, steel.class);
        startActivity(steel);
    }
}
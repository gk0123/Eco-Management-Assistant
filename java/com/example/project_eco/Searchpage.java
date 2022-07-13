package com.example.project_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Searchpage extends AppCompatActivity {

    public ImageView back_btn;
    SearchView searchView;
    ListView listView;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_searchpage);

        back_btn = findViewById(R.id.back_btn);
        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.listView);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Searchpage.super.onBackPressed();
            }
        });

        list = new ArrayList<String>();

        list.add("Aerosol Cans");
        list.add("Ammonia");
        list.add("Batteries");
        list.add("Cooking Oils");
        list.add("Eraser Waste");
        list.add("Green Waste");
        list.add("Medical Waste");
        list.add("Pencil Waste");
        list.add("Thread Waste");
        list.add("Motor Oil");
        list.add("Paint");
        list.add("Bags");
        list.add("Ceramic");
        list.add("Furniture");
        list.add("Glass");
        list.add("Textiles");
        list.add("Wool");
        list.add("PET");
        list.add("PVC");
        list.add("LDPE");
        list.add("Electric Rice Cooker");
        list.add("Geyser");
        list.add("Inverter");
        list.add("Oven");
        list.add("PC");


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
                if(position==4)eraser();
                if(position==5)green();
                if(position==6)medical();
                if(position==7)pencil();
                if(position==8)thread();
                if(position==9)motor_oil();
                if(position==10)paint();
                if(position==11)bags();
                if(position==12)ceramics();
                if(position==13)furniture();
                if(position==14)glass();
                if(position==15)textiles();
                if(position==16)wool();
                if(position==17)terephalate();
                if(position==18)pvc();
                if(position==19)low();
                if(position==20)rice_cooker();
                if(position==21)geyser();
                if(position==22)inverter();
                if(position==23)oven();
                if(position==24)pc();
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
    public void eraser(){
        Intent intent = new Intent(this, Eraser_waste.class);
        startActivity(intent);
    }
    public void green(){
        Intent intent = new Intent(this, Green_waste.class);
        startActivity(intent);
    }
    public void medical(){
        Intent intent = new Intent(this, Medical.class);
        startActivity(intent);
    }
    public void pencil(){
        Intent intent = new Intent(this, Pencil.class);
        startActivity(intent);
    }
    public void thread(){
        Intent intent = new Intent(this, Thread.class);
        startActivity(intent);
    }
    public void bags(){
        Intent intent = new Intent(this, Bags.class);
        startActivity(intent);
    }
    public void ceramics(){
        Intent intent = new Intent(this, Ceramics.class);
        startActivity(intent);
    }
    public void furniture(){
        Intent intent = new Intent(this, Furniture.class);
        startActivity(intent);
    }
    public void glass(){
        Intent intent = new Intent(this, Glass.class);
        startActivity(intent);
    }
    public void textiles(){
        Intent intent = new Intent(this, Textiles.class);
        startActivity(intent);
    }
    public void wool(){
        Intent intent = new Intent(this, Wool.class);
        startActivity(intent);
    }
    public void rice_cooker(){
        Intent intent = new Intent(this, rice_cooker.class);
        startActivity(intent);
    }
    public void geyser(){
        Intent intent = new Intent(this, geyser.class);
        startActivity(intent);
    }public void inverter(){
        Intent intent = new Intent(this, Inverter.class);
        startActivity(intent);
    }public void oven(){
        Intent intent = new Intent(this, Oven.class);
        startActivity(intent);
    }public void pc(){
        Intent intent = new Intent(this, PC.class);
        startActivity(intent);
    }
}
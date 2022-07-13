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

public class regular extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_regular);
        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.listView);


        list = new ArrayList<String>();

        list.add("Eraser Waste");
        list.add("Green Waste");
        list.add("Medical Waste");
        list.add("Pencil Waste");
        list.add("Thread Waste");
        list.add("Bags");
        list.add("Ceramics");
        list.add("Furniture");
        list.add("Glass");
        list.add("Textiles");
        list.add("Wool");

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
                if(position==0)eraser();
                if(position==1)green();
                if(position==2)medical();
                if(position==3)pencil();
                if(position==4)thread();
                if(position==5)bags();
                if(position==6)ceramics();
                if(position==7)furniture();
                if(position==8)green();
                if(position==9)textiles();
                if(position==10)wool();
            }
        });
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


}

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

public class Electronics extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_electronics);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();

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
                if(position==0)rice_cooker();
                if(position==1)geyser();
                if(position==2)inverter();
                if(position==3)oven();
                if(position==4)pc();
            }
        });
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
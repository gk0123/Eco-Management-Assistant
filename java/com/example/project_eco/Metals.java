package com.example.project_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Metals extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_metals);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();

        list.add("Ferrous");
        list.add("Non-Ferrous");
        list.add("Steel");
        list.add("Aluminium");

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
                if(position==0)ferrous();
                if(position==1)nonferrous();
                if(position==2)steel();
                if(position==3)aluminium();
            }
        });
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
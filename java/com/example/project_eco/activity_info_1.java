package com.example.project_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_info_1 extends AppCompatActivity {

    public ImageView back_btn;
    public TextView teaminfotab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_info1);

        back_btn = findViewById(R.id.back_btn);
        teaminfotab = findViewById(R.id.teaminfotab);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_info_1.super.onBackPressed();
            }
        });
        teaminfotab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info2();
            }
        });
    }
    public void info2(){
        Intent info2 = new Intent(this,activity_info2.class);
        startActivity(info2);
    }

}
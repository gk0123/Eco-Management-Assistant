package com.example.project_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_info2 extends AppCompatActivity {

    private ImageView back_btn;
    private TextView projectinfotab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_info2);

        back_btn = findViewById(R.id.btn_back);
        projectinfotab = findViewById(R.id.projectinfotab);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_info2.super.onBackPressed();
            }
        });
        projectinfotab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_info2.super.onBackPressed();
            }
        });
    }
    public void info1(){
        Intent info1 = new Intent(this,activity_info_1.class);
        startActivity(info1);
    }
}
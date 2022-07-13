package com.example.project_eco;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Campage extends AppCompatActivity {

    private Button select_image_button,make_prediction,camerabtn;
    private ImageView img_view,back_btn;
    private TextView text_View;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_campage2);
    }
}
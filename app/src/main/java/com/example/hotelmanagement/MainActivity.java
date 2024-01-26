package com.example.hotelmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;


import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton started;
    private TextView hotel_name, hotel_info;
    private ImageView img5, img6, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img5 = findViewById(R.id.imageView5);
        img6 = findViewById(R.id.imageView6);
        img4 = findViewById(R.id.imageView4);
        started = findViewById(R.id.started);
        hotel_name = findViewById(R.id.hotelheading);


        Glide.with(this)
                .load(R.drawable.pic2)
                .into(img5);

        Glide.with(this)
                .load(R.drawable.pic4)
                .into(img6);

        Glide.with(this)
                .load(R.drawable.pic1)
                .into(img4);

        started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });


    }
}
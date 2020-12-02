package com.example.appopenwebinars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen=findViewById(R.id.imagen);
        Glide.with(this).load("https://cdn.pixabay.com/photo/2018/01/27/20/47/cat-3112174__340.png").into(imagen);
    }
}
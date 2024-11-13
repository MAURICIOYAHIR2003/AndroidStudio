package com.example.p77s11imageview;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
ImageView contenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedor = findViewById(R.id.ivA1Imagen);

        Glide.with(this).load("https://www.fayerwayer.com/resizer/v2/M34FRSZANZEXTERMSFHJG3E5IA.jpeg?smart=true&auth=78113418dc4a412a4a1aa822c29107502eafd0b557eeee042e6659779411afdf&width=1440&height=810").into(contenedor);

    }
}
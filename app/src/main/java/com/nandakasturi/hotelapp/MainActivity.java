package com.nandakasturi.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedIntanceState) {

        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://pix6.agoda.net/hotelImages/103/10367/10367_15100613190036667056.jpg?s=1024x768";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}
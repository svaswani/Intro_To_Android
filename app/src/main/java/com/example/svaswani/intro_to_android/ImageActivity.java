package com.example.svaswani.intro_to_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Cute Animals!");

        String image = getIntent().getStringExtra("Images");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        if (image.equals("Baby Pug"))
        {
            imageView.setImageResource(R.drawable.babypug);
        }
        else if (image.equals("Turtle With Strawberry"))
        {
            imageView.setImageResource(R.drawable.turtlewithstrawberry);
        }
        else if (image.equals("Duck"))
        {
            imageView.setImageResource(R.drawable.duck);
        }
        else if (image.equals("Spanks"))
        {
            imageView.setImageResource(R.drawable.spanks);
        }
        else if (image.equals("Tanat"))
        {
            imageView.setImageResource(R.drawable.tanat);
        }
        else if (image.equals("Alex"))
        {
            imageView.setImageResource(R.drawable.alex);
        }
        else if (image.equals("Stu-fart"))
        {
            imageView.setImageResource(R.drawable.stufart);
        }
        else if (image.equals("Sam"))
        {
            imageView.setImageResource(R.drawable.sam);
        }
        else if (image.equals("Ricky"))
        {
            imageView.setImageResource(R.drawable.ricky);
        }
        else if (image.equals("Young Money"))
        {
            imageView.setImageResource(R.drawable.youngmoney);
        }
    }

}

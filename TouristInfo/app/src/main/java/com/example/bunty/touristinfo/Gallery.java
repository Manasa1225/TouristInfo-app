 package com.example.bunty.touristinfo;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;

public class Gallery extends AppCompatActivity {

    ImageAdapter adapter;
    ViewPager viewPager;
    ArrayList<Integer> images;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        selectImages();

        viewPager= (ViewPager) findViewById(R.id.view_pager);
        adapter=new ImageAdapter(this,images);
        viewPager.setAdapter(adapter);

    }
    public void selectImages(){
        Intent intent1=new Intent();
        position=getIntent().getIntExtra("position",0);
        images=new ArrayList<>();
        switch(position){
            case 0:images.addAll(ImagesData.setDelhiImages());
                break;

            case 1:images.addAll(ImagesData.setMumbaiImages());
                break;
            case 2:images.addAll(ImagesData.setAhmedabadImages());
                break;
            case 3:images.addAll(ImagesData.setLucknowImages());
                break;
            case 4:images.addAll(ImagesData.setHyderabadImages());
                break;
            case 5:images.addAll(ImagesData.setBangaloreImages());
                break;
            case 6:images.addAll(ImagesData.setChennaiImages());
                break;
            case 7:images.addAll(ImagesData.setKolkataImages());
                break;

        }


    }

    }



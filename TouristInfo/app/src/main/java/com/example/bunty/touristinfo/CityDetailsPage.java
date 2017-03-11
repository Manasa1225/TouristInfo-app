package com.example.bunty.touristinfo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.bunty.touristinfo.CityNameData.Ahmedabad_description;

public class CityDetailsPage extends AppCompatActivity {

    private ImageView im_image;
    private TextView tv_description;
    private int position;
    private Button bt_gallery;
    private Button bt_famousPlaces;
    private ArrayList<CityNames> listcityDescription;
   Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details_page);



         im_image= (ImageView) findViewById(R.id.iv_image);
        tv_description= (TextView) findViewById(R.id.tv_description);
        tv_description.setMovementMethod(new ScrollingMovementMethod());

        bt_gallery= (Button) findViewById(R.id.bt_gallery);
        bt_famousPlaces= (Button) findViewById(R.id.bt_famousPlaces);


       // Intent intent=new Intent();
        intent=new Intent();
        position=getIntent().getIntExtra("position",0);
        listcityDescription=new ArrayList<>();

        bt_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGallery();
            }
        });

        bt_famousPlaces.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               onClickFamousPlaces();
            }
        }
        );


        displayContent();
    }
    private void displayContent(){

        for(int i=0;i<=position;i++){

            listcityDescription=CityNameData.getCityDescription();
            tv_description.setText(listcityDescription.get(i).getCityDescription());
            im_image.setImageResource(listcityDescription.get(i).getCityImage());

        }

    }
    private void onClickGallery(){
      //  Intent intent1=new Intent(this,Gallery.class);
        intent=new Intent(this,Gallery.class);
        intent.putExtra("position",position);
        startActivity(intent);


    }
    private void onClickFamousPlaces(){
         intent=new Intent(this,FamousPlaces.class);
        intent.putExtra("position",position);
        startActivity((intent));
    }
}







package com.example.bunty.touristinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class FamousPlaces extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    Button bt_addLocalPlace;
    int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_places);

        bt_addLocalPlace= (Button) findViewById(R.id.bt_addLocalPlace);
        bt_addLocalPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FamousPlaces.this,AddLocalPlace.class);
                startActivity(intent);

            }
        });
        init();

    }
    private void init(){
        recyclerView= (RecyclerView) findViewById(R.id.rv_famousPlaces);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerViewAdapter(this);
        recyclerView.setAdapter(adapter);
        selectPlaces();
    //    adapter.setData(FamousplacesData.getPlacesData());

    }
    public void selectPlaces(){
           Intent intent=new Intent();
        position=getIntent().getIntExtra("position",0);
        switch(position){
            case 0:  adapter.setData(FamousplacesData.getDelhiPlaces());
                break;
            case 1:adapter.setData(FamousplacesData.getMumbaiPlaces());
                break;
            case 2:adapter.setData(FamousplacesData.getAhmedabadPlaces());
                break;
            case 3:adapter.setData(FamousplacesData.getLucknowPlaces());
                break;
            case 4:adapter.setData(FamousplacesData.getHyderabadPlaces());
                break;
            case 5:adapter.setData(FamousplacesData.getBangalorePlaces());
                break;
            case 6:adapter.setData(FamousplacesData.getChennaiPlaces());
                break;
            case 7:adapter.setData(FamousplacesData.getKolkataPlaces());
                break;

        }


    }

}

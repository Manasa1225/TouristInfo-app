package com.example.bunty.touristinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowCities extends AppCompatActivity {


    private GridView gridviewCityname;
    private GridViewAdapter gridViewAdapter;
    private Button bt_addCityName;
    private ArrayList listCityNames;
    private EditText et_addCityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cities);
         bt_addCityName= (Button) findViewById(R.id.bt_addCityName);
        et_addCityName=(EditText) findViewById(R.id.et_addCityName);
        listCityNames=new ArrayList<>();


        bt_addCityName.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  addNewItem();
                                              }
                                              });



                init();
            }

            public void init() {

                gridviewCityname = (GridView) findViewById(R.id.gl_cityname);
                //instantiate the gridview adapter with context this
                gridViewAdapter = new GridViewAdapter(this, listCityNames);
                //adapter sets the data inside the arraylist to gridview
                gridviewCityname.setAdapter(gridViewAdapter);
                //getting the data from cityNamedata

                gridViewAdapter.setData(CityNameData.getCityNameData());

                gridviewCityname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(ShowCities.this, CityDetailsPage.class);
                        intent.putExtra("position", position);
                        startActivity(intent);

                    }
                });


            }

public void addNewItem(){
     String addCityName = et_addCityName.getText().toString().trim();
   int i = gridViewAdapter.getCount();


    if (TextUtils.isEmpty(addCityName)) {
        Toast.makeText(ShowCities.this, "Please add the City Name", Toast.LENGTH_LONG).show();
    }
    else{
            listCityNames.add(new CityNames(addCityName));

            gridViewAdapter.notifyDataSetChanged();
            et_addCityName.setText("");
        }
    }

}




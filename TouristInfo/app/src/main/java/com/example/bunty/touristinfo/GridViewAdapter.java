package com.example.bunty.touristinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
//array list for city names
    ArrayList<CityNames> listCityNames=new ArrayList<>();

    private LayoutInflater inflater;

    //constructor to inflate the single row xml
    public GridViewAdapter(Context context,ArrayList<CityNames> listCityNames) {

    inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listCityNames=listCityNames;
    }


//for setting data from CiteNamesData to adapter
    public void setData(ArrayList<CityNames> listCityNames){
        this.listCityNames.clear();
        this.listCityNames.addAll(listCityNames);

    }
//gives number of items in the array list
    @Override
    public int getCount() {

        return listCityNames.size();
    }
//gives position  in array list
    @Override
    public CityNames getItem(int i) {

        return listCityNames.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
//initialise the Viewholder
//convertview represents row xml
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        ViewHolder holder;
        //to avoid recreating the view, we check if its created already
        if(null==convertView){
            holder=new ViewHolder();
            //instantiate using inflater to converview
            convertView=inflater.inflate(R.layout.row_city_data,parent,false);
            holder.tv_cityname= (TextView) convertView.findViewById(R.id.tv_cityname);
            convertView.setTag(holder);
        }else{
            //if view is already created it get the date from tag
            holder= (ViewHolder) convertView.getTag();
        }
        CityNames cityNames=getItem(i);
        holder.tv_cityname.setText(cityNames.getCityName());
        return convertView;

    }
//gives single row in the grid view
    static class ViewHolder{
        TextView tv_cityname;

    }
}

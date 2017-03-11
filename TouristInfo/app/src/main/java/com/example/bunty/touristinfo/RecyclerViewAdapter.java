package com.example.bunty.touristinfo;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PlacesViewHolder>{

    private LayoutInflater inflater;
    ArrayList<SingleFamousPlaces> listplaces;

    public RecyclerViewAdapter(Context context) {
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listplaces=new ArrayList<>();

    }
//set the data
    public void setData(ArrayList<SingleFamousPlaces> listplaces){
      this.listplaces.addAll(listplaces);
        notifyDataSetChanged();

    }
    //create the data
    @Override
    public PlacesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view=inflater.inflate(R.layout.row_places_data,parent,false);
       //return view
        return new PlacesViewHolder(view);
    }
//bind the data
    @Override
    public void onBindViewHolder(PlacesViewHolder holder, int position) {

        SingleFamousPlaces singleFamousPlaces=listplaces.get(position);
        holder.iv_placeImage.setImageResource(singleFamousPlaces.getPlace_image());
        holder.tv_placeTitle.setText(singleFamousPlaces.getPlace_title());
        holder.tv_placeDesription.setText(singleFamousPlaces.getPlace_description());


    }

    @Override
    public int getItemCount() {

        return listplaces.size();
    }

    static class PlacesViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_placeImage;
        private TextView tv_placeTitle;
        private TextView tv_placeDesription;


        public PlacesViewHolder(View itemView) {
            super(itemView);
//initialise to placeviewholder
            iv_placeImage= (ImageView) itemView.findViewById(R.id.iv_placeImage);
            tv_placeTitle= (TextView) itemView.findViewById(R.id.tv_placeTitle);
            tv_placeDesription= (TextView) itemView.findViewById(R.id.tv_placeDescription);
        }
    }
}

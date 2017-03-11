package com.example.bunty.touristinfo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


public class ImageAdapter extends PagerAdapter {
    LayoutInflater inflater;
    Context context;
    ArrayList<Integer> images;


   public ImageAdapter(Context context,ArrayList<Integer> images){
       this.context=context;
       this.images=images;

   }
    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
     container.invalidate();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.swipe,container,false);
        ImageView imageView= (ImageView) v.findViewById(R.id.imageView);
        imageView.setImageResource(images.get(position));
        container.addView(v,0);

        return v;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}

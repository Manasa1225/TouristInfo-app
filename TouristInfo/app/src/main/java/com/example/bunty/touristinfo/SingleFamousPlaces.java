package com.example.bunty.touristinfo;



public class SingleFamousPlaces {
    private int place_image;
    private  String place_title;
    private String place_description;

    public SingleFamousPlaces(){
    }
    public SingleFamousPlaces(int place_image,String place_title,String place_description){
        this.place_image=place_image;
        this.place_title=place_title;
        this.place_description=place_description;
    }

    public int getPlace_image() {
        return place_image;
    }

    public void setPlace_image(int place_image) {
        this.place_image = place_image;
    }
    public String getPlace_title() {
        return place_title;
    }

    public void setPlace_title(String place_title) {
        this.place_title = place_title;
    }

    public String getPlace_description() {
        return place_description;
    }

    public void setPlace_description(String place_description) {
        this.place_description = place_description;
    }


}

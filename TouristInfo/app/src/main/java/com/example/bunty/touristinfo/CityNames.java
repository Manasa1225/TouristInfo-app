package com.example.bunty.touristinfo;


public class CityNames {
    private String cityName;

    private String cityDescription;
    private Integer cityImage;

    public CityNames(){}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public CityNames(String cityName) {
        this.cityName = cityName;
    }

    public CityNames(String cityDescription,Integer cityImage){
        this.cityDescription=cityDescription;
        this.cityImage=cityImage;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public Integer getCityImage() {
        return cityImage;
    }

    public void setCityImage(Integer cityImage) {
        this.cityImage = cityImage;
    }
    }



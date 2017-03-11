package com.example.bunty.touristinfo;

import java.util.ArrayList;



public class ImagesData {

    private static ArrayList<Integer> delhiImages;
    public static ArrayList<Integer> mumbaiImages;
    public static ArrayList<Integer> ahmedabadImages;
    public static ArrayList<Integer> lucknowImages;
    public static ArrayList<Integer> hyderabadImages;
    public static ArrayList<Integer> bangaloreImages;
    public static ArrayList<Integer> chennaiImages;
    public static ArrayList<Integer> kolkataImages;



    public static ArrayList<Integer> setAhmedabadImages(){
        ahmedabadImages=new ArrayList<>();

        ahmedabadImages.add(R.drawable.adalaj_stepwell_ahmedabad);
        ahmedabadImages.add(R.drawable.gandhi_ashram_ahmedabad);
        ahmedabadImages.add(R.drawable.jama_masjid_ahmedabad);
        ahmedabadImages.add(R.drawable.lal_darwaja_ahmedabad);
        ahmedabadImages.add(R.drawable.kankaria_lake_ahm);
       // ahmedabadImages.addAll(ahmedabadImages);
       return ahmedabadImages;

    }
    public static ArrayList<Integer> setBangaloreImages(){
        bangaloreImages=new ArrayList<>();
        bangaloreImages.add(R.drawable.bangalorepalace);
        bangaloreImages.add(R.drawable.cubbonpark_ban);
        bangaloreImages.add(R.drawable.lalbagh_bang);
        bangaloreImages.add(R.drawable.the_government_museum_bang);
        bangaloreImages.add(R.drawable.tipu_sultan_fort_bang);

       return  bangaloreImages;
    }
    public static ArrayList<Integer> setDelhiImages(){
        delhiImages=new ArrayList<>();
        delhiImages.add(R.drawable.humayunstomb_delhi);
        delhiImages.add(R.drawable.indiagate_delhi);
        delhiImages.add(R.drawable.lotustemple_delhi);
        delhiImages.add(R.drawable.qutab_minar_delhi);
        delhiImages.add(R.drawable.redfort_delhi);
        return delhiImages;

    }
    public static ArrayList<Integer> setMumbaiImages(){
        mumbaiImages=new ArrayList<>();
        mumbaiImages.add(R.drawable.chhatrapati_shivaji_terminus_mum);
        mumbaiImages.add(R.drawable.flora_fountain_mum);
        mumbaiImages.add(R.drawable.gatewayofindia_mum);
        mumbaiImages.add(R.drawable.nehruplanetarium_mum);
        return mumbaiImages;

    }
    public static ArrayList<Integer> setHyderabadImages(){
       hyderabadImages=new ArrayList<>();
        hyderabadImages.add(R.drawable.charminar_hyd);
        hyderabadImages.add(R.drawable.falaknumapalace_hyd);
        hyderabadImages.add(R.drawable.golcondafort_hyd);
        hyderabadImages.add(R.drawable.hussainsagarlake_hyd);
        hyderabadImages.add(R.drawable.birlamandir_hyd);
        return  hyderabadImages;
    }
    public static ArrayList<Integer> setLucknowImages(){
        lucknowImages=new ArrayList<>();
        lucknowImages.add(R.drawable.bara_mambara_luc);
        lucknowImages.add(R.drawable.chattar_manzil_luc);
        lucknowImages.add(R.drawable.drambedkarpark_luc);
        lucknowImages.add(R.drawable.chota_imambara_luc);
        return  lucknowImages;

    }
    public static ArrayList<Integer> setChennaiImages(){
        chennaiImages=new ArrayList<>();
        chennaiImages.add(R.drawable.nationalartgallery_che);
        chennaiImages.add(R.drawable.marinabeach_che);
        chennaiImages.add(R.drawable.kapaleeswarar_temple_che);
        chennaiImages.add(R.drawable.arignar_anna_zoologicalpark_che);
        return chennaiImages;

    }
    public static ArrayList<Integer> setKolkataImages(){
        kolkataImages=new ArrayList<>();
        kolkataImages.add(R.drawable.eden_garden_kol);
        kolkataImages.add(R.drawable.howrahbridge_kol);
        kolkataImages.add(R.drawable.indianmuseum_kol);
        kolkataImages.add(R.drawable.marblepalacemansion_kol);
        kolkataImages.add(R.drawable.victoriamemorial_kol);
        return kolkataImages;

    }
}
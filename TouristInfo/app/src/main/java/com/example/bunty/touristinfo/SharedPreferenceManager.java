package com.example.bunty.touristinfo;


import android.content.Context;
import android.content.SharedPreferences;

import static com.example.bunty.touristinfo.SharedPreferenceConstants.KEY_SHARED_ADDLOCALDATA;

public class SharedPreferenceManager {

    private SharedPreferences preferences;
    private Context context;
    private static SharedPreferenceManager sInstance;

    public SharedPreferenceManager(Context context){
        this.context=context;
        preferences=context.getSharedPreferences(KEY_SHARED_ADDLOCALDATA,Context.MODE_PRIVATE);
    }

    public static SharedPreferenceManager getInstance(Context context){
        if(sInstance==null){
            sInstance=new SharedPreferenceManager(context);
        }
        return sInstance;
    }
    public void addValue(String key,String value){

        SharedPreferences.Editor editor=preferences.edit();
        editor.putString(key,value);
        editor.commit();
    }
    public String getValue(String key){
        return preferences.getString(key,null);

    }
    public void clearPreference(){
        SharedPreferences.Editor editor=preferences.edit();
        editor.clear();
        editor.commit();

    }
}

package com.myfirst.tiktok;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    private final static String PREFERENCE_KEY = "com.myfirst.tiktok";

    private static SharedPreferences getSharedPreference(Context context){
        return context.getSharedPreferences(PREFERENCE_KEY,Context.MODE_PRIVATE);
    }

    public static void writeStringIntoSharedPreference(Context context,String value){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString("email",value);
        editor.apply();
    }

    public static String getStringFromSharedPreference(Context context,String key){
        return getSharedPreference(context).getString(key,null);
    }

}

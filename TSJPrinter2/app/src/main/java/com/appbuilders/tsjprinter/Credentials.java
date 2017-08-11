package com.appbuilders.tsjprinter;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Map;

/**
 * Created by eec000i on 10/08/17.
 */

public class Credentials {

    private static Credentials mInstance;
    private Context context;
    private static String packagee = "simsites";

    private String token = "20747630d1e1b9ffa4993a11a96d2c3e0f4f8fe6256d9f4c176b69a02481291b.be72d1a7d3f0b1c52d95089056f202fe";
    private String url = "http://picservices.kompila.me/api.ashx?action=";

    public static Credentials getInstance(Context context) {

        if ( mInstance == null ) {
            Class clazz = Credentials.class;
            synchronized (clazz) {
                mInstance = new Credentials(context);
            }
        }
        return mInstance;
    }

    /**
     * Contructor to generate in memory only once all the pokemons
     * */
    public Credentials(Context context) {

        this.context = context;
    }

    public String getToken() {

        return this.token;
    }

    public String getUrl() {

        return this.url;
    }

    /***********************************************************************************************
     *                              Methods to get and save preferences                            *
     ***********************************************************************************************/

    public String getPreference(String preference) {

        SharedPreferences prefs = this.context.getSharedPreferences(Credentials.packagee, Context.MODE_PRIVATE);
        return prefs.getString(preference, "");
    }

    public void savePreference(String key, String value) {

        SharedPreferences prefs = this.context.getSharedPreferences(Credentials.packagee, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public void deletePreference(String key) {

        SharedPreferences prefs = this.context.getSharedPreferences(Credentials.packagee, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key);
        editor.commit();
    }

    public boolean existsPreference(String preference) {

        SharedPreferences prefs = this.context.getSharedPreferences(Credentials.packagee, Context.MODE_PRIVATE);
        String temp =  prefs.getString(preference, "");
        return (temp.equals("")) ? false : true;
    }

    public void printExistedPreferences() {

        SharedPreferences prefs = this.context.getSharedPreferences(Credentials.packagee, Context.MODE_PRIVATE);
        Map<String,?> keys = prefs.getAll();
        for (Map.Entry<String, ?> entry : keys.entrySet()) {
            Log.d("AB_DEV", entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
package com.example.coolweather.util;

import android.text.TextUtils;

import com.example.coolweather.db.City;
import com.example.coolweather.db.Country;
import com.example.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    /*
    * Parse response data from server
    * */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i = 0; i < allProvinces.length(); i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return  true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public static boolean handleCityResponse(String response, int proviceId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities = new JSONArray(response);
                for(int i = 0; i < allCities.length(); i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(proviceId);
                    city.save();
                 }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public static boolean handleCountryResponse(String response, int cityId){
        try{
            if(!TextUtils.isEmpty(response)) {
                JSONArray countryArray = new JSONArray(response);
                for(int i = 0; i< countryArray.length(); i++){
                    JSONObject counturyObject = new JSONObject();
                    Country country = new Country();
                    country.setConturyName(counturyObject.getString("name"));
                    country.setCityId(cityId);
                    country.setWatherId(counturyObject.getString("weather_id"));
                    country.save();
                }
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        return false;
    }


}

package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String conturyName;
    private String watherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConturyName() {
        return conturyName;
    }

    public void setConturyName(String conturyName) {
        this.conturyName = conturyName;
    }

    public String getWatherId() {
        return watherId;
    }

    public void setWatherId(String watherId) {
        this.watherId = watherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

package com.springmvc.entity;

public class Location {
    private Integer locationinfoId;

    private Integer locationinfoCode;

    private String locationinfoName;

    private String locationinfoDescription;

    public Integer getLocationinfoId() {
        return locationinfoId;
    }

    public void setLocationinfoId(Integer locationinfoId) {
        this.locationinfoId = locationinfoId;
    }

    public Integer getLocationinfoCode() {
        return locationinfoCode;
    }

    public void setLocationinfoCode(Integer locationinfoCode) {
        this.locationinfoCode = locationinfoCode;
    }

    public String getLocationinfoName() {
        return locationinfoName;
    }

    public void setLocationinfoName(String locationinfoName) {
        this.locationinfoName = locationinfoName;
    }

    public String getLocationinfoDescription() {
        return locationinfoDescription;
    }

    public void setLocationinfoDescription(String locationinfoDescription) {
        this.locationinfoDescription = locationinfoDescription;
    }
}
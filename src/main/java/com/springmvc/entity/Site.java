package com.springmvc.entity;

import java.util.Date;

public class Site {
    private Integer siteinfoId;

    private Integer siteinfoSite;

    private String siteinfoLocation;

    private Integer siteinfoClassification;

    private Integer siteinfoCountoftrash;

    private Date siteinfoOpentime;

    public Integer getSiteinfoId() {
        return siteinfoId;
    }

    public void setSiteinfoId(Integer siteinfoId) {
        this.siteinfoId = siteinfoId;
    }

    public Integer getSiteinfoSite() {
        return siteinfoSite;
    }

    public void setSiteinfoSite(Integer siteinfoSite) {
        this.siteinfoSite = siteinfoSite;
    }

    public String getSiteinfoLocation() {
        return siteinfoLocation;
    }

    public void setSiteinfoLocation(String siteinfoLocation) {
        this.siteinfoLocation = siteinfoLocation;
    }

    public Integer getSiteinfoClassification() {
        return siteinfoClassification;
    }

    public void setSiteinfoClassification(Integer siteinfoClassification) {
        this.siteinfoClassification = siteinfoClassification;
    }

    public Integer getSiteinfoCountoftrash() {
        return siteinfoCountoftrash;
    }

    public void setSiteinfoCountoftrash(Integer siteinfoCountoftrash) {
        this.siteinfoCountoftrash = siteinfoCountoftrash;
    }

    public Date getSiteinfoOpentime() {
        return siteinfoOpentime;
    }

    public void setSiteinfoOpentime(Date siteinfoOpentime) {
        this.siteinfoOpentime = siteinfoOpentime;
    }
}
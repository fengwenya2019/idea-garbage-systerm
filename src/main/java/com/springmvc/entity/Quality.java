package com.springmvc.entity;

import java.util.Date;

public class Quality {
    private Integer qualityinfoId;

    private Date qualityinfoTime;

    private Integer qualityinfoClassification;

    private Double qualityinfoWeight;

    public Integer getQualityinfoId() {
        return qualityinfoId;
    }

    public void setQualityinfoId(Integer qualityinfoId) {
        this.qualityinfoId = qualityinfoId;
    }

    public Date getQualityinfoTime() {
        return qualityinfoTime;
    }

    public void setQualityinfoTime(Date qualityinfoTime) {
        this.qualityinfoTime = qualityinfoTime;
    }

    public Integer getQualityinfoClassification() {
        return qualityinfoClassification;
    }

    public void setQualityinfoClassification(Integer qualityinfoClassification) {
        this.qualityinfoClassification = qualityinfoClassification;
    }

    public Double getQualityinfoWeight() {
        return qualityinfoWeight;
    }

    public void setQualityinfoWeight(Double qualityinfoWeight) {
        this.qualityinfoWeight = qualityinfoWeight;
    }
}
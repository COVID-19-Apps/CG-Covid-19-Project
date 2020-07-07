package com.cgcovid19project.Models;

public class HealthCareList {

    String sno, district, hospital, bed;

    public HealthCareList() {
    }

    public HealthCareList(String sno, String district, String hospital, String bed) {
        this.sno = sno;
        this.district = district;
        this.hospital = hospital;
        this.bed = bed;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }
}

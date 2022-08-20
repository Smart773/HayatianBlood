package com.mango.hayatianblood.dataClasses;

public class DonorModel {
    private int id_donor;
    private String name;
    private String city;
    private String phone;
    private String Date;
    private String BloodType;

    public DonorModel(String name, String city, String phone, String date, String bloodType) {
        this.name = name;
        this.city = city;
        this.phone = phone;
        Date = date;
        BloodType = bloodType;
    }

    public int getId_donor() {
        return id_donor;
    }

    public void setId_donor(int id_donor) {
        this.id_donor = id_donor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }
}

package com.example.marc.carpricem.Vehicule;

public class Vehicule {

    private String type;
    private String brand;
    private String state;
    private String year;
    private float price;
    private String country;
    private String town;
    private String model;

    public Vehicule(String type, String brand, String model, String state, String year, float price, String country,
                    String town) {
        this.type = type;
        this.brand = brand;
        this.state = state;
        this.year = year;
        this.price = price;
        this.country = country;
        this.town = town;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

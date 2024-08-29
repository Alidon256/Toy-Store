package com.example.toystore.Fragments.ui.home.HomeFragments.Models;

public class ExchangeModel {
    private String productName,productDescription, distance;
    private int ImageResourceID;

    public ExchangeModel(String productName, String productDescription, String distance, int imageResourceID) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.distance = distance;
        ImageResourceID = imageResourceID;
    }

    public  ExchangeModel(){

    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        ImageResourceID = imageResourceID;
    }
}

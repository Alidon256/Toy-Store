package com.example.toystore.Fragments.ui.home.HomeFragments.Models;

public class PaidModel {
    private String productName,distance,exchangePrice,boldPrice,NoBoldPrice;
    private int ImageResourceID;

    public PaidModel(String productName, String distance, String exchangePrice, String boldPrice, String noBoldPrice, int imageResourceID) {
        this.productName = productName;
        this.distance = distance;
        this.exchangePrice = exchangePrice;
        this.boldPrice = boldPrice;
        NoBoldPrice = noBoldPrice;
        ImageResourceID = imageResourceID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getExchangePrice() {
        return exchangePrice;
    }

    public void setExchangePrice(String exchangePrice) {
        this.exchangePrice = exchangePrice;
    }

    public String getBoldPrice() {
        return boldPrice;
    }

    public void setBoldPrice(String boldPrice) {
        this.boldPrice = boldPrice;
    }

    public String getNoBoldPrice() {
        return NoBoldPrice;
    }

    public void setNoBoldPrice(String noBoldPrice) {
        NoBoldPrice = noBoldPrice;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        ImageResourceID = imageResourceID;
    }
}

package com.example.group13.asifur2110384;

import java.time.LocalDate;

public class Datapackage {
    private String packageName;
    private float dataAmount;
    private float price;
    private String availability;

    @Override
    public String toString() {
        return "Datapackage{" +
                "packageName='" + packageName + '\'' +
                ", dataAmount=" + dataAmount +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                ", offerEnds=" + offerEnds +
                '}';
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public float getDataAmount() {
        return dataAmount;
    }

    public void setDataAmount(float dataAmount) {
        this.dataAmount = dataAmount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public LocalDate getOfferEnds() {
        return offerEnds;
    }

    public void setOfferEnds(LocalDate offerEnds) {
        this.offerEnds = offerEnds;
    }

    public Datapackage(String packageName, float dataAmount, float price, String availability, LocalDate offerEnds) {
        this.packageName = packageName;
        this.dataAmount = dataAmount;
        this.price = price;
        this.availability = availability;
        this.offerEnds = offerEnds;
    }

    private LocalDate offerEnds;
}

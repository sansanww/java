package com.it.entity;

public class Record {
    private String customerId;
    private Gift gift;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "Record{" +
                "customerId='" + customerId + '\'' +
                ", gift=" + gift +
                '}';
    }
}

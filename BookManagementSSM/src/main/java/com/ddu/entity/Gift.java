package com.ddu.entity;

public class Gift {
    private int giftId;
    private String giftName;

    public int getGiftId() {
        return giftId;
    }

    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    @Override
    public String toString() {
        return "gift{" +
                "giftId=" + giftId +
                ", giftName='" + giftName + '\'' +
                '}';
    }
}

package com.it.entity;

public class Gift {
    private int id;
    private int age;
    private int gender;
    private int style;
    private String gift;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", style=" + style +
                ", gift='" + gift + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

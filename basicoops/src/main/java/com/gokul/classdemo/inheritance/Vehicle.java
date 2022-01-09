package com.gokul.classdemo.inheritance;

public class Vehicle {
    private  String name="";
    private String color="";
    private String model="";
    private String company="";

    Vehicle(){

    }

    public Vehicle(String name, String color, String model, String company) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

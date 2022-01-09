package com.gokul.classdemo.inheritance;

public class Bike extends Vehicle{

    private boolean fourStroke=false;

    public Bike(String name, String color, String model, String company, boolean fourStroke) {
        super(name, color, model, company);
        this.fourStroke = fourStroke;
    }
}

package com.gokul.Abstaction;

public class Rectangle extends Shape{

    public Rectangle() {
    }

//this method should strictly implemented.

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}

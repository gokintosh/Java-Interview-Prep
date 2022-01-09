package com.gokul.classdemo.inheritance;

public class Car extends Vehicle{

    private boolean powerSteering=false;
    private boolean ledScreen=true;

    public Car(String name, String color, String model, String company, boolean powerSteering, boolean ledScreen) {
        super(name, color, model, company);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean isLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }

    @Override
    public String toString() {
        return "Car{" +
                "powerSteering=" + powerSteering +
                ", ledScreen=" + ledScreen +
                ", model=" + super.getModel() +
                ", color=" + super.getColor() +
                '}';
    }
}

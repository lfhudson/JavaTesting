package com.sparta.lh.oop.zoo;
import java.time.LocalDate;


public class Bird extends Animal {
    private double wingspanInMeters;


    public Bird(String name, int year, int month, int day, double wingspanInMeters) {
        super(name, year, month, day);
        this.wingspanInMeters = wingspanInMeters;
    }


    @Override
    public String speak() {
        return "Chirp! Chirp!";
    }


    public String fly() {
        return getName() + " is flying with a wingspan of " + wingspanInMeters + " meters.";
    }


    public double getWingspanInMeters() {
        return wingspanInMeters;
    }


    public void setWingspanInMeters(double wingspanInMeters) {
        this.wingspanInMeters = wingspanInMeters;
    }

    @Override
    public String move() {
        return "the bird is flying";
    }

    @Override
    public String friends() {
        return "the bird has a group of friends";
    }
}

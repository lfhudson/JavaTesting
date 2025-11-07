package com.sparta.lh.oop.zoo;

import java.time.LocalDate;

public class Elephant extends Animal{
    private float weight;

    public Elephant(String name, int year, int month, int day, float weight) {
        super(name, year, month, day);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String speak() {
        return "hoooo";
    }

    @Override
    public String toString() {
        return super.toString() + " and weighs " + getWeight() + "kg";
    }

    @Override
    public String move() {
        return "the elephant is walking";
    }

    @Override
    public String friends() {
        return "the elephant has a family";
    }
}

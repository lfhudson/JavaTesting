package com.sparta.lh.oop.zoo;

public class Bee extends Animal{
    private String speed;

    public Bee(String name, int year, int month, int day, String speed) {
        super(name, year, month, day);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String speak() {
        return "buzzz";
    }

    @Override
    public String toString() {
        return super.toString() + " and is " + getSpeed();
    }

    @Override
    public String move() {
        return "the bee is flying";
    }

    @Override
    public String friends() {
        return "the bee has thousands of friends";
    }
}
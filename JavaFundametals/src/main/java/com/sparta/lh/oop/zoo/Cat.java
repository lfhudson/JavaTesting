package com.sparta.lh.oop.zoo;

public class Cat extends Animal{
    private String colouring;

    public Cat(String name, int year, int month, int day, String colouring) {
        super(name, year, month, day);
        this.colouring = colouring;
    }

    public String getColouring() {
        return colouring;
    }

    public void setColouring(String colouring) {
        this.colouring = colouring;
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public String toString() {
        return super.toString() + " and is a " + getColouring() + " cat";
    }

    @Override
    public String move() {
        return "the cat is running";
    }

    @Override
    public String friends() {
        return "the cat has friends and enemies";
    }
}

package com.sparta.lh.oop.zoo;

import java.util.Objects;

public class Bear extends Animal{
    private static String colour;

    public Bear(String name, int year, int month, int day, String colour) {
        super(name, year, month, day);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    @Override
    public String speak() {
        return "GRRRR";
    }

    @Override
    public String toString() {
        return super.toString() + " and is a " + getColour() + " bear";
    }

    @Override
    public String move() {
        return "run away theres a bear!";
    }

    @Override
    public String friends() {
        return "the bear has it's cubs";
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Bear bear)) return false;
        return Objects.equals(name, bear.getName())
                && Objects.equals(colour, bear.getColour())
                && Objects.equals(birthdate, bear.getBirthdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour, birthdate);
    }
}
package com.sparta.lh.oop.zoo;

import com.sparta.lh.oop.Movable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal implements Movable, Friend {

    protected static String name;
    protected static LocalDate birthdate;

    public Animal(String name, int year, int month, int day) {
        this.name = name;
        this.birthdate = LocalDate.of(year, month, day);
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public long getAge(){
        return birthdate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public abstract String speak();

    @Override
    public String toString() {
        return getName() + " is " + getAge() + " years old";
    }

}

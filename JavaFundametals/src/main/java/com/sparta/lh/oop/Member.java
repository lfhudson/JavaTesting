package com.sparta.lh.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member implements Movable{

    private final String firstName;
    private String lastName;
    private LocalDate joinDate;

    public Member(String firstName, String lastName, int year, int month, int day) {
        this(firstName, lastName);
        this.joinDate = LocalDate.of(year, month, day);
    }

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public long getMemberDays(){
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    @Override
    public String move() {
        return getFirstName() + " runs";
    }
}
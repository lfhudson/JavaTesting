package com.sparta.lh.refactoring;

public class App {
    public static void main(String[] args) {
        int timeOfDay = 21;
        String result = getGreeting(timeOfDay);
        System.out.println(result);
    }

    public static String getGreeting(int timeOfDay) {
        if(timeOfDay < 0 || timeOfDay > 24 ){
            throw new IllegalArgumentException("Time of day must be a valid hour: " + timeOfDay);
        } else if(timeOfDay >= 5 && timeOfDay <12){
            return "Good morning!";
        } else if(timeOfDay >=12 && timeOfDay <=18){
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}

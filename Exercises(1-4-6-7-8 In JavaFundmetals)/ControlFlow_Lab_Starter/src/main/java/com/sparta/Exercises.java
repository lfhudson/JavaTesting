package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return (temp < 15)? "It's cold" : "It's hot";

    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums) throws Exception {
            if (nums.length == 0) {
                throw new NullPointerException("Array must not be empty");
            }
            int result = 0;
            for (int num : nums) {
                result += num;
            }
           return (double) result /nums.length;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {
        String ticketType = "";
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a valid age: " + age);
        } else if (age < 5) {
            ticketType = "Free";
        } else if (age < 13) {
            ticketType = "Child";
        } else if (age < 18) {
            ticketType = "Student";
        } else if (age < 60) {
            ticketType = "Standard";
        } else {
            ticketType = "OAP";
        }
        return ticketType;
    }

    // Question 4
    public static String grade(int mark)
    {
        var grade = "";
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be a valid mark: " + mark);
        } else if (mark <= 39) {
            grade = "Fail";
        } else {
            if (mark <= 59) {
                grade = "Pass";
            } else {
                if (mark <= 74) {
                    grade = "Pass with Merit";
                } else {
                    if (mark <= 100) {
                        grade = "Pass with Distinction";
                    }
                }
            }
        }
        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel)
    {
        if (covidLevel < 0 || covidLevel > 4) {
            throw new IllegalArgumentException("Covid Level must be a valid Covid Level: " + covidLevel);
        }
        int attendees = switch (covidLevel) {
            case 0 -> 200;
            case 1 -> 100;
            case 2 -> 50;
            case 3 -> 50;
            case 4 -> 20;
            default -> 0;
        };
        return attendees;
    }
}

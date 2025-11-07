package com.sparta.lh.arraylab;


import java.util.Arrays;

public class ArrayExercises {


    //Given an array of integers, convert them to a single int made up of the digits
    public static int toDigits(int[] nums) {
        if (nums.length == 0) {
            throw new NullPointerException("Array must not be empty");
        }
        int digits = 0;
        for (int num : nums) {
            digits *= 10;
            digits += num;
        }
        return digits;
    }

    //Take a string and return it with all the vowels removed in uppercase
    public static String upperVowelRemove(String text) {
        if(text == null){
            throw new NullPointerException("String must not be null");
        }
        return text.replaceAll("[AEIOUaeiou]", "").toUpperCase();
    }

    //For an array of ints, return the second highest number
    public static int secondHighest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two entries");
        }
        int highest = Arrays.stream(nums).max().getAsInt();
        int second = 0;
        for (int num :nums) {
            if (num<highest && num>second) {
                second = num;
            }
        }
        return second;
    }

    //For a String, create an array of all the duplicate letters
    public static String duplicate(String text) {
        if(text == null){
            throw new NullPointerException("String must not be null");
        }
        String noRepeats = "";
        String doubles = "";
        for (char c : text.toCharArray()) {
            if (noRepeats.indexOf(c)!=-1) {
                doubles += c;
            }
            noRepeats += c;
        }
        return doubles;
    }

    //Create a 2 value array which counts all the consonants and vowels in a string
    public static int[] countVowelsConsts(String text) {
        if(text == null){
            throw new NullPointerException("String must not be null");
        }
        int[] counts = new int[2];
        String cVowels = "AEIOUaeiou";
        for (char c : text.toCharArray()) {
            if (cVowels.indexOf(c)!=-1) {
                counts[0]++;
            } else {
                counts[1]++;
            }
        }
        return counts;
    }

    //Write a method that takes a string and a letter and checks if the letter is in that string
    public static boolean isIn(String text,char c) {
        if(text == null){
            throw new NullPointerException("String must not be null");
        }
        return text.indexOf(c)!=-1;
    }

    //Give a sequence of numbers return the sum of all the numbers divisible by 2 and/or 3
    public static int divide(int[] nums) {
        if (nums.length == 0) {
            throw new NullPointerException("Array must not be empty");
        }
        int result = 0;
        for (int num : nums) {
            if (num % 2 == 0 || num % 3 == 0) {
                result += num;
            }
        }
        return result;
    }

    //Given 3 int values, a b c, return their sum.
    // However, if one of the values is 13 then it does not count towards the sum
    // and values to its right do not count. So for example, if b is 13,
    // then both b and c do not count.
    public static int abc(int a, int b, int c) {
        int result = 0;
        if (b==13){
            result = a;
        } else if (a==13) {
            result = b + c;
        }  else if (c==13) {
            result = b + a;
        } else {
            result = c + b + a;
        }
        return result;
    }

    //Given an array of ints, we'll say that a triple is a value appearing 3 times
    // in a row in the array. Return true if the array does not contain any triples.
    public static boolean triple(int[] nums) {
        if (nums.length == 0) {
            throw new NullPointerException("Array must not be empty");
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    //Given an array of scores, return true if there are scores of 100 next to
    // each other in the array. The array length will be at least 2.
    public static boolean score(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two entries");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 100 && nums[i+1] == 100) {
                return true;
            }
        }
        return false;
    }




}

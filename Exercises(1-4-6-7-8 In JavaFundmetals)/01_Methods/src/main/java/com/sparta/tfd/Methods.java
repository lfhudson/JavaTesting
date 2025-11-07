package com.sparta.tfd;

import java.util.Objects;

public class Methods {

    // implement this method so that it returns true if x is greater than or equal to y
    public static boolean greaterEqual(int x, int y) {
        return x>=y;
    }

    // implement this method so that it take an int as an input,
    // squares it, adds 101, divides the result by 7, then subtracts 4.
    // return a double.
    public static double BODMAS(int inputNumber) {
        return (((double) ((inputNumber * inputNumber) + 101) /7) -4);
    }


    // implement this method so that it returns true if input is "password"
    // regardless of case
    public static boolean checkInput(String input) {
        return Objects.equals(input.toLowerCase(), "password");
    }

    // implement this method so that it returns the sum of all the numbers from start to end
    public static int sumNums(int start, int end ) {
        int result = 0;
        if (start==end){
            result = start;
        }else{
            for (int i= start;i<end+1;i++){
                result += i;
            }
        }
        return result;
    }

    // implement this method so that it returns the sum
    // of all the numbers in the array nums
    public static int sumArray(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }
}

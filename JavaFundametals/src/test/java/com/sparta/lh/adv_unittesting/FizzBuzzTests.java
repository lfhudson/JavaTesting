package com.sparta.lh.adv_unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {

    @Test
    @DisplayName("Given one, return one as a string")
    public void givenOne_Return_OneString(){
        Assertions.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "1,1",
                    "2,2"
            }
    )
    @DisplayName("Given a number, return it as a string")
    public void givenNumber_Return_ItsString(int n, String expected){
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(n));
    }

    @Test
    @DisplayName("Given 3, return Fizz")
    public void givenThree_Return_Fizz(){
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @ParameterizedTest
    @CsvSource({
            "3",
            "6"
    })
    @DisplayName("Given a number divisible by three but not five, return Fizz")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int num){
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    @DisplayName("Given 5, return Buzz")
    public void givenFive_Return_Buzz(){
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @ParameterizedTest
    @CsvSource({
            "5",
            "10"
    })
    @DisplayName("Given a number divisible by five but not three, return buzz")
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int num){
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(num));
    }

    @Test
    @DisplayName("Given 15, return FizzBuzz")
    public void givenFifteen_Return_FizzBuzz(){
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @ParameterizedTest
    @CsvSource({
            "15",
            "30"
    })
    @DisplayName("Given a number divisible by fifteen, return FizzBuzz")
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int num){
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(num));
    }
}

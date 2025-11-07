package com.sparta.lh.refactoring;

import com.sparta.lh.exceptions.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

//    @Test
//    @DisplayName("My first test")
//    void firstTest(){
//        Assertions.assertTrue(false);
//    }

    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_GivenATimeOf21_ReturnsGoodEvening(){

        // Arrange
        //int time = 21;
        //String expected = "Good evening!";
        // Act
        //String actual = App.getGreeting(time);
        // Assert
        //Assertions.assertEquals(expected, actual);

        Assertions.assertEquals("Good evening!", App.getGreeting(21));
    }

    @Test
    @DisplayName("getGreeting, when given a time of 0, returns Good evening")
    public void getGreeting_GivenATimeOf0_ReturnsGoodEvening(){
        Assertions.assertEquals("Good evening!", App.getGreeting(0));
    }

    @Test
    @DisplayName("getGreeting, when given a time of -1, returns Good evening")
    public void getGreeting_GivenATimeOfMinus1_ReturnsGoodEvening(){
        Assertions.assertEquals("Good evening!", App.getGreeting(-1));
    }

    //"Good morning"
    @Test
    @DisplayName("getGreeting, when given a time of 6, returns Good morning")
    public void getGreeting_GivenATimeOf6_ReturnsGoodMorning(){
        Assertions.assertEquals("Good morning!", App.getGreeting(6));
    }
    @Test
    @DisplayName("getGreeting, when given a time of 5, returns Good morning")
    public void getGreeting_GivenATimeOf5_ReturnsGoodMorning(){
        Assertions.assertEquals("Good morning!", App.getGreeting(5));
    }
    @Test
    @DisplayName("getGreeting, when given a time of 12, returns Good afternoon")
    public void getGreeting_GivenATimeOf12_ReturnsGoodAfternoon(){
        Assertions.assertEquals("Good afternoon!", App.getGreeting(12));
    }

    //"Good afternoon"
    @Test
    @DisplayName("getGreeting, when given a time of 13, returns Good afternoon")
    public void getGreeting_GivenATimeOf13_ReturnsGoodAfternoon(){
        Assertions.assertEquals("Good afternoon!", App.getGreeting(13));
    }
    @Test
    @DisplayName("getGreeting, when given a time of 18, returns Good afternoon")
    public void getGreeting_GivenATimeOf18_ReturnsGoodAfternoon(){
        Assertions.assertEquals("Good afternoon!", App.getGreeting(18));
    }


    //Params Tests
    @ParameterizedTest
    @ValueSource(ints = {5,11}) // supported numbers, characters, booleans, strings and classes
    @DisplayName("getGreeting, when given a time from 5 to 11, returns good morning")
    public void getGreeting_GivenATimeFrom5To11_ReturnsGoodMorning(int time){
        Assertions.assertEquals("Good morning!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,4}) // supported numbers, characters, booleans, strings and classes
    @DisplayName("getGreeting, when given a time from 0 to 4, returns good evening")
    public void getGreeting_GivenATimeFrom0To4_ReturnsGoodEvening(int time){
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,18}) // supported numbers, characters, booleans, strings and classes
    @DisplayName("getGreeting, when given a time from 12 to 18, returns good afternoon")
    public void getGreeting_GivenATimeFrom12To18_ReturnsGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {19,23}) // supported numbers, characters, booleans, strings and classes
    @DisplayName("getGreeting, when given a time from 19 to 23, returns good evening")
    public void getGreeting_GivenATimeFrom19To23_ReturnsGoodEvening(int time){
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "Good evening!, 0",
            "Good evening!, 4",
            "Good morning!, 5",
            "Good morning!, 11",
            "Good afternoon!, 12",
            "Good afternoon!, 18",
            "Good evening!, 19",
            "Good evening!, 23",
    })
    @DisplayName("getGreeting, when given a time, returns correct response")
    public void getGreeting_GivenATime_ReturnsCorrectResponse(String greeting, int time){
        Assertions.assertEquals(greeting, App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,25})
    @DisplayName("Given a time of less than zero or more than 24, getGreeting throws an Exception")
    public void setGetGreetingPath(int time){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> App.getGreeting(time));
        Assertions.assertEquals("Time of day must be a valid hour: " + time, exception.getMessage());
    }

}
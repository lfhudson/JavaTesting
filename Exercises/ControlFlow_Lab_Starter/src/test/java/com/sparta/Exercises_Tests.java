package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage() throws Exception {
            int[] nums = {3, 8, 1, 7, 3};
            Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName("Given an empty array, average throws an Exception")
    public void averageSadPath(){
        int[] nums = {};
        var exception = Assertions.assertThrows(NullPointerException.class, () -> Exercises.average(nums));
        Assertions.assertEquals("Array must not be empty", exception.getMessage());
    }


//    @Test
//    @DisplayName(("When the Array is empty average returns zero"))
//    public void WhenArrayIsEmpty_Average_ReturnsZero()
//    {
//        int[] nums = {  };
//        Assertions.assertEquals(0, Exercises.average(nums));
//    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an age of less than 0, ticketType throws an Exception")
    public void ticketTypeTestAgeSadPath(){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.ticketType(-1));
        Assertions.assertEquals("Age must be a valid age: -1", exception.getMessage());
    }

    // write unit tests for the 'Grade' method here
    @ParameterizedTest
    @CsvSource( {
            "0, Fail",
            "39, Fail",
            "40, Pass",
            "59, Pass",
            "60, Pass with Merit",
            "74, Pass with Merit",
            "75, Pass with Distinction",
            "100, Pass with Distinction",
    })
    @DisplayName("Testing grades by mark")
    public void GradeTest(int mark, String expected)
    {
        var result = Exercises.grade(mark);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an mark of less than 0 or more than 100, grade throws an Exception")
    public void gradeTestSadPath(){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.grade(-1));
        Assertions.assertEquals("Mark must be a valid mark: -1", exception.getMessage());
        var exception2 = Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.grade(101));
        Assertions.assertEquals("Mark must be a valid mark: 101", exception2.getMessage());
    }

    // write unit tests for the Scottish wedding example here
    @ParameterizedTest
    @CsvSource( {
            "0, 200",
            "1, 100",
            "2, 50",
            "3, 50",
            "4, 20",
    })
    @DisplayName("Testing max attendees by covid level")
    public void CovidLevelTest(int level, int expected)
    {
        var result = Exercises.getScottishMaxWeddingNumber(level);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("Given an Covid Level of less than 0 or more than 4, covidLevel throws an Exception")
    public void covidLevelTestSadPath(){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.getScottishMaxWeddingNumber(-1));
        Assertions.assertEquals("Covid Level must be a valid Covid Level: -1", exception.getMessage());
        var exception2 = Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.getScottishMaxWeddingNumber(5));
        Assertions.assertEquals("Covid Level must be a valid Covid Level: 5", exception2.getMessage());
    }
}

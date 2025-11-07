package com.sparta.lh.arraylab;

import com.sparta.lh.exceptions.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ArrayExercises_Tests {

    //toDigits
    @Test
    @DisplayName("Check array gives correct digits")
    public void CheckDigits()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(38173, ArrayExercises.toDigits(nums));
    }
    @Test
    @DisplayName("Check array gives correct digits with 6,0")
    public void CheckDigits2()
    {
        int[] nums = { 6, 0 };
        Assertions.assertEquals(60, ArrayExercises.toDigits(nums));
    }
    @Test
    @DisplayName("Check array gives correct digits with 1")
    public void CheckDigits3()
    {
        int[] nums = { 1 };
        Assertions.assertEquals(1, ArrayExercises.toDigits(nums));
    }
    @Test
    @DisplayName("Given an empty array, toDigits throws an Exception")
    public void checkDigitsSadPath(){
        int[] nums = {};
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.toDigits(nums));
        Assertions.assertEquals("Array must not be empty", exception.getMessage());
    }

    //upperVowelRemove
    @Test
    @DisplayName("Check array gives correct letters")
    public void CheckUpperVowelRemove()
    {
        Assertions.assertEquals("QWRTYP", ArrayExercises.upperVowelRemove("qwertyuiop"));
        Assertions.assertEquals("", ArrayExercises.upperVowelRemove("aoe"));
    }
    @Test
    @DisplayName("Given empty name, upperVowelRemove throws an Exception")
    public void setNameSadPath(){
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.upperVowelRemove(null));
        Assertions.assertEquals("String must not be null", exception.getMessage());
    }

    //secondHighest
    @Test
    @DisplayName("Check array second highest")
    public void secondHighest()
    {
        int[] nums = { 7, 8, 1, 5, 3 };
        Assertions.assertEquals(7, ArrayExercises.secondHighest(nums));
    }
    @Test
    @DisplayName("Given an array with lass than two entries, secondHighest throws an Exception")
    public void secondHighestSadPath(){
        int[] nums = {};
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ArrayExercises.secondHighest(nums));
        Assertions.assertEquals("Array must have at least two entries", exception.getMessage());
    }

    //duplicate
    @Test
    @DisplayName("Check String gives doubles")
    public void Checkduplicate()
    {
        Assertions.assertEquals("hl", ArrayExercises.duplicate("hhello"));
    }
    @Test
    @DisplayName("Given empty string, duplicate throws an Exception")
    public void duplicateSadPath(){
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.duplicate(null));
        Assertions.assertEquals("String must not be null", exception.getMessage());
    }

    //countVowelsConsts
    @Test
    @DisplayName("Check String gets vowel and const count")
    public void CheckcountVowelsConsts()
    {
        int[] actual = ArrayExercises.countVowelsConsts("hello");
        Assertions.assertEquals(2, actual[0]);
        Assertions.assertEquals(3, actual[1]);
    }
    @Test
    @DisplayName("Given empty string, countVowelsConsts throws an Exception")
    public void CheckcountVowelsSadPath(){
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.countVowelsConsts(null));
        Assertions.assertEquals("String must not be null", exception.getMessage());
    }

    //isIn
    @Test
    @DisplayName("Check if letters are in the word")
    public void CheckIsIn()
    {
        Assertions.assertEquals(true, ArrayExercises.isIn("hello",'e'));
        Assertions.assertEquals(false, ArrayExercises.isIn("hello",'i'));
    }
    @Test
    @DisplayName("Given empty string, isIn throws an Exception")
    public void IsInSadPath(){
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.isIn(null,'i'));
        Assertions.assertEquals("String must not be null", exception.getMessage());
    }

    //Divide
    @Test
    @DisplayName("Check num devide by 2 or 3")
    public void CheckDevide()
    {
        int[] nums = { 3, 4, 5 };
        Assertions.assertEquals(7, ArrayExercises.divide(nums));
    }
    @Test
    @DisplayName("Given an empty array, Divide throws an Exception")
    public void DivideSadPath(){
        int[] nums = {};
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.divide(nums));
        Assertions.assertEquals("Array must not be empty", exception.getMessage());
    }

    //abc
    @Test
    @DisplayName("Check adding a, b, c")
    public void CheckABC()
    {
        Assertions.assertEquals(6, ArrayExercises.abc(1, 2, 3));
        Assertions.assertEquals(1, ArrayExercises.abc(1, 13, 3));
        Assertions.assertEquals(5, ArrayExercises.abc(13, 2, 3));
    }

    //triple
    @Test
    @DisplayName("Check for triples")
    public void CheckTriple()
    {
        int[] nums_false = { 3, 3, 3, 4, 5 };
        int[] nums_true = { 3, 3, 4, 5 };
        Assertions.assertEquals(false, ArrayExercises.triple(nums_false));
        Assertions.assertEquals(true, ArrayExercises.triple(nums_true));;
    }
    @Test
    @DisplayName("Given an empty array, Triple throws an Exception")
    public void TripleSadPath(){
        int[] nums = {};
        var exception = Assertions.assertThrows(NullPointerException.class, () -> ArrayExercises.triple(nums));
        Assertions.assertEquals("Array must not be empty", exception.getMessage());
    }

    //score
    @Test
    @DisplayName("Check for two 100 scores")
    public void CheckScore()
    {
        int[] nums_false = { 100, 1, 100 };
        int[] nums_true = { 1, 100, 100};
        Assertions.assertEquals(false, ArrayExercises.score(nums_false));
        Assertions.assertEquals(true, ArrayExercises.score(nums_true));;
    }
    @Test
    @DisplayName("Given an array with lass than two entries, Score throws an Exception")
    public void ScoreSadPath(){
        int[] nums = {};
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> ArrayExercises.score(nums));
        Assertions.assertEquals("Array must have at least two entries", exception.getMessage());
    }

}
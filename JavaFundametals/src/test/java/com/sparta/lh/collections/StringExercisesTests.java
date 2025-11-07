package com.sparta.lh.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class StringExercisesTests {
    @Test
    @DisplayName("Check correct number form words")
    public void CheckCountWords()
    {
        String[] words = {"The", "cat", "in", "the", "hat"};
        Assertions.assertEquals(2, StringExercises.countWords(words,'t'));
    }
    @Test
    @DisplayName("Check 0 words returned")
    public void CheckCountWords2()
    {
        String[] words = {"The", "cat", "in", "the", "hat"};
        Assertions.assertEquals(0, StringExercises.countWords(words,'w'));
    }

    @Test
    @DisplayName("Check correct number form words")
    public void CheckWordsInString()
    {
        String phrase = "The cat in the hat";
        Assertions.assertEquals(2, StringExercises.countWordsInString(phrase,'t'));
    }
    @Test
    @DisplayName("Check 0 words returned")
    public void CheckWordsInString2()
    {
        String phrase = "The cat in the hat";
        Assertions.assertEquals(0, StringExercises.countWordsInString(phrase,'w'));
    }

    @Test
    @DisplayName("Check correct number form words")
    public void CheckTransformations()
    {
        Assertions.assertEquals("CATHY0123456789", StringExercises.transformations("Cathy",10));
    }
    @Test
    @DisplayName("Check 0 words returned")
    public void CheckTransformations2()
    {
        String phrase = "The cat in the hat";
        Assertions.assertEquals("0123", StringExercises.transformations("",4));
    }
    @Test
    @DisplayName("Check 0 words returned")
    public void CheckTransformations3()
    {
        Assertions.assertEquals("PIANO01234567891011", StringExercises.transformations("Piano",12));
    }

    @Test
    @DisplayName("Check palindrome returns true")
    public void CheckPalindrome()
    {
        Assertions.assertEquals(true, StringExercises.palindrome("civic"));
    }
    @Test
    @DisplayName("Check capitalised palindrome returns false")
    public void CheckPalindrome2()
    {
        Assertions.assertEquals(false, StringExercises.palindrome("Civic"));
    }
    @Test
    @DisplayName("Check empty string returns false")
    public void CheckPalindrome3()
    {
        Assertions.assertEquals(false, StringExercises.palindrome(""));
    }

}

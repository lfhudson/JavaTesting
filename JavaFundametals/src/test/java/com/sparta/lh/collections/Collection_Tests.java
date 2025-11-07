package com.sparta.lh.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Collection_Tests {

    @Test
    @DisplayName("Check correct returned")
    public void CheckDevide()
    {
        HashSet<Integer> nums = new HashSet<>(Arrays.asList(5,10));
        Assertions.assertEquals(nums, App.makeFiveSet(10));
    }
    @Test
    @DisplayName("Check empty returned")
    public void CheckDevide2()
    {
        HashSet<Integer> nums = new HashSet<>();
        Assertions.assertEquals(nums, App.makeFiveSet(4));
    }

    @Test
    @DisplayName("Check correct words returned")
    public void CheckLongWordList()
    {
        List<String> exp = new ArrayList<>(List.of("sentence","words"));
        Assertions.assertEquals(exp, App.longWordList("This sentence has two big words."));
    }
    @Test
    @DisplayName("Check no words returned")
    public void CheckLongWordList2()
    {
        List<String> exp = new ArrayList<>(List.of());
        Assertions.assertEquals(exp, App.longWordList("Not very big."));
    }
}

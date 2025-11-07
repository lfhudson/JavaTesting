package com.sparta.lh.collections;

import com.sparta.lh.oop.zoo.Bear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class App {
    static void main(String[] args) {
//        String message = "The cat in the hate comes back".trim().toLowerCase();
//        HashMap<Character, Integer> lettersCount = new HashMap<>();
//
//        for (char c : message.toCharArray()) {
//            if (c == ' ') continue;
//            lettersCount.put(c, lettersCount.getOrDefault(c, 0) + 1);
//        }
//        System.out.println(lettersCount);

    }
    public static HashSet<Integer> makeFiveSet(int max){
        HashSet<Integer> result = new HashSet<>();
        for (int i = 1; i < max + 1 ; i++) {
             if (i%5 == 0) {
            result.add(i);
             }
        }
        return result;
    }

    public static List<String> longWordList(String sentence) {
        List<String> result = new ArrayList<>();
        List<String> words = new ArrayList<>(List.of(sentence.split("\\W+")));
        for (String word : words) {
            if (word.length()>=5) {
                result.add(word);
            }
        }
        return result;
    }


}

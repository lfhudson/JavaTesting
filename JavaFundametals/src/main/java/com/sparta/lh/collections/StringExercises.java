package com.sparta.lh.collections;

import java.util.HashSet;

public class StringExercises {
    public static int countWords(String[] words, char letter){
        int result = 0;
        for (String word : words) {
            if (letter == word.toLowerCase().toCharArray()[0]) {
                result++;
            }
        }
        return result;
    }

    public static int countWordsInString(String words, char letter){
        return countWords(words.split("\\W+"), letter);
    }

    public static String transformations(String word, int num){
        String result = word.toUpperCase();
        for (int i = 0; i < num; i++) {
            result += i;
        }
        return result;
    }

    public static boolean palindrome(String word){
        String result = word.toUpperCase();
        boolean pal = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.toCharArray()[i] == word.toCharArray()[word.length() - i -1]) {
                pal = true;
            } else {
                return false;
            }
        }
        return pal;
    }
}

package com.sparta.lh.refactoring;

import com.sparta.lh.exceptions.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {

    @ParameterizedTest
    @CsvSource({
            "U films are available., 7",
            "'U, PG films are available and 12A with an adult.', 8",
            "'U, PG films are available and 12A with an adult.', 11",
            "'U, PG & 12 films are available.', 12",
            "'U, PG & 12 films are available.', 14",
            "'U, PG, 12 & 15 films are available.', 15",
            "'U, PG, 12 & 15 films are available.', 17",
            "All films are available., 18"
    })
    @DisplayName("for each age, should return the correct films")
    public void getFilms_For_Ages(String films, int age){
        Assertions.assertEquals(films, FilmClassification.getClassificationsByAge(age));
    }

    @Test
    @DisplayName("Given an age of less than 0, getFilms_For_Ages throws an Exception")
    public void getClassificationsByAgeSadPath(){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> FilmClassification.getClassificationsByAge(-1));
        Assertions.assertEquals("Age of viewer must be a valid age: -1", exception.getMessage());
    }

    @Test
    @DisplayName("Ages under 8 should return U films")
    public void films_U_category(){
        Assertions.assertEquals("U films are available.", FilmClassification.getClassificationsByAge(7));
    }

    @ParameterizedTest
    @ValueSource(ints = {8,11})
    @DisplayName("Ages 8 to 11, should return U, PG films")
    public void getFilms_For_8To11(int age){
        Assertions.assertEquals("U, PG films are available and 12A with an adult.", FilmClassification.getClassificationsByAge(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {12,14})
    @DisplayName("Ages 12 to 14, should return U, PG & 12 films")
    public void getFilms_For_12To14(int age){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,17})
    @DisplayName("Ages 15 to 17, should return U, PG, 12 & 15 films")
    public void getFilms_For_15To17(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19})
    @DisplayName("Ages 18 up, should return all films")
    public void getFilms_For_18Up(int age){
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(age));
    }
}

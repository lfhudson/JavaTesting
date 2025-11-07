package com.sparta.lh.exceptions;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AnimalTests {

    @ParameterizedTest
    @CsvSource(
            {"0,0",
                    "10,10"
            })
    @DisplayName("Given an age of 0 or above, setAge changes the age")
    public void setAgeHappyPath(int newAge, int expectedAge){
        Animal sut = new Animal();
        sut.setAge(newAge);
        Assertions.assertEquals(expectedAge, sut.getAge());
    }

    @Test
    @DisplayName("Given an age of 0 or above, setAge throws an Exception")
    public void setAgeSadPath(){
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> sut.setAge(-1));
        Assertions.assertEquals("Age must not be negative: -1", exception.getMessage());
    }


    @ParameterizedTest
    @CsvSource({
            "'Fido','FIDO'",
            "'Bob','BOB'"
            })
    @DisplayName("Given valid name, setName changes the name")
    public void setNameHappyPath(String newName, String expectedName){
        Animal sut = new Animal();
        sut.setName(newName);
        Assertions.assertEquals(expectedName, sut.getName());
    }

    @Test
    @DisplayName("Given empty name, setName throws an Exception")
    public void setNameSadPath(){
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(NullPointerException.class, () -> sut.setName(null));
        Assertions.assertEquals("Name must not be null", exception.getMessage());
    }

    @Test
    @DisplayName("Given a valid date string, setVaccinationDate sets the correct date")
    public void setVaccinationDateHappyPath() throws Exception {
        Animal sut = new Animal();
        sut.setVaccinationDate("01-01-2023");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Assertions.assertEquals(sdf.parse("01-01-2023"), sut.getVaccinationDate());
    }

    @Test
    @DisplayName("Given an invalid date string, setVaccinationDate throws ParseException")
    public void setVaccinationDateSadPath() {
        Animal sut = new Animal();
        Assertions.assertThrows(ParseException.class, () -> sut.setVaccinationDate("01,june,2024"));
    }
}


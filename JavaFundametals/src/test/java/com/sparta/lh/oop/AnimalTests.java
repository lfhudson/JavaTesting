package com.sparta.lh.oop;

import com.sparta.lh.oop.zoo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    @DisplayName("Bird tests: speak and fly give correct responses, setWingspanInMeters updates")
    void testBirdSpeakAndFly() {
        Bird bird = new Bird("Tweetie", 2024, 3, 1, 0.35);
        assertEquals("Chirp! Chirp!", bird.speak());
        assertEquals("Tweetie is flying with a wingspan of 0.35 meters.", bird.fly());

        bird.setWingspanInMeters(0.40);
        assertEquals(0.40, bird.getWingspanInMeters(), 0.001);
    }

    @Test
    @DisplayName("Elephant tests: speak gives correct response")
    void testElephantSpeak() {
        Elephant elephant = new Elephant("Dumbo", 1990, 8, 18, 5000);

        assertEquals("hoooo", elephant.speak());
    }

    @Test
    @DisplayName("Elephant tests: setWeight updates")
    void testElephantWeight() {
        Elephant elephant = new Elephant("Dumbo", 1990, 8, 18, 5000);
        assertEquals(5000.0, elephant.getWeight(), 0.001);

        elephant.setWeight(5500);
        assertEquals(5500, elephant.getWeight());
    }

    @Test
    @DisplayName("Elephant tests: toString correct response")
    void testElephantToString() {
        Elephant elephant = new Elephant("Dumbo", 1990, 8, 18, 5000);
        assertEquals("Dumbo is 35 years old and weighs 5000.0kg", elephant.toString());
    }

    @Test
    @DisplayName("Bear tests: speak gives correct response")
    void testBearSpeak() {
        Bear barney = new Bear("Barney", 2020, 4, 20, "Brown");
        assertEquals("GRRRR", barney.speak());
    }
    @Test
    @DisplayName("Bear tests: setColour updates")
    void testBearColor() {
        Bear barney = new Bear("Barney", 2020, 4, 20, "Brown");
        assertEquals("Brown", barney.getColour());

        barney.setColour("Black");
        assertEquals("Black", barney.getColour());
    }

    @Test
    @DisplayName("Bear tests: toString correct response")
    void testBearToString() {
        Bear barney = new Bear("Barney", 2020, 4, 20, "Brown");
        assertEquals("Barney is 5 years old and is a Brown bear", barney.toString());
    }

    @Test
    @DisplayName("Bee tests: setSpeed updates")
    void testBeeSpeed() {
        Bee bert = new Bee("Bert", 2025, 5,1,"Fast");
        assertEquals("Fast", bert.getSpeed());

        bert.setSpeed("Slow");
        assertEquals("Slow", bert.getSpeed());
    }

    @Test
    @DisplayName("Bee tests: toString correct response")
    void testBeeToString() {
        Bee bert = new Bee("Bert", 2025, 5,1,"Fast");
        assertEquals("Bert is 0 years old and is Fast", bert.toString());
    }

    @Test
    @DisplayName("Cat tests: setSpeed Colouring")
    void testCatColour() {
        Cat jack = new Cat("Jack", 2009, 1,1,"Black");
        assertEquals("Black", jack.getColouring());

        jack.setColouring("Tabbie");
        assertEquals("Tabbie", jack.getColouring());
    }

    @Test
    @DisplayName("Cat tests: toString correct response")
    void testCatToString() {
        Cat jack = new Cat("Jack", 2009, 1,1,"Black");
        assertEquals("Jack is 16 years old and is a Black cat", jack.toString());
    }

}


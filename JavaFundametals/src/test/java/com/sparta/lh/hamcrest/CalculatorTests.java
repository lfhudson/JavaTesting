package com.sparta.lh.hamcrest;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);
        assertEquals(8.0, calc.add());

        assertThat(calc.add(), is(8.0));

        // These are equivalent to the above
        assertThat("Failed",calc.add(), is(Matchers.equalTo(8.0)));
        assertThat(calc.add(), equalTo(8.0));

    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);
        Assertions.assertTrue(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(true));
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);
        Assertions.assertFalse(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(false));
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);
        Assertions.assertTrue(calc.toString().contains("Calculator"));
        assertThat(calc.toString(), containsString("Calculator"));
    }
    @Test
    void moreStringMatchers(){
        var testString = "The quick brown fox jumps over the lazy dog";

        assertThat(testString, startsWith("The"));

        assertThat(testString, endsWith("dog"));

        assertThat(testString, containsStringIgnoringCase("the quick"));

        assertThat(testString, stringContainsInOrder("quick", "jumps", "lazy"));

        assertThat(testString, not(emptyOrNullString()));

        /**  Write some tests to show:
         1. The string starts with "The"
         2. The string ends with "dog."
         3. The string contains the string (ignoring case) "the quick
         4. The string contains, in order, "quick", "jumps", "lazy"
         5. The string is not empty or null **/

    }
    @Test
    void collectionMatchersExercise(){
        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon"
        );
        assertThat(fruit, hasSize(7));

        assertThat(fruit, containsInRelativeOrder("apple", "banana", "pomegranate", "lemon"));

        assertThat(fruit, hasItems("banana", "pear"));

        assertThat(fruit, hasItems("lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"));

        assertThat(fruit, not(hasItems("grape")));

        assertThat(fruit, not(hasItem(endsWith("z"))));;

        /**
         * Assert the following in the test method using MatcherAssert@
         * 1. There are 7 elements in the collection
         * The collection contains the following items in this order: ["apple", "banana", "pomegranate", "lemon"]
         * 3. The collections contains ["banana", "pear"] in any order
         * 4. The collection contains the following items (they must be in this order in your assertion): ["lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"].
         * 5. The collection does not contain "grap"
         * The collection does not contain an item that ends with the letter "z"
         */
    }

}


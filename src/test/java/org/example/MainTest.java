package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;

import static org.junit.jupiter.api.Assertions.*;

 class MainTest {

    @Test
     void isPositive_shouldReturnTrue_whenGivenPositive() {
        assertTrue(Main.isPositive(2));
    }

    @Test
     void isPositive_shouldReturnFalse_whenGivenNegative() {
        assertFalse(Main.isPositive(-2));
    }

    @Test
     void getFirstLetter_shouldReturnT_whenGivenTest() {
        assertEquals('T',Main.getFirstLetter("Test"));
    }

    @Test
     void getFirstLetter_shouldReturnNull_whenGivenEmptyString() {
        assertNull(Main.getFirstLetter(""));
    }
    @Test
     void divide_shouldReturn5_whenGiven10And2() {
      assertEquals(5,Main.divide(10,2));

    }

    @Test
     void divide_shouldTrowException_whenGivenAnyNumberAnd0() {
      Exception exception=  assertThrows(IllegalArgumentException.class,()->Main.divide(1,0));

        String expectedMessage = "b must not be 0";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage,actualMessage);
    }

    @ParameterizedTest
    @CsvSource({
        "1,false",
        "-2,false",
        "-3,false",
        "0,false",
        "2,true",
        "3,true",
        "4,false",
        "11,true",
    })
     void isPrime(int number, boolean expected) {
      assertEquals(expected,Main.isPrime(number));
    }

}
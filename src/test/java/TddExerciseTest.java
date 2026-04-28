import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TddExerciseTest {

    @Test
    void sum_shouldReturn5_whenGiven2and3() {
        assertEquals(5, TddExercise.sum(2, 3));
    }

    @ParameterizedTest
    @CsvSource({"5,false", "4,true", "0,true"})
    void isEven(int number, boolean expected) {
        assertEquals(expected, TddExercise.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"hallo,h", "Hallo,H", ",", "null,null", "     ,",}, nullValues = {"null"})
    void getFirstLetter(String text, Character expected) {
        assertEquals(expected, TddExercise.getFirstCharacter(text));
    }


    @ParameterizedTest
    @CsvSource(value = {"Food,dooF", "hello world,dlrow olleh", "null,null", " , "}, nullValues = {"null"})
    void reverseString(String text, String expected) {
        assertEquals(expected, TddExercise.reverseString(text));
    }

    @ParameterizedTest
    @CsvSource(value = {"Abcba,true", "Test,false"}, nullValues = {"null"})
    void isPalindrome(String text, boolean expected) {
        assertEquals(expected, TddExercise.isPalindrome(text));
    }

    @ParameterizedTest
    @CsvSource(value = {"Hello,2", "test,1", "testing-testing,4"}, nullValues = {"null"})
    void countVowels(String text, int expected) {
        assertEquals(expected, TddExercise.countVowels(text));
    }

    @ParameterizedTest
    @CsvSource(value = {"5,120", "0,1", "0,1"}, nullValues = {"null"})
    void factorial(int number, int expected) {
        assertEquals(expected, TddExercise.factorial(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"'{1,2}','{3,4}','{1,2,3,4}'",}, nullValues = {"null"})
    void mergeArrays(int[] array1, int[] array2, int[] expected) {
        System.out.println(array1);
        assertEquals(expected, TddExercise.mergeArrays(array1, array2));
    }
}
import java.sql.Array;

public class TddExercise {
    static void main() {
        reverseString(" ");
    }

    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }


    static Character getFirstCharacter(String text) {
        return text == null || text.isEmpty() ? null : text.charAt(0);
    }

    static String reverseString(String text) {
        if (text == null || text.isEmpty()) return null;

        StringBuilder result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(reverseString(text));
    }

    static int countVowels(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            String alphabet = String.valueOf(text.charAt(i));
            if (alphabet.equalsIgnoreCase("a") |
                    alphabet.equalsIgnoreCase("i") |
                    alphabet.equalsIgnoreCase("u") |
                    alphabet.equalsIgnoreCase("e") |
                    alphabet.equalsIgnoreCase("o")
            ) {
                result += 1;
            }
        }
        return result;
    }

    static int factorial(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }


}

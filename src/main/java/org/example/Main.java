package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
    }

    static boolean isPositive(int a) {
        return (a >= 0);
    }

    static Character getFirstLetter(String text) {
        return text.isEmpty() ? null : text.charAt(0);
    }

    static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("b must not be 0");
        return a / b;
    }


    static boolean isPrime(int number) {
        boolean result = true;
        if (number > 1) {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class Calculator {
    private static int a;
    private static int b;
    private static char mathOperation;

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.trim().split(" ");
            a = Integer.parseInt(elements[0]);
            mathOperation = elements[1].charAt(0);
            b = Integer.parseInt(elements[2]);

        return switch (mathOperation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> Math.multiplyExact(a, b);
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            case '/' -> Math.divideExact(a, b);
            default -> Double.MIN_VALUE;
        };
    }
}

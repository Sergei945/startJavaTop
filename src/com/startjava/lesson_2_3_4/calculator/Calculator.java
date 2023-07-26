package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.trim().split(" ");
        int a = Integer.parseInt(elements[0]);
        char mathOperation = elements[1].charAt(0);
        int b = Integer.parseInt(elements[2]);
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

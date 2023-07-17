package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class Calculator {
    private static int a;
    private static int b;
    private static char mathOperation;

    public static double calculate(String mathExpression) {
        Scanner console = new Scanner(System.in);
        String[] elements = mathExpression.trim().split(" ");
        try {
            a = Integer.parseInt(elements[0]);
            mathOperation = elements[1].charAt(0);
            b = Integer.parseInt(elements[2]);
        } catch (RuntimeException  e) {
            System.out.print("Введите корректные значения: ");
            mathExpression = console.nextLine();
            calculate(mathExpression);
        }
        double result = 0;
        switch (mathOperation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = Math.multiplyExact(a, b);
            case '^' -> result = Math.pow(a, b);
            case '%' -> result = a % b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Ошибка. На ноль делить нельзя");
                    break;
                }
                result = (double) a / b;
            }
            default -> System.out.println("Такого оператора нет попробуйте ещё раз");

        }
        return result;
    }
}

package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int a;
    private int b;
    private char mathOperation;

    public double calculate(String option) {
        String[] elements = option.trim().split(" ");
        a = Integer.parseInt(elements[0]);
        mathOperation = elements[1].charAt(0);
        b = Integer.parseInt(elements[2]);
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

package com.startJava.Lesson_2_3_4.calculator;

import java.util.Scanner;
class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculate(String option) {
        String[] mathArray = option.trim().split(" ");
        setA(Integer.parseInt(mathArray[0]));
        setSign(mathArray[1].charAt(0));
        setB(Integer.parseInt(mathArray[2]));
        double result = 0;
        switch (sign) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = Math.multiplyExact(a, b);
            case '^' -> {
                result = Math.pow(a, b);
            }
            case '%' -> result = a % b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Ошибка. На ноль делить нельзя");
                    break;
                }
                result = (double) a / b;
            }
            default -> {
                System.out.println("Такого оператора нет попробуйте ещё раз");
            }
        }
            System.out.printf("Результат : " + a + " " + sign + " " + b + " = %8.3f\n", result);
            return result;
    }
}

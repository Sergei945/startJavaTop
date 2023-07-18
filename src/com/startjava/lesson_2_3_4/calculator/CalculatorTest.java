package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        do {
            if("yes".equals(choice)) {
                System.out.print("Введите математическое выражение: ");
                try {
                    String mathExpression = console.nextLine();
                    double result = Calculator.calculate(mathExpression);
                    if (result != Double.MIN_VALUE && result > 0) {
                        print(result, mathExpression);
                    }
                } catch (RuntimeException e) {
                    System.out.println("Введите корректные значения: ");
                    continue;
                }
            }
            System.out.print("Желаете продолжить вычисления? (yes / no) ");
            choice = console.nextLine();
        } while(!"no".equals(choice));
    }

    public static void print(double result, String mathExpression) {
        String round = (result % 1 == 0) ? ".0" : ".3";
        System.out.printf("Результат : " + mathExpression + " = %" + round + "f\n", result);
    }
}

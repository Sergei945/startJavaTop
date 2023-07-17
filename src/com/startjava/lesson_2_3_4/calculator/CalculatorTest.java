package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        do {
            if("yes".equals(choice)) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = console.nextLine();
                double result = Calculator.calculate(mathExpression);
                if(result == Double.MIN_VALUE) {
                    continue;
                }
                String round = (result % 1 == 0 || result == 0) ? "1.0" : "5.3";
                System.out.printf("Результат : " + mathExpression + " = %"+ round + "f\n", result);
            }
            System.out.print("Желаете продолжить вычисления? (yes / no) ");
            choice = console.nextLine();
        } while(!"no".equals(choice));
    }
}
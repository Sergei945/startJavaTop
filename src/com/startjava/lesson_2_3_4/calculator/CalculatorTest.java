package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        do {
            if("yes".equals(choice)) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = console.nextLine();
                double result = calculator.calculate(mathExpression);
                String round = "8.3";
                if(result == 0.000f) {
                    round = "1.0";
                }
                System.out.printf("Результат : " + calculator.getFirstNum() + " " +
                        calculator.getMathOperation() + " " + calculator.getSecondNum() +
                        " = %"+ round + "f\n", result);
            }
            System.out.print("Желаете продолжить вычисления? (yes / no) ");
            choice = console.nextLine();
        } while(!"no".equals(choice));
    }
}
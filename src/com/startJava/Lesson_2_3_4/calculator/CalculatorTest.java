package com.startJava.Lesson_2_3_4.calculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String option = "yes";
        do {
            if("yes".equals(option)) {
                System.out.print("Введите математическое выражение: ");
                String answer = console.nextLine();
                calculator.calculate(answer);
            }
            System.out.print("Желаете продолжить вычисления? (yes / no) ");
            option = console.nextLine();
        } while(!"no".equals(option));
    }
}
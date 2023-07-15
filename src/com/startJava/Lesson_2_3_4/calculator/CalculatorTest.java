package com.startJava.Lesson_2_3_4.calculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String option = "";
        while(!option.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            option = console.nextLine();
            calculator.calculate(option);
            if(!option.equals("yes") && !option.equals("no")) {
                System.out.print("Желаете продолжить вычисления? (yes / no) ");
                option = console.nextLine();
            }
        }
    }
}
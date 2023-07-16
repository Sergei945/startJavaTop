package com.startJava.Lesson_2_3_4.calculator;

import java.util.Scanner;
class Calculator {
    private int firstNum;
    private int secondNum;
    private char mathOperation;
    private String answer = "yes";

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setsecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double calculate(String option) {
        String[] mathArray = option.trim().split(" ");
        setFirstNum(Integer.parseInt(mathArray[0]));
        setMathOperation(mathArray[1].charAt(0));
        setsecondNum(Integer.parseInt(mathArray[2]));
        double result = 0;
        switch (mathOperation) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = Math.multiplyExact(firstNum, secondNum);
            case '^' -> {
                result = Math.pow(firstNum, secondNum);
            }
            case '%' -> result = firstNum % secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    System.out.println("Ошибка. На ноль делить нельзя");
                    break;
                }
                result = (double) firstNum / secondNum;
            }
            default -> {
                System.out.println("Такого оператора нет попробуйте ещё раз");
            }
        }
        String round = "8.3";
        if(result == 0.000f) {
            round = "1.0";
        }
        System.out.printf("Результат : " + firstNum + " " + mathOperation + " " + secondNum +
                " = %"+ round + "f\n", result);
        return result;
    }
}

package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int firstNum;
    private int secondNum;
    private char mathOperation;

    public int getFirstNum() { return firstNum;}

    public int getSecondNum() { return secondNum;}

    public char getMathOperation() { return mathOperation;}

    public double calculate(String option) {
        String[] mathExpressionArray = option.trim().split(" ");
        firstNum = (Integer.parseInt(mathExpressionArray[0]));
        mathOperation = mathExpressionArray[1].charAt(0);
        secondNum = Integer.parseInt(mathExpressionArray[2]);
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
        return result;
    }
}

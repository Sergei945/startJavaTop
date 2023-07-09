package com.startJava.Lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] intArray = {5, 12, 1, 17, 20, 30, 50};
        System.out.print("До модификации: ");
        printIntArray(intArray);
        System.out.print("После модификации: ");
        intArray = reverseIntArray(intArray);
        printIntArray(intArray);

        System.out.println("\n2. Вывод произведения элементов массива\n");

        intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        toStrProductArrayEls(intArray);

        System.out.println("\n3. Удаление элементов массива\n");

        float[] arrayFloat = new float[15];
        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = (float) Math.random();
        }
        printFloatArray(arrayFloat);
        int countDeleteEls = deleteArrayElements(arrayFloat);
        System.out.println();
        printFloatArray(arrayFloat);
        System.out.println("\nВсего обнулено ячеек - " + countDeleteEls);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");

        char[] arrayChar = new char[26];
        for (char i = 'A', j = 0; i <= 'Z'; i++, j++) {
            arrayChar[j]  = i;
        }
        triangleLetters(arrayChar);

        System.out.println("\n5. Генерация уникальных чисел\n");

        intArray = new int[30];
        addIntElsArray(intArray, 60, 99);
        bubbleSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(intArray[i] + " ");
        }
    }

    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void addIntElsArray(int[] array, int startRandomNum, int endRandomNum) {
        for (int i = 0; i < array.length; i++) {
            int randomNum = (int) (Math.random() * (endRandomNum - startRandomNum)) + startRandomNum;
            for (int j = 0; j < array.length; j++) {
                if(randomNum == array[j]) {
                    j = 0;
                    randomNum = (int) (Math.random() * (endRandomNum - startRandomNum)) + startRandomNum;
                }
            }
            array[i] = randomNum;
        }
    }

    public static void triangleLetters(char[] arrayChar) {
        for (int i = arrayChar.length, count = 1; i > 0; i--, count++) {
            for (int j = 0; j < count; j++) {
                System.out.print(arrayChar[(arrayChar.length - 1) - j]);
            }
            System.out.println();
        }
    }

    public static int deleteArrayElements(float[] array) {
        int count = 0;
        float middleNum = array[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > middleNum) {
                array[i] = 0;
                count++;
            }
        }
        return count;
    }

    public static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printFloatArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %.3f" , array[i]);
            if (i == array.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int[] reverseIntArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static int productArrayEls(int[] array) {
        int result = array[1];
        for (int i = 2; i < array.length - 1; i++) {
            result *= array[i];
        }
        return result;
    }

    public static void toStrProductArrayEls(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i : array) {
             str.append((i != 0 && i != 9) ? i + " " : "");
        }
        System.out.println(str + "= " + productArrayEls(array));
    }
}

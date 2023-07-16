package com.startjava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseIntArray();
        printProductArrayElements();
        deleteArrayElements();
        printLettersStairs();
        generateUniqueNums(60, 99);
    }

    private static void reverseIntArray() {
        System.out.println("1. Реверс значений массива\n");
        int[] numbers = {3, 5, 1, 2, 4, 5, 7};
        System.out.print("До модификации: ");
        print(numbers);
        int len  = numbers.length;
        for (int i = 0; i < len / 2; i++) {
            int swap = numbers[i];
            numbers[i] = numbers[--len];
            numbers[len] = swap;
        }
        System.out.print("После модификации: ");
        print(numbers);
    }

    private static void print(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printProductArrayElements() {
        System.out.println("\n2. Вывод произведения элементов массива\n");
        int[] multipliers = new int[10];
        int len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }
        int result = multipliers[1];
        for (int i = 1; i < len - 1; i++) {
            result *= multipliers[i];
            System.out.print(i + ((i != len - 2) ? " * " : " = " + result));
        }
        System.out.println("\n" + multipliers[0] + " находится под индексом - 0\n" +
                multipliers[len - 1] + " находится под индексом - " + len);
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива\n");
        float[] realNums = new float[15];
        int len = realNums.length;
        for (int i = 0; i < len; i++) {
            realNums[i] = (float) Math.random();
        }
        print(realNums);
        int count = 0;
        float middleCellValue = realNums[len / 2];
        for (int i = 0; i < len; i++) {
            if(realNums[i] > middleCellValue) {
                realNums[i] = 0;
                count++;
            }
        }
        print(realNums);
        System.out.print("Всего обнулено ячеек - " + count + "\n");
    }

    private static void print(float[] floatArray) {
        for (int i = 0; i < floatArray.length; i++) {
            System.out.printf(" %.3f" , floatArray[i]);
            if (i == floatArray.length / 2) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    private static void printLettersStairs() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] alphabet = new char[26];
        int len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        int count = 1;
        for (int i = len; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                System.out.print(alphabet[(len - 1) - j]);
            }
            count++;
            System.out.println();
        }
    }

    private static void generateUniqueNums(int startRandomNum, int endRandomNum) {
        System.out.println("\n5. Генерация уникальных чисел\n");
        int[] uniqueNums = new int[30];
        int len = uniqueNums.length;
        int randomNum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(randomNum == uniqueNums[j]) {
                    j = 0;
                    randomNum = (int) (Math.random() * (endRandomNum - startRandomNum)) + startRandomNum;
                }
            }
            uniqueNums[i] = randomNum;
        }
        bubbleSort(uniqueNums);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(uniqueNums[i] + " ");
        }
    }

    private static void bubbleSort(int[] uniqueNums) {
        for (int i = 0; i < uniqueNums.length - 1; i++) {
            for(int j = 0; j < uniqueNums.length - i - 1; j++) {
                if(uniqueNums[j + 1] < uniqueNums[j]) {
                    int swap = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = swap;
                }
            }
        }
    }
}

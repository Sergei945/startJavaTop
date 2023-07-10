package com.startJava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        reverseIntArray();

        System.out.println("\n2. Вывод произведения элементов массива\n");

        toStringProductArrayElements();

        System.out.println("\n3. Удаление элементов массива\n");

        deleteArrayElements();

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");

        printStairsLetters();

        System.out.println("\n5. Генерация уникальных чисел\n");

        addIntElementsArray(60, 99);

    }

    private static void reverseIntArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int length = array.length / 2;
        if(array.length % 2 == 0) {
            length--;
        }
        for (int i = length, j = array.length / 2; i >= 0; i--, j++) {
            int swap = array[j];
            array[j] = array[i];
            array[i] = swap;
        }
        System.out.print("До модификации: ");
        print(array);
        System.out.print("После модификации: ");
        print(array);
    }

    private static void toStringProductArrayElements() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        StringBuilder str = new StringBuilder();
        for (int i : array) {
            str.append((i != 0 && i != array[array.length - 1]) ? i : "");
            str.append((i != 0 && i != array[array.length - 1] && i != array[array.length - 2]) ? "*" : "");
        }
        System.out.println(str + "=" + productArrayElements(array));
    }

    private static int productArrayElements(int[] array) {
        int result = array[1];
        for (int i = 2; i < array.length - 1; i++) {
            result *= array[i];
        }
        return result;
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void deleteArrayElements() {
        float[] array = new float[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[array.length / 2] < array[i]) {
                array[i] = 0;
                count++;
            }
        }
        print(array);
        System.out.println();
        print(array);
        System.out.println("\nВсего обнулено ячеек - " + count);
    }

    private static void print(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %.3f" , array[i]);
            if (i == array.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStairsLetters() {
        char[] array = new char[26];
        for (int i = 0; i < 26; i++) {
            array[i] = (char) ('A' + i);
        }
        int count = 1;
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                System.out.print(array[(array.length - 1) - j]);
            }
            count++;
            System.out.println();
        }
    }

    private static void addIntElementsArray(int startRandomNum, int endRandomNum) {
        int[] array = new int[30];
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
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

    private static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}

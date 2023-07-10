package com.startJava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("До модификации: ");
        print(arrayInt);
        System.out.print("После модификации: ");
        reverseIntArray(arrayInt);
        print(arrayInt);

        System.out.println("\n2. Вывод произведения элементов массива\n");

        arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i;
        }
        toStrProductArrayElements(arrayInt);

        System.out.println("\n3. Удаление элементов массива\n");

        float[] arrayFloat = new float[15];
        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = (float) Math.random();
        }
        print(arrayFloat);
        System.out.println();
        print(arrayFloat);
        System.out.println("\nВсего обнулено ячеек - " + deleteArrayElements(arrayFloat));

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");

        char[] arrayLetters = new char[26];
        for (int i = 0; i < 26; i++) {
            arrayLetters[i] = (char) ('A' + i);
        }
        printStairsLetters(arrayLetters);

        System.out.println("\n5. Генерация уникальных чисел\n");

        arrayInt = new int[30];
        addIntElementsArray(arrayInt, 60, 99);
        bubbleSort(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(arrayInt[i] + " ");
        }
    }

    private static void reverseIntArray(int[] array) {
        int length = array.length / 2;
        if(array.length % 2 == 0) {
            length--;
        }
        for (int i = length, j = array.length / 2; i >= 0; i--, j++) {
            int swap = array[j];
            array[j] = array[i];
            array[i] = swap;
        }
    }

    private static void toStrProductArrayElements(int[] array) {
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

    private static int deleteArrayElements(float[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[array.length / 2] < array[i]) {
                array[i] = 0;
                count++;
            }
        }
        return count;
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

    private static void printStairsLetters(char[] array) {
        int count = 1;
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                System.out.print(array[(array.length - 1) - j]);
            }
            count++;
            System.out.println();
        }
    }

    private static void addIntElementsArray(int[] array, int startRandomNum, int endRandomNum) {
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

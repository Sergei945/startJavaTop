package com.startJava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseIntArray();
        outProductArrayElements();
        deleteArrayElements();
        printStairsLetters();
        addIntElementsArray(60, 99);
    }

    private static void reverseIntArray() {
        System.out.println("1. Реверс значений массива\n");
        int[] intArray = {3, 5, 1, 2, 4, 5, 7};
        System.out.print("До модификации: ");
        print(intArray);
        int length = intArray.length / 2;
        if(intArray.length % 2 == 0) {
            length--;
        }
        int moreMiddle  = intArray.length / 2;
        for (int lessMiddle = length ; lessMiddle >= 0; lessMiddle--) {
            int swap = intArray[moreMiddle];
            intArray[moreMiddle] = intArray[lessMiddle];
            intArray[lessMiddle] = swap;
            moreMiddle++;
        }
        System.out.print("После модификации: ");
        print(intArray);
    }

    private static void print(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void outProductArrayElements() {
        System.out.println("\n2. Вывод произведения элементов массива\n");
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        StringBuilder str = new StringBuilder();
        int result = intArray[1];
        for (int i = 2; i < intArray.length - 1; i++) {
            str.append((intArray[i] != 0 && i != intArray[intArray.length - 1]) ? i : "");
            str.append((intArray[i] != 0 && i != intArray[intArray.length - 1] &&
                    i != intArray[intArray.length - 2]) ? " * " : "");
            result *= intArray[i];
        }
        System.out.println(str + " = " + result);
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива\n");
        float[] floatArray = new float[15];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) Math.random();
        }
        int count = 0;
        float middleNumArray = floatArray[floatArray.length / 2];
        for (int i = 0; i < floatArray.length; i++) {
            if(floatArray[i] > middleNumArray) {
                floatArray[i] = 0;
                count++;
            }
        }
        print(floatArray);
        print(floatArray);
        System.out.println("\nВсего обнулено ячеек - " + count);
    }

    private static void print(float[] floatArray) {
        for (int i = 0; i < floatArray.length; i++) {
            System.out.printf(" %.3f" , floatArray[i]);
            if (i == floatArray.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }

    private static void printStairsLetters() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] charArray = new char[26];
        for (int i = 0; i < 26; i++) {
            charArray[i] = (char) ('A' + i);
        }
        int count = 1;
        for (int i = charArray.length; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                System.out.print(charArray[(charArray.length - 1) - j]);
            }
            count++;
            System.out.println();
        }
    }

    private static void addIntElementsArray(int startRandomNum, int endRandomNum) {
        System.out.println("\n5. Генерация уникальных чисел\n");
        int[] array = new int[30];
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
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
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

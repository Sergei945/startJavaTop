package com.startJava.Lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        reverseIntArray();
        printProductArrayElements();
        deleteArrayElements();
        printLettersStairs();
        generationUniqueNumbers(60, 99);
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

    private static void printProductArrayElements() {
        System.out.println("\n2. Вывод произведения элементов массива\n");
        int[] multipliers = new int[10];
        int len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }
        StringBuilder str = new StringBuilder();
        int result = multipliers[1];
        for (int i = 1; i < len - 1; i++) {
            str.append(i);
            str.append((multipliers[i] != 0 && i != multipliers[len - 1] &&
                    i != multipliers[len - 2]) ? " * " : "");
            result *= multipliers[i];
        }
        System.out.println(str + " = " + result);
        System.out.println("\n" + multipliers[0] + " находится под индексом - 0\n" +
                multipliers[multipliers.length - 1] + " находится под индексом - " + multipliers.length);
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива\n");
        float[] realNumbers = new float[15];
        int len = realNumbers.length;
        for (int i = 0; i < len; i++) {
            realNumbers[i] = (float) Math.random();
        }
        print(realNumbers);
        int count = 0;
        float middleCellValue = realNumbers[len / 2];
        for (int i = 0; i < len; i++) {
            if(realNumbers[i] > middleCellValue) {
                realNumbers[i] = 0;
                count++;
            }
        }
        print(realNumbers);
        System.out.println("\nВсего обнулено ячеек - " + count);
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

    private static void generationUniqueNumbers(int startRandomNum, int endRandomNum) {
        System.out.println("\n5. Генерация уникальных чисел\n");
        int[] uniqueNums = new int[30];
        int randomNum = 0;
        for (int i = 0; i < uniqueNums.length; i++) {
            for (int j = 0; j < uniqueNums.length; j++) {
                if(randomNum == uniqueNums[j]) {
                    j = 0;
                    randomNum = (int) (Math.random() * (endRandomNum - startRandomNum)) + startRandomNum;
                }
            }
            uniqueNums[i] = randomNum;
        }
        bubbleSort(uniqueNums);
        for (int i = 0; i < uniqueNums.length; i++) {
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

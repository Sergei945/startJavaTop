package com.startjava.Lesson_2_3_4.array;

public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, 5f, .200f,5f};
        System.out.println(numbers1.length);
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

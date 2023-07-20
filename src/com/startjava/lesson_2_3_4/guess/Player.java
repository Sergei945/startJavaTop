package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {

    private String name;

    private int[] nums = new int[10];

    private int attempt = 0;

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public int[] copyNums() {
        return nums;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[attempt];
    }

    public int getIndexArray() { return attempt;}

    public boolean addNum(int num) {
        if((num >= 1 && num <= 100)) {
            nums[attempt] = num;
            attempt++;
            return true;
         }
        System.out.println("Ошибка введено число меньше 1 или больше 100 попробуйте снова");
        return false; 
    }
}
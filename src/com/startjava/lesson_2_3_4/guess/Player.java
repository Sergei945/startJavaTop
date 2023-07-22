package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {

    private String name;
    private int attempt;
    private int[] nums = new int[10];

    public Player(String name) { this.name = name; }

    public String getName() { return name; }

    public int getAttempt() { return attempt; }

    public void addNum(int num) {
        nums[attempt] = num;
        attempt++;
    }

    public int[] copyNums() { return Arrays.copyOf(nums, attempt); }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }
}
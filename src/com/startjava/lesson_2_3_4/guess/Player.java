package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {

    private boolean win = false;
    private String name;
    private int num;
    private int[] numsArray = new int[10];

    private int indexArray = 0;

    public boolean isWin() { return win;}

    public void setWin(boolean win) {
        this.win = win;
    }

    public void clear() {
        this.win = false;
        this.indexArray = 0;
        Arrays.fill(numsArray, 0);
    }

    public void printNumsArray() {
        System.out.print("Попытки игрока " + name + " ");
        int[] newArray = Arrays.copyOf(numsArray,indexArray);
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getIndexArray() { return indexArray;}

    public boolean setNum(int num) {
        if((num >= 1 && num <= 100)) {
            this.num = num;
            numsArray[indexArray] = num;
            indexArray++;
            return true;
         }
        System.out.println("Ошибка введено число меньше 1 или больше 100 попробуйте снова");
        return false; 
    }
}
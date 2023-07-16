package com.startjava.Lesson_1.finish;

class MyFirstGame {

    public static void main(String[] args) {
        int secretNum = 70;
        int playerNum = 30;
        int min = 1;
        int max = 100;
        boolean isMore = false;
        System.out.println("Игра началась угадайте число, которое загадал компьютер" +
                " в диапазоне от 1 до 100");
        while(playerNum != secretNum) {
            if(playerNum < 1 || playerNum > 100) {
                System.out.println("Ошибка число (" + playerNum + ") не в диапазоне от 1 до 100");
                return;
            } 
            if(playerNum < secretNum) {
                System.out.println("число такое-то больше того, что загадал компьютер");
                isMore = true;
            } else {
                System.out.println("число такое-то меньше того, что загадал компьютер");
                isMore = false;
            }
            int maxMinusMinDivTwo = (max - min) / 2;
            if(isMore) {
                min += maxMinusMinDivTwo;
                if(maxMinusMinDivTwo != 0) {
                    playerNum += maxMinusMinDivTwo;
                } else {
                    playerNum++;
                }
            } else {
                max -= maxMinusMinDivTwo;
                playerNum -= maxMinusMinDivTwo;
            }
            System.out.println("Я думаю загаданное число - " + playerNum);
        }
        System.out.println("Поздравляю вы выиграли");
    }
}

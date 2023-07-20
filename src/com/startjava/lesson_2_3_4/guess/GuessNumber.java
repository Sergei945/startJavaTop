package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumber {

    Scanner console = new Scanner(System.in, "cp866");
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {

        System.out.println("Игра началась. Компьютер загадал число от 1 до 100. Отгадайте быстрее соперника\n" +
                "У каждого игрока по 10 попыток");
        randomNum();
        System.out.println(secretNum);
        while (isGuessed(player1) && isGuessed(player2)) { }
        printNums(player1);
        printNums(player2);
        player2.clear();
        player1.clear();
    }

    public boolean isGuessed(Player player) {
        if(player.getNum() == secretNum) {
            System.out.println("Игрок " + player.getName() +
                    " угадал число " + secretNum + " с " + (player.getIndexArray() + 1) + " попытки");
            return false;
        }
        System.out.print(player.getName() + " введите число от 1 до 100 ");
        player.addNum(console.nextInt());
        if(player.getNum() > secretNum) {
            System.out.println("Число " + player.getNum() + " игрока " + player.getName() + 
                    " больше того, что загадал компьютер\n" +
                    "Количество попыток осталось - " + (9 - player.getIndexArray()));
        } else if(player.getNum() < secretNum) {
            System.out.println("Число " + player.getNum() + " игрока " + player.getName() +
                    " меньше того, что загадал компьютер\n" +
                    "Количество попыток осталось - " + (9 - player.getIndexArray()));
        }
        if (player.getIndexArray() == 9) {
            System.out.println("Вы проиграли ваши количество попыток 0");
        }
        return true;
    }

    private void randomNum() {
        secretNum = (int) (Math.random() * 100) + 1;
    }

    public void printNums(Player player) {
        System.out.print("Попытки игрока " + player.getName() + " ");
        int[] newNums = player.copyNums();
        for (int i : newNums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


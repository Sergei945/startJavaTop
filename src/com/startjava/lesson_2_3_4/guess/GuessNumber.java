package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumber {
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
        while (!isGuessed(player1) && !isGuessed(player2)) { }
        printNums(player1);
        printNums(player2);
        player2.clear();
        player1.clear();
    }

    private void randomNum() { secretNum = (int) (Math.random() * 100) + 1; }

    private boolean isGuessed(Player player) {
        int playerNum = entryNum(player);
        if (checkWin(playerNum, player)) {
            return true;
        }
        if (player.getAttempt() >= 10) {
            System.out.println("Вы проиграли ваши количество попыток 0");
            return true;
        }
        return false;
    }

    private int entryNum(Player player) {
        int playerNum;
        Scanner console = new Scanner(System.in, "cp866");
        do {
            System.out.print(player.getName() + " введите число от 1 до 100 ");
            playerNum = console.nextInt();
            player.addNum(playerNum);
            if(playerNum < 1 || playerNum > 100) {
                System.out.println("Ошибка введено число меньше 1 или больше 100 попробуйте снова");
            }
        } while (playerNum < 1 || playerNum > 100);
        return playerNum;
    }

    private boolean checkWin(int playerNum, Player player) {
        if (playerNum == secretNum) {
            System.out.println("Игрок " + player.getName() +
                    " угадал число " + secretNum + " с " + (player.getAttempt()) + " попытки");
            return true;
        }
        System.out.println("Число " + playerNum + " игрока " + player.getName() +
                checkNum(playerNum) + " того, что загадал компьютер\n" +
                "Количество попыток осталось - " + (10 - player.getAttempt()));
        return false;
    }

    private String checkNum(int num) {
        return  (num > secretNum) ? " больше" : " меньше";
    }

    private void printNums(Player player) {
        System.out.print("Попытки игрока " + player.getName() + " ");
        for (int i : player.copyNums()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



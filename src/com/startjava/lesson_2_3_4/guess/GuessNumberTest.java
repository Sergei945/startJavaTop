package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите имя первого игрока - ");
        String name1 = console.nextLine();
        System.out.print("Введите имя второго игрока - ");
        String name2 = console.nextLine();
        GuessNumber game = new GuessNumber(new Player(name1), new Player(name2));
        String choice = "yes";
        do {
            if("yes".equals(choice)) {
                game.play();
            }
            System.out.print("Желаете продолжить игру? (yes / no) ");
            choice = console.nextLine();
        }  while(!"no".equals(choice));
    }
}
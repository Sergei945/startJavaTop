package com.startJava.Lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите имя первого игрока - ");
        String name1 = console.nextLine();
        System.out.print("Введите имя второго игрока - ");
        String name2 = console.nextLine();
        GuessNumber game = new GuessNumber(new Player(name1), new Player(name2));
        String option = "";

        while(!option.equals("no")) {
            game.play();
            do {
                System.out.print("Желаете продолжить игру? (yes / no) ");
                option = console.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}
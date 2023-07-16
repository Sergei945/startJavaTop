package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf vasia = new Wolf();
        vasia.setName("Вася");
        vasia.setSex("Самец");
        vasia.setWeight(35);
        vasia.setColor("Серый");
        vasia.setAge(4);

        System.out.println("В заповеднике есть волк его данные: \n" +
                "Имя - " + vasia.getName() + "\n" +
                "Пол - " + vasia.getSex() + "\n" +
                "Вес - " + vasia.getWeight() + "\n" +
                "Возраст - " + vasia.getAge() + "\n" +
                "Цвет - " + vasia.getColor() + "\n");
        vasia.sit();
        vasia.go();
        vasia.run();
        vasia.howl();
        vasia.hunt();
    }
}
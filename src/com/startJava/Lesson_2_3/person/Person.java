package com.startJava.Lesson_2_3.person;

public class Person {

    String name = "Сергей";
    String sex = "man";
    int height = 175;
    int weight = 100;
    int age = 30;

    void go() {
        System.out.println(name + " идёт");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void speak() {
        System.out.println(name + " говорит");
    }
    
    void learnJava() {
        System.out.println(name + " Учит Java");
    }
}
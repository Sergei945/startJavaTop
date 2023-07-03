package com.startJava.Lesson_2_3.guess;

class Player {

    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public boolean setNum(int num) {
        if((num >= 1 && num <= 100)) {
            this.num = num;
            return true;
         }
        System.out.println("Ошибка введено число меньше 1 или больше 100 попробуйте снова");
        return false; 
    }
}
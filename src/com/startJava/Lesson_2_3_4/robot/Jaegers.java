package com.startJava.Lesson_2_3_4.robot;

class Jaegers {
    private String name;
    private String mark;
    private String status;
    private String origin;
    private int height;
    private int weight;
    private int speed;
    private int strength;
    private int armor;
    private int kaijuKilled;

    public Jaegers() {}

    public Jaegers(String name, String mark, String status, String origin, int height, 
            int weight, int speed, int strength, int armor, int kaijuKilled) {
        this.name = name;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
        setHeight(height);
        setWeight(weight);
        setSpeed(speed);
        setStrength(strength);
        setArmor(armor);
    }

    public void setHeight(int height) {
        if(height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота не может быть меньше нуля");
        }
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес не может быть меньше нуля");
        }
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Скорость не может быть меньше нуля");
        }
    }

    public void setStrength(int strength) {
        if(strength > 0) {
            this.strength = strength;
        } else {
            System.out.println("Сила не может быть меньше нуля");
        }
    }

    public void setArmor(int armor) {
        if(armor > 0) {
            this.armor = armor;
        } else {
            System.out.println("Броня не может быть меньше нуля");
        }
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void go() {
        System.out.println(name + " идёт к цели\n");
    }

    public void scan() {
        System.out.println(name + "сканирует цель\n");
    }

    public void hit() {
        System.out.println(name + " бьёт цель и наносит " + strength + " урона\n");
    }

    public String toString() {
        return "Егерь по имени " + name + 
                " имеет следующие характеристики:\n" +
                "Происхождение - " + origin + "\n" +
                "Марка - " + mark + "\n" +
                "Статус - " + status + "\n" +
                "Вес - " + weight + "\n" +
                "Скорость - " + speed + "\n" +
                "Высота - " + height + "\n" +
                "Сила - " + strength + "\n" +
                "Броня - " + armor + "\n";
    }
}
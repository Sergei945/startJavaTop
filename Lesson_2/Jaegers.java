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

    public Jaegers(String name, String mark, String status, String origin, int height, int weight,
            int speed, int strength, int armor, int kaijuKilled) {
        this.name = name;
        this.mark = mark;
        this.status = status;
        this.origin = origin;

        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес не может быть меньше нуля");
        }
        if(speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Скорость не может быть меньше нуля");
        }
        if(height > 0) {
            this.height = height;
        } else {
            System.out.println("Высота не может быть меньше нуля");
        }
        if(strength > 0) {
            this.strength = strength;
        } else {
            System.out.println("Сила не может быть меньше нуля");
        }
        if(speed > 0) {
            this.armor = armor;
        } else {
            System.out.println("Броня не может быть меньше нуля");
        }
    }
    public Jaegers() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatu(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void go() {
        System.out.println(name + " Идёт к цели");
    }

    public void scan() {
        System.out.println(name + "Сканирует цель");
    }

    public void hit() {
        System.out.println(name + "бьёт цель и наносит " + strength + " урона");
    }
}
class JaegersTest {

    public static void main(String[] args) {
        Jaegers gipsyDanger  = new Jaegers("Gipsy Danger", "Mark-3", 
                "Destroyed", "USA", 260, 1980, 7, 8, 6, 9);
        Jaegers chernoAlpha   = new Jaegers();

        chernoAlpha.setName("Cherno Alpha");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setStatus("Destroyed");
        chernoAlpha.setWeight(2412);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setHeight(280);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        printInfoJeagers(gipsyDanger);
        printInfoJeagers(chernoAlpha);
        gipsyDanger.go();
        gipsyDanger.scan();
        gipsyDanger.hit();
        chernoAlpha.go();
        chernoAlpha.scan();
        chernoAlpha.hit();
    }

    public static void printInfoJeagers(Jaegers jaeger) {
        System.out.println("Егерь по имени " + jaeger.getName() + 
                " имеет следующие характеристики:\n" +
                "Происхождение - " + jaeger.getOrigin() + "\n" +
                "Марка - " + jaeger.getMark() + "\n" +
                "Статус - " + jaeger.getStatus() + "\n" +
                "Вес - " + jaeger.getWeight() + "\n" +
                "Скорость - " + jaeger.getSpeed() + "\n" +
                "Высота - " + jaeger.getHeight() + "\n" +
                "Сила - " + jaeger.getStrength() + "\n" +
                "Броня - " + jaeger.getArmor() + "\n");
    }
}
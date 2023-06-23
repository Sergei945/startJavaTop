class JaegersTest {

    public static void main(String[] args) {
        
        Jaegers chernoAlpha = new Jaegers();
        chernoAlpha.setName("Cherno Alpha");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setStatus("Destroyed");
        chernoAlpha.setWeight(2412);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setHeight(280);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
        System.out.println(chernoAlpha);
        chernoAlpha.go();
        chernoAlpha.scan();
        chernoAlpha.hit();

        Jaegers gipsyDanger  = new Jaegers("Gipsy Danger", "Mark-3", 
                "Destroyed", "USA", 260, 1980, 7, 8, 6, 9);
        System.out.println(gipsyDanger);
        gipsyDanger.go();
        gipsyDanger.scan();
        gipsyDanger.hit();
    }

}
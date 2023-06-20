public class WolfTest {
    public static void main(String[] args) {
        Wolf vasia = new Wolf();
        vasia.name = "Вася";
        vasia.sex = "Самец";
        vasia.weight = 35;
        vasia.color = "Серый";

        System.out.println("В заповеднике есть волк его данные: \n" +
                "Имя - " + vasia.name +
                "\nПол - " + vasia.sex +
                "\nВес - " + vasia.weight +
                "\nЦвет - " + vasia.color);
        vasia.sit();
        vasia.go();
        vasia.run();
        vasia.howl();
        vasia.hunt();
    }
}
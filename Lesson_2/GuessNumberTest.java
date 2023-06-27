import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите имя первого игрока - ");
        String name1 = console.nextLine();
        System.out.print("Введите имя второго игрока - ");
        String name2 = console.nextLine();
        GuessNumber game = new GuessNumber(name1, name2);
        String option = "";

        while(!option.equals("no")) {
            game.playGame();
            do {
                System.out.print("Желаете продолжить игру? (yes / no) ");
                option = console.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}
import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите имя первого игрока - ");
        Player player1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока - ");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String option = "";

        while(!option.equals("no")) {
            if(!Player.win) {
                game.playGame(player1);
                game.playGame(player2);
            } else {
                do {
                    System.out.print("Желаете продолжить игру? (yes / no) ");
                    option = console.nextLine();
                } while(!option.equals("yes") && !option.equals("no"));
            }
        }
    }
}
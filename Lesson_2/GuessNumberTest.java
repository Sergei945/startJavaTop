import java.util.Scanner;

class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Игрок 1 введите ваше имя - ");
        Player playerOne = new Player(console.nextLine());
        System.out.print("Игрок 2 введите ваше имя - ");
        Player playerTwo = new Player(console.nextLine());
        GuessNumber computerGame = new GuessNumber(playerOne, playerTwo);
        String option = "";

        System.out.println("Мы начинаем игру угадай число введите число от 1 до 100");
        while(!option.equals("no")) {
            System.out.print(playerOne.getName() + " введите число ");
            playerOne.setNum(console.nextInt());
            System.out.print(playerTwo.getName() + " введите число ");
            playerTwo.setNum(console.nextInt());
            if(playerTwo.getNum() == -1 || playerTwo.getNum() == -1) {
                System.out.println("Неверные значения попробуйте ещё раз ввести число от 1 до 100");
                continue;
            }
            System.out.println(computerGame.checkNum(playerOne));
            System.out.println(computerGame.checkNum(playerTwo));
            if(computerGame.getSecretNum() == playerOne.getNum() ||
                    computerGame.getSecretNum() == playerTwo.getNum()) {
                do {
                    System.out.print("Желаете продолжить игру? (yes / no) ");
                    option = console.nextLine();
                } while(!option.equals("yes") && !option.equals("no"));
            }
        }
    }
}
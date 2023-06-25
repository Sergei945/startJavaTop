import java.util.Scanner;

class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Игрок 1 введите ваше имя - ");
        Player playerOne = new Player(console.nextLine());
        System.out.print("Игрок 2 введите ваше имя - ");
        Player playerTwo = new Player(console.nextLine());
        GuessNumber computerGame = new GuessNumber(playerOne, playerTwo);
        String option = "";

        System.out.println("Загаданное число " + computerGame.getSecretNum());
        while(!option.equals("no")) {
            System.out.print(playerOne.getName() + " введите число ");
            playerOne.setNum(console.nextInt());
            computerGame.checkNum(playerOne);
            if(computerGame.getSecretNum() != playerOne.getNum()) {
                System.out.print(playerTwo.getName() + " введите число ");
                playerTwo.setNum(console.nextInt());
                computerGame.checkNum(playerTwo);
            }
            if(computerGame.getSecretNum() == playerOne.getNum() ||
                    computerGame.getSecretNum() == playerTwo.getNum()) {
                computerGame.newSecretNum();
                do {
                    System.out.print("Желаете продолжить игру? (yes / no) ");
                    console.nextLine();
                    option = console.nextLine();
                } while(!option.equals("yes") && !option.equals("no"));
            }
        }
    }
}
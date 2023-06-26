import java.util.Scanner;

class GuessNumber {

    Scanner console = new Scanner(System.in, "cp866");
    private int secretNum = (int) (Math.random() * 100) + 1;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame(Player player) {
        if(!Player.win) {
            System.out.println(secretNum);
            System.out.print(player.getName() + " введите число ");
            player.setNum(console.nextInt());
            console.nextLine();
            if(player.getNum() > secretNum) {
                System.out.println("Число " + player.getNum() + " игрока " + player.getName() + 
                        " больше того, что загадал компьютер");
            } else if(player.getNum() < secretNum) {
                System.out.println("Число " + player.getNum() + " игрока " + player.getName() +
                        " меньше того, что загадал компьютер");
            }
        } 
        if(player.getNum() == secretNum) {
            System.out.println("Поздравляю " + player.getName() + 
                    " вы выиграли загаданное число - " + secretNum);
            secretNum = (int) (Math.random() * 100) + 1;
            Player.win = true;
        }
    }
}
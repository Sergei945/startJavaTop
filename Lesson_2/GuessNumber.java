import java.util.Scanner;

class GuessNumber {

    Scanner console = new Scanner(System.in, "cp866");
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void playGame() {
        getRandomNum();
        while(!checkPersonWin(player1) && !checkPersonWin(player2)) {
            checkPersonWin(player1);
            checkPersonWin(player2);
        }
    }

    public boolean checkPersonWin(Player player) {
        if(player1.getNum() != secretNum && player1.getNum() != secretNum) {
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
            getRandomNum();
            return true;
        }
        return false;
    }

    private void getRandomNum() {
        this.secretNum = (int) (Math.random() * 100) + 1;
    }
}
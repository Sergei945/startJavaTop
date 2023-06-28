import java.util.Scanner;

class GuessNumber {

    Scanner console = new Scanner(System.in, "cp866");
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Игра началась. Компьютер загадал число от 1 до 100. Отгадайте быстрее соперника");
        randomNum();
        while(!isGuessed (player1) && !isGuessed(player2)) {}
    }

    public boolean isGuessed(Player player) {
        if(player.getNum() == secretNum) {
            System.out.println("Поздравляю " + player.getName() + 
                    " вы выиграли загаданное число - " + secretNum);
            return true;
        }
        do {
            System.out.print(player.getName() + " введите число от 1 до 100 ");
        } while(!player.setNum(console.nextInt()));
        if(player.getNum() > secretNum) {
            System.out.println("Число " + player.getNum() + " игрока " + player.getName() + 
                    " больше того, что загадал компьютер");
        } else if(player.getNum() < secretNum) {
            System.out.println("Число " + player.getNum() + " игрока " + player.getName() +
                    " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void randomNum() {
        secretNum = (int) (Math.random() * 100) + 1;
    }
}
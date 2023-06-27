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
        System.out.println(secretNum);
        while(!isGuessed (player1) && !isGuessed(player2)) {}
    }

    public boolean isGuessed(Player player) {
        if(player.getNum() != secretNum) {
            do {
                System.out.print(player.getName() + " введите число от 1 до 100 ");
                player.setNum(console.nextInt());
                console.nextLine();
                if(player.getNum() == -1) {
                    System.out.println("Ошибка введено число меньше 1 или больше 100 попробуйте снова");
                }
                } while(player.getNum() == -1);
            }
            if(player.getNum() > secretNum) {
                System.out.println("Число " + player.getNum() + " игрока " + player.getName() + 
                        " больше того, что загадал компьютер");
            } else if(player.getNum() < secretNum) {
                System.out.println("Число " + player.getNum() + " игрока " + player.getName() +
                        " меньше того, что загадал компьютер");
            }
        if(player.getNum() == secretNum) {
            System.out.println("Поздравляю " + player.getName() + 
                    " вы выиграли загаданное число - " + secretNum);
            return true;
        }
        return false;
    }

    private void randomNum() {
        secretNum = (int) (Math.random() * 100) + 1;
    }
}
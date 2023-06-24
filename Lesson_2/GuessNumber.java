class GuessNumber {

    private int secretNum = (int) (Math.random() * 100) + 1;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public int getSecretNum() {
        return secretNum;
    }

    public String checkNum(Player player) {
        return (player.getNum() > secretNum) ?
                ("Число " + player.getNum() + " игрока " + player.getName() +
                        " больше того, что загадал компьютер") :
                player.getNum() < secretNum ?
                ("Число " + player.getNum() + " игрока " + player.getName() +
                        " меньше того, что загадал компьютер") :
                "Поздравляю " + player.getName() + " вы выиграли загаданное число - " + secretNum;
    }

    public void newSecretNum() {
        this.secretNum = (int) (Math.random() * 100) + 1;
    }

}
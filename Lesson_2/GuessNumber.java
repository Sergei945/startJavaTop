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

    public void checkNum(Player player) {
        if(playerOne.getNum() != secretNum && playerTwo.getNum() != secretNum) {
            if(player.getNum() > secretNum) {
               System.out.println("Число " + player.getNum() + " игрока " + player.getName() + 
                        " больше того, что загадал компьютер"); 
            } else if(player.getNum() < secretNum) {
                System.out.println("Число " + player.getNum() + " игрока " + player.getName() +
                        " меньше того, что загадал компьютер");
            }
        } else {
            System.out.println("Поздравляю " + player.getName() + 
                    " вы выиграли загаданное число - " + secretNum);
        }
    }

    public void newSecretNum() {
        secretNum = (int) (Math.random() * 100) + 1;
    }
}
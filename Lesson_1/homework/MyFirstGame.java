class MyFirstGame {

    public static void main(String[] args) {
        int secretNum = 100;
        int playerNum = 50;
        int min = 1;
        int max = 100;
        boolean isMore = false;

        System.out.println("Игра началась угадайте число, которое загадал компьютер" +
                "в диапазоне от 1 до 100");
        while(playerNum == secretNum) {
            if(playerNum > 100 || secretNum < 1) {
                isWin = true;
                System.out.println("Ошибка число (" + playerNum + ") не в диапазоне от 1 до 100");
            } else if(secretNum > 0 && secretNum <= 100) {
                if(playerNum < secretNum) {
                    System.out.println("число такое-то больше того, что загадал компьютер");
                    isMore = true;
                } else if(playerNum > secretNum) {
                    System.out.println("число такое-то меньше того, что загадал компьютер");
                    isMore = false;
                }
                if(isMore) {
                    min += (max - min) / 2;
                    if((max - min) / 2 != 0) {
                        playerNum += (max - min) / 2;
                    } else {
                        playerNum++;
                    }
                } else {
                    max -= (max - min) / 2;
                    playerNum -= (max - min) / 2;
                }
                System.out.println("Я думаю число загаданное - " + playerNum);
            }
        }
        System.out.println("Поздравляю вы выиграли");
    }
}

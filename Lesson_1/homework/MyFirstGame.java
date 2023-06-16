class MyFirstGame {

    public static void main(String[] args) {
        int secretNum = 70;
        int playerNum = 30;
        int min = 1;
        int max = 100;
        boolean isMore = false;

        System.out.println("Игра началась угадайте число, которое загадал компьютер" +
                " в диапазоне от 1 до 100");
        while(playerNum != secretNum) {
            if(playerNum < 1 || playerNum > 100) {
                System.out.println("Ошибка число (" + playerNum + ") не в диапазоне от 1 до 100");
                return;
            } else {
                if(playerNum < secretNum) {
                    System.out.println("число такое-то больше того, что загадал компьютер");
                    isMore = true;
                } else {
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
                System.out.println("Я думаю загаданное число - " + playerNum);
            }
            
        }
        System.out.println("Поздравляю вы выиграли");
    }
}

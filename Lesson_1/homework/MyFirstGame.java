class MyFirstGame {

    public static void main(String[] args) {
        // int comNum = 1 + (int) (Math.random() * 100);
        int comNum = 100;
        int playerNum = 50;
        int min = 1;
        int max = 100;
        boolean isWin = false;
        boolean isMore = false;

        System.out.println("Игра началась угадайте число, которое загадал компьютер" +
         "в диапазоне от 1 до 100");
        while(!isWin) {
            if(playerNum > 100 || comNum < 1) {
                isWin = true;
                System.out.println("Ошибка число (" + playerNum + ") не в диапазоне от 1 до 100");
            } else {
                if(playerNum < comNum && comNum > 0 && comNum <= 100) {
                System.out.println("число такое-то больше того, что загадал компьютер");
                isMore = true;
                } else if(playerNum > comNum && comNum <= 100 && comNum > 0) {
                System.out.println("число такое-то меньше того, что загадал компьютер");
                isMore = false;
                }
                if(isMore == true) {
                     min += (max - min) / 2; 
                     if((max - min) / 2 != 0) {
                        playerNum += (max - min) / 2; 
                    } else {
                        playerNum++;
                     }
                    System.out.println("Я думаю число загаданное - " + playerNum);
                } else {
                    max -= (max - min) / 2;
                    playerNum -= (max - min) / 2;
                    System.out.println("Я думаю число загаданное - " + playerNum);
                }
                if(playerNum == comNum) {
                    System.out.println("Поздравляю вы выиграли");
                    isWin = true;
                }
            }
        }
    }
}

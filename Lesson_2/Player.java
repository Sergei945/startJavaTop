class Player {

    private String name;
    private int num;
    private static boolean win = false;

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if(num >= 1 && num <= 100) {
            this.num = num;
        } else {
            this.num = -1;
        }
    }
}
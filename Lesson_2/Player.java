class Player {

    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public boolean checkNum() {
        if((num >= 1 && num <= 100)) {
            return true;
        } else {
            return false;
        }
    }

    public void setNum(int num) {
            this.num = num;
    }
}
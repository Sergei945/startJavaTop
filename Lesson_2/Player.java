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

    public void setNum(int num) {
        if(num >= 1 && num <= 100) {
            this.num = num;
        } else {
            this.num = -1;
        }
    }
}
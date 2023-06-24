class Player {
    
    private String name;
    private int num;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if(num <= 100 && num >= 1) {
            this.num = num;
        } else {
            this.num = -1;
        }
        
    }

}
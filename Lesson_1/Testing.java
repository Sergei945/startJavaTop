class Testing {
    public static void main(String[] args) {

        int num = 1234322;
        int copyNum  = num;
        int resultReverse = 0;
        boolean isPalindrom = true;

        while(copyNum > 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            resultReverse *= 10;
            resultReverse += digit;
        }
        for (int i = num; i > 0;i /= 10) {
            if(i % 10 != resultReverse % 10) {
               isPalindrom = false;
            }
            resultReverse /= 10;
        }
        System.out.println((isPalindrom)
                ? "Число " + num + " палиндром" : "Число " + num + " не палиндром");
    }
}

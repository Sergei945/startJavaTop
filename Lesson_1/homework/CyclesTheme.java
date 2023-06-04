class CyclesTheme {

    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int num1 = -10;
        int num2 = 21;
        int countEven = 0;
        int countOdd = 0;

        do {
            if(num1 % 2 == 0) {
                countEven++; 
            } else {
                countOdd++;
            }
            num1++;
        } while(num1 <= num2);

            
        


        System.out.println("в промежутке ["+ num1 + ", " + num2 + "] сумма четных чисел = " + 
                countEven + ", а нечетных = " + countOdd + "\n");

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        num1 = 10;
        num2 = 5;
        int num3 = -1;

        int max = 0;
        int min = 0;
        String interval = "";
        if(num1 > num2 && num1 > num3) {
            max = num1;
        } else if(num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        if(num1 < num2 && num1 < num3) {
            min = num1;
        } else if(num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }

        for(int i = max - 1; i > min; i--) {
            interval += i + " ";
        }
        System.out.println(interval);

        System.out.println("3. Вывод реверсивного числа и суммы его цифр\n");

        num1 = 1234;
        String strNum = num1 + "";
        int count = strNum.length() - 1;
        int sum = 0;
        System.out.println("Число в обратном порядке:");
        while(count >= 0) {
            int i = Character.getNumericValue(strNum.charAt(count));
            System.out.println(i);
            sum += i;
            count--;
        }
        System.out.println("сумма его цифр - " + sum + "\n");


    }
}
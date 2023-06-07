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

        System.out.println("4. Вывод чисел на консоль в несколько строк\n");

        num1 = 1;
        num2 = 30;
        count = 1;

        for (int i = num1; i < num2 - 1; i += 2) {
            int length = (int) (Math.log10(i) + 1);
            System.out.printf("%3d", i);
            if(count % 5 == 0) {
                System.out.printf("%n", "");
            }
            count++;
        }
        if(((num2 - 1) / 2 % 5) % 5 == 4) {
            System.out.printf("%" + 3 + "d", 0);
        } else if(((num2 - 1) / 2 % 5) == 3) {
            System.out.printf("%3d%3d", 0, 0);
        } else if(((num2 - 1) / 2 % 5) == 2) {
            System.out.printf("%3d%3d%3d", 0, 0, 0);
        } else if(((num2 - 1) / 2 % 5) == 1) {
            System.out.printf("%3d%3d%3d%3d", 0, 0, 0, 0);
        }
    }
}
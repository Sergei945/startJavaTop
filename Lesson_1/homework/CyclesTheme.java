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
                countEven + ", а нечетных = " + countOdd);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");

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

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

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
        System.out.println("сумма его цифр - " + sum);

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк\n");

        num1 = 1;
        num2 = 30;
        count = 1;
        int spaceRight = 3;
        int length = (int) (Math.log10(num1 + num2) + 2);
        for (int i = num1; i < num2; i += 2) {
            System.out.printf("%" + (length) +"d", i);
            if(count % 5 == 0) {
                System.out.println("");
            }
            count++;
        }   
        if((count - 1) % 5 == 4) {
            System.out.printf("%" + length + "d", 0);
        } else if((count - 1) % 5 == 3) {
            System.out.printf("%" + length + "d%" + length + "d", 0, 0);
        } else if((count - 1) % 5 == 2) {
            System.out.printf("%" + length + "d%" + length + "d%" + length + "d", 0, 0, 0);
        } else if((count - 1) % 5 == 1) {
            System.out.printf("%" + length + "d%" + length +
                "d%" + length + "d%" + length + "d", 0, 0, 0, 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");

        int num = 3242592;
        System.out.print("число " + num);
        int countDigitTwo = 0;
        while(num > 0) {
            int digit = num % 10;
            if(digit == 2) {
                countDigitTwo += 1;
            }
            num /= 10;
        }
        System.out.print(" содержит " + countDigitTwo +
            ((countDigitTwo % 2 == 0) ? " четных" : " нечетных")  + " двоек");
        
        System.out.println("\n\n\n6. Отображение фигур в консоли\n");

        char asterisk = '*';
        for (int i = 1; i <= 50; i++) {
            System.out.print(asterisk);
            if(i % 10 == 0) {
                System.out.println("");
            }
        }
        System.out.println();

        char pound = '#';
        int i = 5;
        while(i > 0) {
            int j = i;
            while(j > 0) {
                System.out.print(pound);
                j--;
            }
            System.out.println("");
            i--;
        }
        System.out.println();

        char dollarSign = '$';
        i = 1;
        int lines = 5;
        double middle = ((double) lines ) / 2;
        int asterisks = 1;
        do {
            int j = 0;
            do {
                System.out.print(dollarSign);
                j++;
            } while (j < asterisks);
            if(i < middle) {
                asterisks += 2;
            } else if(j > middle) {
                asterisks -= 2;
            }
            i++;
            System.out.println();
        } while(i <= lines);

        System.out.println("\n\n7. Отображение ASCII-символов\n");

        System.out.println("i. символы, идущие до цифр и имеющие нечетные коды\n");
        System.out.println("DECIMAL  |  CHARACTER");
        for (i = 1;i < (int) '0';i += 2) {
            char symbol = (char) i;
                System.out.printf("%3d%13s%n", (int) symbol, symbol);
        }

        System.out.println("\nii. маленькие английские буквы, имеющие четные коды\n");
        System.out.println("DECIMAL  |  CHARACTER");
        for (i = (int) 'b';i <= (int) 'z';i += 2) {
            char symbol = (char) i;
            System.out.printf("%4d%13s%n", (int) symbol, symbol);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");

        num = 1234321;
        boolean isPalindrom = true;
        length = (int) (Math.log10(num) + 1);
        for (i = 0; i < (length / 2); i++) {
            if(Integer.toString(num).charAt(i) != Integer.toString(num).charAt(length - i - 1)) {
                System.out.println("Число не палиндром");
                isPalindrom = false;
            }
        }
        System.out.println((isPalindrom)
                ? "Число " + num + " палиндром" : "Число " + num + " не палиндром");

        System.out.println("\n\n9. Определение, является ли число счастливым\n");

        num = 123555321;
        int sumLeft = 0;
        int sumRight = 0;
        length = (int) (Math.log10(num) + 1);
        System.out.println("Определяем счастливое ли число - " + num);
        for (i = length; i >= 1; i--) {
            int digit = num % 10;
            if(i > 0 && i < 4) {
                sumLeft += digit;
            } else if(i <= length && i > length - 3) {
                sumRight += digit;
            }
            num /= 10;
        }
        System.out.println("Сумма первых 3 цифр - " + sumLeft + "\n" +
                "Сумма последних 3 цифр - " + sumRight + "\n" + 
                ((sumRight == sumLeft) ? "Числа равны число счастливое" : "Число не счастливое"));
        System.out.println("\n\n10. Вывод таблицы умножения Пифагора\n");

System.out.println("                ТАБЛИЦА ПИФАГОРА\n");
        for (i = 1; i < 11;i++) {

            for (int j = 1;j < 11;j++) {
            if(i == 1 && j == 1) {
                System.out.printf("%4s", " ");
            } else {
                System.out.printf("%4d", i * j);
            }
            if(j == 1) {
                System.out.printf("%3s", "|");
            }
            }

        System.out.println("");
        if(i == 1) {
            for (int k = 1;k < 11;k++) {
                System.out.printf("%4s", "_____");
            }
            System.out.println("");
        }
        }
    }
}
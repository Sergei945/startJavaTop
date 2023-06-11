class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int finish = 21;
        int countEven = 0;
        int countOdd = 0;
        System.out.print("в промежутке ["+ start + ", " + finish + "]");
        do {
            if(start % 2 == 0) {
                countEven += start; 
            } else {
                countOdd += start;
            }
            start++;
        } while(start <= finish);
        System.out.println(" сумма четных чисел = " + countEven + ", а нечетных = " + countOdd);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = (num1 < num2) ? num1 : (num2 < num3) ? num2 : num3;
        int max = (num1 > num2) ? num1 : (num2 > num3) ? num2 : num3;
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num = 1234;
        String strNum = num + "";
        int count = strNum.length() - 1;
        int sum = 0;
        System.out.println("Число в обратном порядке:");
        while(count >= 0) {
            int i = num % 10;
            System.out.print(i + " ");
            sum += i;
            num /= 10;
            count--;
        }
        System.out.println("сумма его цифр - " + sum);

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк\n");

        start = 1;
        finish = 27;
        count = 1;
        int spaceRight = 3;
        int length = (int) (Math.log10(start + finish) + 2);
        for (int i = start; i < finish; i += 2) {
            System.out.printf("%" + (length) +"d", i);
            if(count % 5 == 0) {
                System.out.println();
            }
            count++;
        }   
        for (int i = 0; i < 5 - ((count - 1) % 5); i++) {
            System.out.printf("%" + length + "d", 0);
        }

        System.out.println("\n\n\n5. Проверка количества двоек на четность/нечетность\n");

        num = 3242592;
        System.out.print("число " + num); 
        int countTwos = 0;
        while(num > 0) {
            if(num % 10 == 2) {
                countTwos += 1;
            }
            num /= 10;
        }
        System.out.println(" содержит (" + countTwos +
            ((countTwos % 2 == 0) ? ") чётное " : ") нечетное ")  + "количество двоек");
        
        System.out.println("\n\n6. Отображение фигур в консоли\n");

        for (int i = 1; i <= 50; i++) {
            System.out.print('*');
            if(i % 10 == 0) {
                System.out.println('*');
            }
        }
        System.out.println();

        int i = 5;
        while(i > 0) {
            int j = i;
            while(j > 0) {
                System.out.print('#');
                j--;
            }
            System.out.println("");
            i--;
        }
        System.out.println();

        i = 1;
        int lines = 5;
        double middle = ((double) lines ) / 2;
        int asterisks = 1;
        do {
            int j = 0;
            do {
                System.out.print('$');
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
            System.out.printf("%3d%13s%n", (int) i, (char) i);
        }
        System.out.println("\nii. маленькие английские буквы, имеющие четные коды\n");
        System.out.println("DECIMAL  |  CHARACTER");
        for (i = (int) 'b';i <= (int) 'z';i += 2) {
            System.out.printf("%4d%13s%n", (int) i, (char) i);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");

        num = 1234321;
        boolean isPalindrom = true;
        length = (int) (Math.log10(num) + 1);
        for (i = 0; i < (length / 2); i++) {
            if(Integer.toString(num).charAt(i) != Integer.toString(num).charAt(length - i - 1)) {
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
            if(i > 0 && i < 4) {
                sumLeft += num % 10;
            } else if(i <= length && i > length - 3) {
                sumRight += num % 10;
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
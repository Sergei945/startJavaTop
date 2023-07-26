package com.startjava.lesson_1.base;

class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int finish = 21;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("в промежутке ["+ start + ", " + finish + "]");
        do {
            if(start % 2 == 0) {
                sumEven += start; 
            } else {
                sumOdd += start;
            }
            start++;
        } while(start <= finish);
        System.out.println(" сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

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
        int copyNum = num;
        int sum = 0;
        int reverseNum = 0;
        while(copyNum > 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            reverseNum = reverseNum * 10 + digit;
            sum += digit;
        }
        System.out.println("Число в обратном порядке: " + reverseNum + " сумма его цифр - " + sum);

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк\n");

        start = 1;
        finish = 27;
        int count = 0;
        int length = (int) (Math.log10(start + finish) + 2);
        for (int i = start; i < finish; i += 2) {
            System.out.printf("%" + length +"d", i);
            count++;
            if(count % 5 == 0) {
                System.out.println();
            }
        }
        if(count % 5 != 0) {
            for (int i = 0; i < (5 - (count % 5)); i++) {
                System.out.printf("%" + length + "d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");

        num = 3242592;
        copyNum = num; 
        int countTwos = 0;
        while(copyNum > 0) {
            if(copyNum % 10 == 2) {
                countTwos++;
            }
            copyNum /= 10;
        }
        System.out.println("число " + num + " содержит (" + countTwos +
                ((countTwos % 2 == 0) ? ") чётное " : ") нечетное ")  + "количество двоек");
        
        System.out.println("\n\n6. Отображение фигур в консоли\n");

        for (int i = 1; i <= 50; i++) {
            System.out.print('*');
            if(i % 10 == 0) {
                System.out.println('*');
            }
        }
        System.out.println();

        int rows = 5;
        while(rows > 0) {
            int lines = rows;
            while(lines > 0) {
                System.out.print('#');
                lines--;
            }
            System.out.println();
            rows--;
        }
        System.out.println();

        rows = 5;
        int middlelines = rows / 2;
        int repeat = 1;
        if(rows % 2 != 0) {
            middlelines += 1;
        }
        int lines = 1;
        do {
            int countWriteChars = 0;
            do {
                System.out.print('$');
                countWriteChars++;
            } while(countWriteChars < repeat);
            System.out.println();
            if(rows % 2 == 0 && lines == middlelines) {
                continue;
            }
            if(repeat < middlelines && lines < middlelines) {
                repeat++;
            } else {
                repeat--;
            }
            lines++;
        } while(lines <= rows);

        System.out.println("\n\n7. Отображение ASCII-символов\n");

        System.out.println("i. символы, идущие до цифр и имеющие нечетные коды\n");
        System.out.println("DECIMAL  |  CHARACTER");
        for (char ch = 1; ch < '0'; ch += 2) {
            System.out.printf("%3d%13c%n", (int) ch, ch);
        }
        System.out.println("\nii. маленькие английские буквы, имеющие четные коды\n");
        System.out.println("DECIMAL  |  CHARACTER");
        for (char ch = 'b'; ch <= 'z'; ch += 2) {
            System.out.printf("%4d%13c%n", (int) ch, ch);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");

        num = 1234321;
        copyNum  = num;
        reverseNum = 0;
        while(copyNum > 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            reverseNum = reverseNum * 10 + digit;
        }
        System.out.println((reverseNum == num)
                ? "Число " + num + " палиндром" : "Число " + num + " не палиндром");

        System.out.println("\n\n9. Определение, является ли число счастливым\n");

        num = 123321;
        copyNum = num;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 6; i <= 6; i--) {
            if(i <= 3) {
                sumLeft += num % 10;
            } else {
                sumRight += num % 10;
            }
            num /= 10;
        }
        System.out.println("Определяем счастливое ли число - " + num + "\nСумма первых 3 цифр - "
                 + sumLeft + "\n" + "Сумма последних 3 цифр - " + sumRight + "\n" + 
                ((sumRight == sumLeft) ? "Числа равны число счастливое" : "Число не счастливое"));

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора\n");

        System.out.println("                ТАБЛИЦА ПИФАГОРА\n");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if(i == 1 && j == 1) {
                    System.out.printf("%4s", " ");
                } else {
                    System.out.printf("%4d", i * j);
                }
                if(j == 1) {
                    System.out.printf("%3s", "|");
                }
            }
            System.out.println();
            if(i == 1) {
                for (int k = 0; k < 11; k++) {
                    System.out.printf("%4s", "____");
                }
                System.out.println();
            }
        }
    }
}
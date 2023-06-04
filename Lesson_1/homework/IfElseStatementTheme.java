class IfElseStatementTheme {

    public static void main(String[] args) {

        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 15;

        if(age > 20) {
            System.out.println("Можно делать детей\n");
        } else {
            System.out.println("Ещё можно погулять\n");
        }

        boolean isMan = true;

        if(!isMan) {
            System.out.println("женщина\n");
        } else {
            System.out.println("мужчина\n");
        }

        float personLength = 1.5f;
        if(personLength < 1.80) {
            System.out.println("Обычный рост\n");
        } else {
            System.out.println("Великан\n");
        }

        String name = "Max";

        char firstChar = name.charAt(0);

        if(firstChar == 'M') {
            System.out.println("Поздравляю ты Миша, Макс, Матвей или ещё кто-то на М\n\n");
        } else if(firstChar == 'I') {
            System.out.println("Поздравляю ты Игорь, Игнат, Иван или ещё кто-то на И\n\n");
        } else {
            System.out.println("Ты на другие буквы\n\n");
        }

        System.out.println("2. Поиск max и min числа\n");

        int num1 = 5;
        int num2 = 8;

        if(num1 > num2) {
            System.out.println("num1: " + num1 + " больше чем " + "num2: " + num2 + "\n\n");
        } else if(num2 > num1) {
            System.out.println("num2: " + num2 + " больше чем " + "num1: " + num1 + "\n\n");
        } else {
            System.out.println("Числа равны\n\n");
        }

        System.out.println("3. Проверка числа\n");

        int checkNum = -5;

        if(checkNum != 0) {
            System.out.println("i. Число не ноль");
            if(checkNum % 2 == 0) {
                System.out.println("ii. Число чётное");
            } else {
                System.out.println("ii. Число не чётное");
            }
            if(checkNum < 0) {
                System.out.println("iii. Число отрицательное\n\n");
            } else {
                System.out.println("iii. Число положительное\n\n");
            }
        } else {
            System.out.println("Число равно 0 поэтому дальше код не идёт\n\n");
        }

        System.out.println("4. Поиск одинаковых цифр в числах\n");

        num1 = 123; 
        num2 = 223;
        int a1 = num1 / 100; // сотни
        int b1 = (num1 / 10) % 10; // десятки
        int c1 = (num1 % 100) % 10; // единицы
        int a2 = num2 / 100;
        int b2 = (num2 / 10) % 10;
        int c2 = (num2 % 100) % 10;

        System.out.println("i. Исходные числа: " + num1 + " и " + num2 + "\n");
        if(num1 == num2) {
            System.out.println("ii. одинаковые в них цифры: " + a1 +", " + b1 + ", " + c1 + "\n" + 
                    "iii. номера разрядов: " + a1 + " - сотни" + ", " + b1 + 
                    " - десятки" + ", " + c1 + " - единицы" + "\n\n");
        } else if(a1 == a2 && b1 == b2) {
            System.out.println("ii. одинаковые в них цифры: " + a1 +", " + b1 + "\n" + 
                    "iii. номера разрядов: " + a1 + " - сотни" + ", " + b1 + " - десятки" + "\n\n");
        } else if(c1 == c2 && b1 == b2) {
            System.out.println("ii. одинаковые в них цифры: " + b1 +", " + c1 + "\n" + 
                    "iii. номера разрядов: " + b1 + " - десятки" + 
                    ", " + c1 + " - единицы" + "\n\n");
        } else if(c1 == c2 && a1 == a2) {
            System.out.println("ii. одинаковые в них цифры: " + a1 +", " + c1 + "\n" +
                    "iii. номера разрядов: " + a1 + " - сотни" + ", " + c1 + " - единицы" + "\n\n");
        } else if(a1 == a2) {
            System.out.println("ii. одинаковые в них цифры: " + a1 + "\n" +
                    "iii. номера разрядов: " + a1 + " - сотни" + "\n\n");
        } else if(b1 == b2) {
            System.out.println("ii. одинаковые в них цифры: " + b1 + "\n" + 
                    "iii. номера разрядов: " + b1 + " - десятки" + "\n\n");
        } else if(c1 == c2) {
            System.out.println("ii. одинаковые в них цифры: " + c1 + "\n" +
                    "iii. номера разрядов: " + c1 + " - единицы" + "\n\n");
        } else {
            System.out.println("ii. Нет одинаковых чисел " + "\n\n");
        }

        System.out.println("5. Определение символа по его коду\n");

        char ch = '\u0002';
        int in = ch;
        
        if(in >= 48 && in <= 57) {
            System.out.println("число\n\n");
        } else if(in >= 65 && in <= 90 || in >= 128 && in <= 159 || in == 240) {
            System.out.println("большая буква\n\n");
        } else if(in >= 97 && in <= 122 || in >= 160 && in <= 175 ||
                 in >= 224 && in <= 239 || in == 241) {
            System.out.println("маленькая буква\n\n");
        } else {
            System.out.println("не буква и не число\n\n");
        }
        
        System.out.println("6. Подсчет суммы вклада и начисленных банком %\n");

        float deposit = 299000;
        float profit = 0;
        if(deposit < 100000) {
            profit += (deposit * 0.05) + deposit;
        } else if(deposit < 300000) {
            profit += (deposit * 0.07) + deposit;
        } else {
            profit += (deposit * 0.10) + deposit;
        }
        
        System.out.println("i. Сумма вклада - " + deposit + "\n" +
                "ii. Начисленный процент - " + (profit - deposit) + "\n" +
                "iii. Итоговую сумму с % - " + profit + "\n\n");

        System.out.println("7. Определение оценки по предметам %\n");

        int history = 59;
        int programming = 91;
        int historyGrade = 0;
        int programmingGrade = 0;

        if(history <= 60 && history >= 0) {
            historyGrade += 2;
        } else if(history > 60 && history <= 73) {
            historyGrade += 3;
        } else if(history > 73 && history <= 91) {
            historyGrade += 4;
        } else if(history > 91 && history <= 100) {
            historyGrade += 5;
        }
        if(programming <= 60 && programming >= 0) {
            programmingGrade += 2;
        } else if(programming > 60 && programming <= 73) {
            programmingGrade += 3;
        } else if(programming > 73 && programming <= 91) {
            programmingGrade += 4;
        } else if(programming > 91 && programming <= 100) {
            programmingGrade += 5;
        }

        System.out.println("оценки:\n" + 
                historyGrade + " - история \n" + 
                programmingGrade + " - программирование \n" +
                " средний балл оценок по предметам - " + ((programmingGrade + historyGrade) / 2) +
                " средний балл % по предметам - " + ((programming + history) / 2) + "\n\n");

        System.out.println("8. Расчет прибыли за год\n");

        int rentBuilding = 5000;
        int profitForMonth = 13000;
        int priceProduct = 9000;

        int profitForYear = (profitForMonth - (rentBuilding + priceProduct)) * 12;

        if(profitForYear < 0) {
            System.out.println("прибыль за год: " + profitForYear + " руб.\n\n");
        } else if(profitForYear > 0) {
            System.out.println("прибыль за год: " + "+" + profitForYear + "руб.\n\n");
        } else {
            System.out.println("прибыль за год: " + profitForYear + "руб.\n\n");
        }

        System.out.println("9. Подсчет количества банкнот\n");

        int money = 567;

        int b100 = 10;
        int b10 = 5;
        b1 = 50;
        System.out.println("i. номиналы в наличии: сотни - "  + b100 + ", десятки - " + 
                b10 + ", единицы - " + b1);

        int countB100 = 0;
        int countB10 = 0;
        int countB1 = 0;
        while(money > 0) {
            if(b100 != 0 && money > 100) {
                money -= 100;
                b100--;
                countB100++;
            }else if(b10 != 0 && money > 10) {
                money -= 10;
                b10--;
                countB10++;
            }else if(b1 != 0 && money > 0) {
                money -= 1;
                b1--;
                countB1++;
            }
        }
        System.out.println(
                "ii. требуемое их количество: сотни - "  + countB100 + ", десятки - " + 
                countB10 + ", единицы - " + countB1 + "\n" +
                "iii. выдаваемая сумма: " + ((countB100 * 100) + (countB10 * 10) + (countB1 * 1)));

    }
}
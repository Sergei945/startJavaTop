class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 15;
        boolean maleGender = true;

        if(age > 20) {
            System.out.println("Тебе уже " + age + " можешь делать детей.");
        } else {
            System.out.println("Тебе ещё " + age + " можешь погулять.");
        }
        if(!maleGender) {
            System.out.println("Ты женщина.");
        } else {
            System.out.println("Ты мужчина.");
        }
        float personHeight = 1.5f;
        if(personHeight < 1.80) {
            System.out.println("У тебя обычный рост.");
        } else {
            System.out.println("Ты великан.");
        }

        char firstCharName = "Max".charAt(0);

        if(firstCharName == 'M') {
            System.out.println("Поздравляю ты Миша, Макс, Матвей или ещё кто-то на М");
        } else if(firstCharName == 'I') {
            System.out.println("Поздравляю ты Игорь, Игнат, Иван или ещё кто-то на И");
        } else {
            System.out.println("Ты на другие буквы");
        }

        System.out.println("\n\n2. Поиск max и min числа\n");

        int num1 = 5;
        int num2 = 8;

        if(num1 > num2) {
            System.out.println("num1: " + num1 + " больше чем " + "num2: " + num2);
        } else if(num2 > num1) {
            System.out.println("num2: " + num2 + " больше чем " + "num1: " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n\n3. Проверка числа\n");

        int checkNum = -5;

        if(checkNum != 0) {
            if(checkNum % 2 == 0) {
                System.out.println("ii. Число чётное");
            } else {
                System.out.println("ii. Число не чётное");
            }
            if(checkNum < 0) {
                System.out.println("iii. Число отрицательное");
            } else {
                System.out.println("iii. Число положительное");
            }
        } else {
            System.out.println("Число равно " + checkNum + " поэтому дальше код не идёт");
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        num1 = 123; 
        num2 = 223;
        int hundreds1 = num1 / 100;
        int tens1 = (num1 / 10) % 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = (num2 / 10) % 10;
        int ones2 = num2 % 10;

        System.out.println("Исходные числа: num1 - " + num1 + ", num2 - " + num2 + "\n" +
                "Одинаковые в них цифры: ");
                if (hundreds1 == hundreds2) {
                    System.out.println("сотни 1 разряд - " + hundreds1);
                }
                if (tens1 == tens2) {
                    System.out.println("десятки 2 разряд - " + tens1);
                }
                if (ones1 == ones2) {
                    System.out.println("единицы 3 разряд - " + tens1);
                }

        System.out.println("\n\n5. Определение символа по его коду\n");

        char symbol = '\u0057';

        
        if(symbol >= '0' && symbol <= '9') {
            System.out.println("число");
        } else if(symbol >= 'A' && symbol <= 'Z' || symbol >= 'А' && 
                symbol <= 'Я' || symbol == 'Ё') {
            System.out.println("большая буква");
        } else if(symbol >= 'a' && symbol <= 'z' || symbol >= 'а' && symbol <= 'п' ||
                symbol >= 'р' && symbol <= 'я' || symbol == 'ё') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }
        
        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %\n");

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
                "iii. Итоговую сумму с % - " + profit);

        System.out.println("\n\n7. Определение оценки по предметам %\n");

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
                " средний балл % по предметам - " + ((programming + history) / 2));

        System.out.println("\n\n8. Расчет прибыли за год\n");

        int rentBuilding = 5000;
        int profitForMonth = 13000;
        int priceProduct = 9000;

        int profitForYear = (profitForMonth - (rentBuilding + priceProduct)) * 12;

        if(profitForYear < 0) {
            System.out.println("прибыль за год: " + profitForYear + " руб.");
        } else if(profitForYear > 0) {
            System.out.println("прибыль за год: " + "+" + profitForYear + "руб.");
        } else {
            System.out.println("прибыль за год: " + profitForYear + "руб.");
        }

        System.out.println("\n\n9. Подсчет количества банкнот\n");

        int money = 567;
        int b100 = 10;
        int b10 = 5;
        int b1 = 50;
        int countB100 = 0;
        int countB10 = 0;
        int countB1 = 0;

        System.out.println("i. номиналы в наличии: сотни - "  + b100 + ", десятки - " + 
                b10 + ", единицы - " + b1);
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
class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        
        int age = 15;
        if(age > 20) {
            System.out.println("Тебе уже " + age + " можешь делать детей.");
        } else {
            System.out.println("Тебе ещё " + age + " можешь погулять.");
        }
        boolean maleGender = true;
        if(!maleGender) {
            System.out.println("Ты женщина.");
        } else {
            System.out.println("Ты мужчина.");
        }
        float height = 1.5f;
        if(height < 1.80) {
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
        num2 = 456;
        int hundreds1 = num1 / 100;
        int tens1 = (num1 / 10) % 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = (num2 / 10) % 10;
        int ones2 = num2 % 10;
        System.out.println("Исходные числа: num1 - " + num1 + ", num2 - " + num2 + "\n" +
                "Одинаковые в них цифры: ");
        if(hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            if (ones1 == ones2) {
                System.out.println("единицы 1 разряд - " + ones1);
            }
            if (tens1 == tens2) {
                System.out.println("десятки 2 разряд - " + tens1);
            }
            if (hundreds1 == hundreds2) {
                System.out.println("сотни 3 разряд - " + hundreds1);
            }
        } else {
            System.out.println("Данные числа не имею одинаковых цифр");
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

        float deposit = 300000f;
        float profit = (float) ((deposit * 0.05) + deposit);
        if(deposit <= 300000 && deposit >= 100000) {
            profit += (deposit * 0.07) + deposit;
        } else if (deposit > 300000){
            profit += (deposit * 0.10) + deposit;
        }
        
        System.out.println("i. Сумма вклада - " + deposit + "\n" +
                "ii. Начисленный процент - " + (profit - deposit) + "\n" +
                "iii. Итоговую сумму с % - " + profit);

        System.out.println("\n\n7. Определение оценки по предметам %\n");

        int historyGradePercent = 59;
        int programmingGradePercent = 91;
        int historyGradeDigit = 0;
        int programmingGradeDigit = 0;
        if(historyGradePercent <= 60 && historyGradePercent >= 0) {
            historyGradeDigit = 2;
        } else if(historyGradePercent > 60 && historyGradePercent <= 73) {
            historyGradeDigit = 3;
        } else if(historyGradePercent > 73 && historyGradePercent <= 91) {
            historyGradeDigit = 4;
        } else if(historyGradePercent > 91 && historyGradePercent <= 100) {
            historyGradeDigit = 5;
        }
        if(programmingGradePercent <= 60 && programmingGradePercent >= 0) {
            programmingGradeDigit = 2;
        } else if(programmingGradePercent > 60 && programmingGradePercent <= 73) {
            programmingGradeDigit = 3;
        } else if(programmingGradePercent > 73 && programmingGradePercent <= 91) {
            programmingGradeDigit = 4;
        } else if(programmingGradePercent > 91 && programmingGradePercent <= 100) {
            programmingGradeDigit = 5;
        }
        System.out.println("оценки:\n" + historyGradeDigit + " - история \n" + 
                programmingGradeDigit + " - программирование \n" +
                " средний балл оценок по предметам - " + 
                ((programmingGradeDigit + historyGradeDigit) / 2) +
                " средний балл % по предметам - " + 
                ((programmingGradePercent + historyGradePercent) / 2));

        System.out.println("\n\n8. Расчет прибыли за год\n");

        int rentBuilding = 5000;
        int profitForMonth = 10000;
        int priceProduct = 9000;
        int profitForYear = (profitForMonth - (rentBuilding + priceProduct)) * 12;
        if(profitForYear <= 0) {
            System.out.println("прибыль за год: " + profitForYear + " руб.");
        } else if(profitForYear > 0) {
            System.out.println("прибыль за год: " + "+" + profitForYear + "руб.");
        } 

        System.out.println("\n\n9. Подсчет количества банкнот\n");

        int money = 567;
        int hundreds = money / 100;
        int tens = (money / 10) % 10;
        int ones = money % 10;
        int inCash100 = 10;
        int inCash10 = 5;
        int inCash1 = 50;
        int outCash100 = 0;
        int outCash10 = 0;
        int outCash1 = 0;
        if(hundreds <= inCash100 && tens * 10 + ones <= inCash10 * 10 + inCash1 && ones <= inCash1) {
            if(inCash100 > hundreds) {
                outCash100 += hundreds;
                inCash100 -= hundreds;
                hundreds = 0;
            } else {
                outCash100 += inCash100;
                hundreds -= inCash100;
                inCash100 = 0;
            }
            tens += hundreds * 10;
            if(inCash10 > tens) {
                outCash10 += tens;
                inCash10 -= tens;
                tens = 0;
            } else {
                outCash10 += inCash10;
                tens -= inCash10;
                inCash10 = 0;
            }
            ones += tens * 10;

            if(inCash1 > ones) {
                outCash1 += ones;
                inCash1 -= ones;
                ones = 0;
            } else {
                outCash1 += inCash1;
                ones -= inCash1;
                inCash1 = 0;
            }
            System.out.println("i. номиналы в наличии: сотни - "  + inCash100 +
                ", десятки - " + inCash10 + " , единицы - " + inCash1);
            System.out.println("ii. Требуемое их количество - "  + outCash100 + ", десятки - " + outCash10 + 
                " , единицы - " + outCash1 + "\n" + 
                "iii. выдаваемая сумма: " + ((outCash100 * 100) + (outCash10 * 10) + (outCash1 * 1)));
        } else {
            System.out.println("Недостаточно средств");
        }
        
    }
}
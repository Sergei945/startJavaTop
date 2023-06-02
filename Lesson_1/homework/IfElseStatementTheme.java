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
            System.out.println("Поздравляю ты Миша, Макс, Матвей или ещё кто-то на М");
        } else if(firstChar == 'I') {
            System.out.println("Поздравляю ты Игорь, Игнат, Иван или ещё кто-то на И");
        } else {
            System.out.println("Ты на другие буквы");
        }

        System.out.println("\n2. Поиск max и min числа\n");

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
            System.out.println("i. Число не ноль");
            if(checkNum % 2 == 0) {
                System.out.println("ii. Число чётное");
            } else {
                System.out.println("ii. Число не чётное");
            }
            if(checkNum < 0) {
                System.out.println("iii. Число отрицательное\n");
            } else {
                System.out.println("iii. Число положительное\n");
            }
            System.out.println("");
        } else {
            System.out.println("Число равно 0 поэтому дальше код не идёт\n");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        num1 = 123; 
        num2 = 321;

        int numHundreds = num / 100;
        int numTens = (num / 10) % 10;
        int numUnits = (num % 100) % 10;
    }
}
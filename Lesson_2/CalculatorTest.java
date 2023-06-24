import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner console = new Scanner(System.in);
        String option = "";

        while(!option.equals("no")) {
            System.out.print("Введите первое число: ");
            calculator.setA(console.nextInt());
            System.out.print("Введите знак математической операции: ");
            console.nextLine();
            calculator.setSign(console.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(console.nextInt());
            console.nextLine();
            do {
                System.out.print("Желаете продолжить вычисления? (yes / no) ");
                option = console.nextLine();
            } while(!option.equals("yes") && !option.equals("no"));
        }
    }
}
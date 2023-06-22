import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            scanner.nextLine();
            calculator.setSign(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            if(!calculator.solutionOperation()) {
                continue;
            } else {
                System.out.print("Желаете продолжить вычисления? ");
                scanner.nextLine();
                String questionContinue = scanner.nextLine();
                if(questionContinue.equals("yes")) {
                    continue;
                } else if(questionContinue.equals("no")) {
                    return;
                }
            }
        }
    }
}
class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int result = 0;
        char sign = '%';
        boolean isDivisionByZero = false;
        
        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if(sign == '%') {
            result = a % b;
        }
        if(sign == '/' && b != 0) {
            result = a / b;
        } else {
            isDivisionByZero = true;
        }
        if(isDivisionByZero) {
            System.out.println(a + "" + sign + "" + b +  '='  + result);
        } else {
            System.out.println("Ошибка. На ноль делить нельзя");
        }
    }
}
class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int result = 0;
        char sign = '/';
        
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
        } else if(sign == '/') {
            if(b != 0) {
                System.out.println("Ошибка. На ноль делить нельзя");
                return;
            }
            result = a / b;
        }
        System.out.println(sign == '/' && b != 0 ?
                a + " " + sign + " " + b + " = "  + result : "");
    }
}


class Calculator {
        private int a;
        private int b;
        private int result;
        private char sign;

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public void setSign(char sign) {
            this.sign = sign;
        }

        public boolean solutionOperation() {
            switch(sign) {
                case '+' :
                    result = a + b;
                    break;
                case '-' :
                    result = a - b;
                    break;
                case '*' :
                    result = a * b;
                    break;
                case '^' :
                    result = a;
                    result = 1; 
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                    break;
                case '%' :
                    result = a % b;
                    break;
                case '/' :
                    if(b == 0) {
                        System.out.println("Ошибка. На ноль делить нельзя");
                        break;
                    }
                    result = a / b;
                    break;
                default :
                    System.out.println("Такого оператора нет попробуйте ещё раз");
                    return false;
            }
            System.out.println("Результат : " + result);
            return true;
    }
}

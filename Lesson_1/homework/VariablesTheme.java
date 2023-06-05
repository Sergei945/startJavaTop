class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte coreCpu = 8;
        short memoryGpu = 8192;
        int memoryRamMb = 65536;
        long memoryRamByte = 68719476736l; 
        float ghzCpuNorm = 3.6f;
        double ghzCpuTurbo = 4.2;
        char seria = '5';
        String nameCpu = "AMD Ryzen " + seria + " 2600X";
        boolean isAmd = true;

        if(isAmd) {
            System.out.println("Наименование процессора: " + nameCpu + "\n" +
                    "Количество ядер: " + coreCpu + "\n" +
                    "Тактовая частота: " + ghzCpuNorm + " / Turbo Boost: " + ghzCpuTurbo + "\n" +
                    "Оперативная память: " + memoryRamMb + " Мб или " + memoryRamByte + 
                    " байт" + "\n" + "Видео карта с " + memoryGpu + " Мб памяти" + "\n\n");
        } else {
            System.out.println("Amd сдох поставил обратно XEON" + "\n\n");
        }

        System.out.println("2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        double discount = 11;
        int sumGoods = penPrice + bookPrice;

        System.out.println("1. Общая стоимость товаров без скидки: " + (sumGoods) + "\n" +
                "2. Сумма скидки: " + Math.round(discount) + "\n" +
                "3. Общая стоимость товаров со скидкой: " + 
                Math.round((sumGoods * (discount / 100) + sumGoods)) + "\n\n");

        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("""
                 J    a  v     v  a
                 J   a a  v   v  a a
              J  J  aaaaa  V V  aaaaa
               JJ  a     a  V  a     a""" + "\n\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;

        System.out.println("1. Первоначальное значение:\n" +
                "Byte: " + numByte++ + "\n" +
                "Short: " + numShort++ + "\n" +
                "Int: " + numInt++ + "\n" +
                "Long: " + numLong++);
        System.out.println("2. значение после инкремента на единицу:\n" +
                "Byte: " + numByte-- + "\n" +
                "Short: " + numShort-- + "\n" +
                "Int: " + numInt-- + "\n" +
                "Long: " + numLong--);
        System.out.println("3. значение после декремента на единицу:\n" +
                "Byte: " + numByte + "\n" +
                "Short: " + numShort + "\n" +
                "Int: " + numInt + "\n" +
                "Long: " + numLong + "\n\n");

        System.out.println("5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;
        int tmp = num1;

        System.out.println("1. C помощью третьей переменной\n" +
               "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num2; 
        num2 = tmp;
        System.out.println("Новые значения переменных: " + "num1 = " + 
                num1 + " num2 = " + num2);
        System.out.println("2. C помощью арифметических операций\n" +
                "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: " + "num1 = " + 
                num1 + " num2 = " + num2);
        System.out.println("3. с помощью побитовой операции ^\n" +
               "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2; 
        System.out.println("Новые значения переменных: " + "num1 = " + num1 +
                " num2 = " + num2 + "\n\n");

        System.out.println("6. Вывод символов и их кодов\n");

        char pound = '#';
        char ampersand = '&';
        char commercialAtSign = '@';
        char circumflexAccent  = '^';
        char lowLine = '_';
        
        System.out.println("Код символа " + (int) pound + 
                " соответствующий коду символ из ASCII-таблицы " + pound + "\n" +
                "Код символа " + (int) ampersand + 
                " соответствующий коду символ из ASCII-таблицы " + ampersand + "\n" +
                "Код символа " + (int) commercialAtSign + 
                " соответствующий коду символ из ASCII-таблицы " + commercialAtSign + "\n" +
                "Код символа " + (int) circumflexAccent + 
                " соответствующий коду символ из ASCII-таблицы " + circumflexAccent + "\n" +
                "Код символа " + (int) lowLine + 
                " соответствующий коду символ из ASCII-таблицы " + lowLine + "\n\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        lowLine = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("     " + slash + backslash + "\n    " + slash + "  " + 
                backslash + "\n   " + slash + lowLine + leftParenthesis + " " +
                rightParenthesis + backslash + "\n  " + slash + "      " + 
                backslash + "\n " + slash + lowLine + lowLine + lowLine + 
                lowLine + slash + backslash + 
                lowLine + lowLine + backslash + "\n\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        
        int num = 123; 
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        System.out.println("Число " + num + " содержит:\n" + hundreds + " сотен\n" +
                tens + " десятков\n" + ones + " единиц\n" +
                "Сумма его цифр = " + (hundreds + tens + ones) + "\n" +
                "Произведение его цифр = " + (hundreds * tens * ones) + "\n\n");

        System.out.println("9. Вывод времени\n");

        int allSeconds = 86399;
        int minutes = (allSeconds / 60) % 60;
        int hourses = (allSeconds / 60 / 60);
        int seconds = allSeconds % 60;

        System.out.println(hourses + ":" + minutes + ":" + seconds);
    }
}
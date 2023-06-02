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
        
        System.out.println("1. Общая стоимость товаров без скидки: " + 
                (penPrice + bookPrice) + "\n" + 
                "2. Сумма скидки: " + Math.round(discount) + "\n" +
                "3. Общая стоимость товаров со скидкой: " + 
                Math.round(((penPrice + bookPrice) * (discount / 100) + (penPrice + bookPrice))));

        System.out.println("\n\n3. Вывод слова JAVA\n");

        System.out.println("""
                 J    a  v     v  a                                                  
                 J   a a  v   v  a a                                                 
              J  J  aaaaa  V V  aaaaa                                                
               JJ  a     a  V  a     a
                            """ + "\n\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        // Я наверное тупой и не понял. Сперва мы пишем первоначальное по заданию потом значение 
        // после инкремента как бы ладно 
        // и значение после декремента, но как бы это тоже самое значение, что и первоначальное
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;

        // Вариант 1
        System.out.println("\n1. Первоначальное значение:\n" +
                "Byte: " + numByte++ + "\n" +
                "Short: " + numShort++ + "\n" +
                "Int: " + numInt++ + "\n" +
                "Long: " + numLong++);

        System.out.println("\n\n2. значение после инкремента на единицу:\n" +
                "Byte: " + numByte-- + "\n" +
                "Short: " + numShort-- + "\n" +
                "Int: " + numInt-- + "\n" +
                "Long: " + numLong--);

        System.out.println("\n\n3. значение после декремента на единицу:\n" +
                "Byte: " + --numByte + "\n" +
                "Short: " + --numShort + "\n" +
                "Int: " + --numInt + "\n" +
                "Long: " + --numLong);

        // Вариант 2
        System.out.println("\n\n1. Первоначальное значение:\n" +
                "Byte: " + numByte + "\n" +
                "Short: " + numShort + "\n" +
                "Int: " + numInt + "\n" +
                "Long: " + numLong);

        System.out.println("\n\n2. значение после инкремента на единицу:\n" +
                "Byte: " + --numByte + "\n" +
                "Short: " + --numShort + "\n" +
                "Int: " + --numInt + "\n" +
                "Long: " + --numLong);

        System.out.println("\n\n3. значение после декремента на единицу: \n" +
                "Byte: " + ++numByte + "\n" +
                "Short: " + ++numShort + "\n" +
                "Int: " + ++numInt + "\n" +
                "Long: " + ++numLong + "\n\n");

        System.out.println("5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;
        
        System.out.println("1. C помощью третьей переменной\n" +
               "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        int tmp = 0;
        tmp = num1; 
        num1 = num2; 
        num2 = tmp;
        System.out.println("Новые значения переменных: " + "num1 = " + 
                num1 + " num2 = " + num2  + "\n");

        System.out.println("2. C помощью арифметических операций\n" +
                "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных: " + "num1 = " + 
                num1 + " num2 = " + num2 + "\n");

        System.out.println("3. с помощью побитовой операции ^\n" +
               "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2; 
        System.out.println("Новые значения переменных: " + "num1 = " + num1 +
                " num2 = " + num2 + "\n\n");

        System.out.println("6. Вывод символов и их кодов\n");

        char char35 = 35;
        char char38 = 38;
        char char64 = 64;
        char char94 = 94;
        char char95 = 95;
        
        System.out.println("Код символа " + (int) char35 + 
                " соответствующий коду символ из ASCII-таблицы \n" + char35 +
                "Код символа " + (int) char38 + 
                " соответствующий коду символ из ASCII-таблицы " + char38 + "\n" +
                "Код символа " + (int) char64 + 
                " соответствующий коду символ из ASCII-таблицы " + char64 + "\n" +
                "Код символа " + (int) char94 + 
                " соответствующий коду символ из ASCII-таблицы " + char94 + "\n" +
                "Код символа " + (int) char95 + 
                " соответствующий коду символ из ASCII-таблицы " + char95 + "\n\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");

        char charSym1 = 92; // /
        char charSym2 = 47; // \
        char charSym3 = 95; // _
        char charSym4 = 40; // (
        char charSym5 = 41; // )
        System.out.println("     " + charSym2 + charSym1 + "\n    " +
                charSym2 + "  " + charSym1 + "\n   " + charSym2 + charSym3 + charSym4 + " " +
                charSym5 + charSym1 + "\n  " + charSym2 + "      " + charSym1 + "\n " + charSym2 +
                charSym3 + charSym3 + charSym3 + charSym3 + charSym2 + charSym1 + charSym3 +
                charSym3 + charSym1 + "\n\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        int num = 123; 
        int numHundreds = num / 100;
        int numTens = (num / 10) % 10;
        int numUnits = (num % 100) % 10;
        System.out.println("Число " + num + " содержит:\n" + numHundreds + " сотен\n" +
                numTens + " десятков\n" + numUnits + " единиц\n" + "\n" +
                "Сумма его цифр = " + (numHundreds + numTens + numUnits) + "\n" +
                "Произведение его цифр = " + (numHundreds * numTens * numUnits) + "\n\n");

        System.out.println("9. Вывод времени\n");

        int allSeconds = 86399;
        int minutes = (allSeconds / 60) % 60;
        int hourses = ((allSeconds / 60) / 60);
        int seconds = (allSeconds % 60) % 60;

        System.out.println(hourses + ":" + minutes + ":" + seconds);
    }
}
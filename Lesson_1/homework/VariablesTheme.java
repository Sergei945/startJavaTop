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
        int sumPenBook = penPrice + bookPrice;
        System.out.println("1. Общая стоимость товаров без скидки: " + 
                (sumPenBook) + "\n" + 
                "2. Сумма скидки: " + Math.round(discount) + "\n" +
                "3. Общая стоимость товаров со скидкой: " + 
                Math.round((sumPenBook * (discount / 100) + 
                sumPenBook)) + "\n\n");

        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("""
                 J    a  v     v  a                                                  
                 J   a a  v   v  a a                                                 
              J  J  aaaaa  V V  aaaaa                                                
               JJ  a     a  V  a     a""" + "\n\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n\n");

        // Я наверное тупой и не понял. Сперва мы пишем первоначальное по заданию потом значение 
        // после инкремента как бы ладно 
        // и значение после декремента, но как бы это тоже самое значение, что и первоначальное
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;

        System.out.println("1. Первоначальное значение:\n" +
                "Byte: " + numByte++ + "\n" +
                "Short: " + numShort++ + "\n" +
                "Int: " + numInt++ + "\n" +
                "Long: " + numLong++ + "\n\n");

        System.out.println("2. значение после инкремента на единицу:\n" +
                "Byte: " + numByte-- + "\n" +
                "Short: " + numShort-- + "\n" +
                "Int: " + numInt-- + "\n" +
                "Long: " + numLong-- + "\n\n");

        System.out.println("3. значение после декремента на единицу:\n" +
                "Byte: " + numByte + "\n" +
                "Short: " + numShort + "\n" +
                "Int: " + numInt + "\n" +
                "Long: " + numLong + "\n\n");

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

        char char23 = 35;
        char char26 = 38;
        char char40 = 64;
        char char5E = 94;
        char char5F = 95;
        
        System.out.println("Код символа " + (int)char23 + 
                " соответствующий коду символ из ASCII-таблицы " + char23 + "\n" +
                "Код символа " + (int)char26 + 
                " соответствующий коду символ из ASCII-таблицы " + char26 + "\n" +
                "Код символа " + (int)char40 + 
                " соответствующий коду символ из ASCII-таблицы " + char40 + "\n" +
                "Код символа " + (int)char5E + 
                " соответствующий коду символ из ASCII-таблицы " + char5E + "\n" +
                "Код символа " + (int)char5F + 
                " соответствующий коду символ из ASCII-таблицы " + char5F + "\n\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");

        char char2F = '/';
        char char5C = 92;
        char5F = '_';
        char char28 = '(';
        char char29 = ')';
        System.out.println("     " + char5C + char2F + "\n    " +
                char5C + "  " + char2F + "\n   " + char5C + char5F + char28 + " " +
                char29 + char2F + "\n  " + char5C + "      " + char2F + "\n " + char5C +
                char5F + char5F + char5F + char5F + char5C + char2F + char5F +
                char5F + char2F + "\n\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        int num = 123; 
        int numHundreds = num / 100;
        int numTens = (num / 10) % 10;
        int numOnes = num % 10;
        System.out.println("Число " + num + " содержит:\n" + numHundreds + " сотен\n" +
                numTens + " десятков\n" + numOnes + " единиц\n" + "\n" +
                "Сумма его цифр = " + (numHundreds + numTens + numOnes) + "\n" +
                "Произведение его цифр = " + (numHundreds * numTens * numOnes) + "\n\n");

        System.out.println("9. Вывод времени\n");

        int allSeconds = 86399;
        int minutes = (allSeconds / 60) % 60;
        int hourses = ((allSeconds / 60) / 60);
        int seconds = allSeconds % 60;

        System.out.println(hourses + ":" + minutes + ":" + seconds);
    }
}
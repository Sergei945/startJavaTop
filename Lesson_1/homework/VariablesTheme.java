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
            System.out.println("Наименование процессора: " + nameCpu +
                                "\nКоличество ядер: " + coreCpu +
                                "\nТактовая частота: " + ghzCpuNorm + " / Turbo Boost: " + ghzCpuTurbo +
                                "\nОперативная память: " + memoryRamMb + " Мб или " + memoryRamByte + " байт" +
                                "\nВидео карта с " + memoryGpu + " Мб памяти");
        } else {
            System.out.println("Amd сдох поставил обратно XEON");
        }

        System.out.println("\n\n 2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        double discount = 11;
        
        System.out.println("1. Общая стоимость товаров без скидки: " + (penPrice + bookPrice) +
                        "\n2. Сумма скидки: " + Math.round(discount) +
                        "\n3. Общая стоимость товаров со скидкой: " + Math.round(((penPrice + bookPrice) * (discount / 100) + (penPrice + bookPrice))));

        System.out.println("\n\n3. Вывод слова JAVA\n");

        System.out.println("""
                             J    a  v     v  a                                                  
                             J   a a  v   v  a a                                                 
                          J  J  aaaaa  V V  aaaaa                                                
                           JJ  a     a  V  a     a
                            """);

        System.out.println("\n\n4. Вывод min и max значений целых числовых типов\n");

        // Я наверное тупой и не понял. Сперва мы пишем первоночальное по заданию потом значение после инкремента как бы ладно 
        // и значение после дикремента, но как бы это тоже самое значение, что и первоначальное
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;

        // Вариант 1
        System.out.println("\n1. Первоночальное значение:\n" +
                            "Byte: " + numByte++ +
                            "\nShort: " + numShort++ +
                            "\nInt: " + numInt++ +
                            "\nLong: " + numLong++);

        System.out.println("\n\n2. значение после инкремента на единицу:\n" +
                            "Byte: " + numByte-- +
                            "\nShort: " + numShort-- +
                            "\nInt: " + numInt-- +
                            "\nLong: " + numLong--);

        System.out.println("\n\n3. значение после декремента на единицу:\n" +
                            "Byte: " + --numByte +
                            "\nShort: " + --numShort +
                            "\nInt: " + --numInt +
                            "\nLong: " + --numLong);

        // Вариант 2
        System.out.println("\n\n1. Первоночальное значение:\n" +
                            "Byte: " + numByte +
                            "\nShort: " + numShort +
                            "\nInt: " + numInt +
                            "\nLong: " + numLong);

        System.out.println("\n\n2. значение после инкремента на единицу:\n" +
                            "Byte: " + --numByte +
                            "\nShort: " + --numShort +
                            "\nInt: " + --numInt +
                            "\nLong: " + --numLong);

        System.out.println("\n\n3. значение после декремента на единицу: \n" +
                            "Byte: " + ++numByte +  
                            "\nShort: " + ++numShort +  
                            "\nInt: " + ++numInt +  
                            "\nLong: " + ++numLong);

        System.out.println("\n\n5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;
        

        System.out.println("1. C помощью третьей переменной\n" +
                           "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        int tmp = 0;
        tmp = num1; 
        num1 = num2; 
        num2 = tmp;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + " num2 = " + num2);

        System.out.println("\n2. C помощью арифметических операций\n" +
                           "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + " num2 = " + num2);

        System.out.println("\n3. с помощью побитовой операции ^\n" +
                           "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2; 
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + " num2 = " + num2);

        System.out.println("\n\n6. Вывод символов и их кодов\n");

        char char35 = 35;
        char char38 = 38;
        char char64 = 64;
        char char94 = 94;
        char char95 = 95;
        
        System.out.println("Код символа " + (int)char35 + " соответствующий коду символ из ASCII-таблицы " + char35 +
                        "\nКод символа " + (int)char38 + " соответствующий коду символ из ASCII-таблицы " + char38 + 
                        "\nКод символа " + (int)char64 + " соответствующий коду символ из ASCII-таблицы " + char64 + 
                        "\nКод символа " + (int)char94 + " соответствующий коду символ из ASCII-таблицы " + char94 + 
                        "\nКод символа " + (int)char95 + " соответствующий коду символ из ASCII-таблицы " + char95);

        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка\n");
         //     /\                                                                                                                                       
         //    /  \                                                                                                                                      
         //   /_( )\                                                                                                                                     
         //  /      \                                                                                                                                    
         // /____/\__\
        char charSym1 = 92; // /
        char charSym2 = 47; // \
        char charSym3 = 95; // _
        char charSym4 = 40; // (
        char charSym5 = 41; // )
        System.out.println("     " + charSym2 + charSym1 +
                        "\n    " + charSym2 + "  " + charSym1 +
                        "\n   " + charSym2 + charSym3 + charSym4 + " " + charSym5 + charSym1 +
                        "\n  " + charSym2 + "      " + charSym1 +
                        "\n " + charSym2 + charSym3 + charSym3 + charSym3 + charSym3 + charSym2 + charSym1 + charSym3 + charSym3 + charSym1);

        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа\n\n");
        int num = 123; 
        int numHundreds = num / 100;
        int numTens = (num / 10) % 10;
        int numUnits = (num % 100) % 10;
        System.out.println("Число " + num + " содержит:\n" +
                        numHundreds + " сотен\n" +
                        numTens + " десятков\n" +
                        numUnits + " единиц\n" + 
                        "\nСумма его цифр = " + (numHundreds + numTens + numUnits) +
                        "\nПроизведение его цифр = " + (numHundreds * numTens * numUnits));

        System.out.println("\n\n8. Вывод времени\n");

        int AllSeconds = 86399;

        int minutes = (AllSeconds / 60) % 60;
        int hourses = ((AllSeconds / 60) / 60);
        int seconds = (AllSeconds % 60) % 60;

        System.out.println(hourses + ":" + minutes + ":" + seconds);
    }
}
class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера" + "\n");

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
                                "Оперативная память: " + memoryRamMb + " Мб или " + memoryRamByte + " байт" + "\n" +
                                "Видео карта с " + memoryGpu + " Мб памяти");
        } else {
            System.out.println("Amd сдох поставил обратно XEON");
        }

        System.out.println("\n" + " 2. Расчет стоимости товара со скидкой" + "\n");

        int penPrice = 100;
        int bookPrice = 200;
        double discount = 11;
        
        System.out.println("1. Общая стоимость товаров без скидки: " + (penPrice + bookPrice));
        System.out.println("2. Сумма скидки: " + Math.round(discount));
        System.out.println("3. Общая стоимость товаров со скидкой: " + Math.round(((penPrice + bookPrice) * (discount / 100) + (penPrice + bookPrice))));

        System.out.println("\n" + "3. Вывод слова JAVA" + "\n");

        System.out.println("""
                             J    a  v     v  a                                                  
                             J   a a  v   v  a a                                                 
                          J  J  aaaaa  V V  aaaaa                                                
                           JJ  a     a  V  a     a
                            """);

        System.out.println("\n" + "4. Вывод min и max значений целых числовых типов" + "\n");

        // Я наверное тупой и не понял. Сперва мы пишем первоночальное по заданию потом значение после инкремента как бы ладно 
        // и значение после дикремента, но как бы это тоже самое значение, что и первоначальное
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;

        // Вариант 1
        System.out.println("1. Первоночальное значение: " +  "\n" +
                            "Byte: " + numByte++ +  "\n" +
                            "Short: " + numShort++ +  "\n" +
                            "Int: " + numInt++ +  "\n" +
                            "Long: " + numLong++ +  "\n" + "\n");

        System.out.println("2. значение после инкремента на единицу: " +  "\n" +
                            "Byte: " + numByte-- +  "\n" +
                            "Short: " + numShort-- +  "\n" +
                            "Int: " + numInt-- +  "\n" +
                            "Long: " + numLong-- +  "\n");

        System.out.println("3. значение после декремента на единицу: " +  "\n" +
                            "Byte: " + --numByte +  "\n" +
                            "Short: " + --numShort +  "\n" +
                            "Int: " + --numInt +  "\n" +
                            "Long: " + --numLong +  "\n");

        // Вариант 2
        System.out.println("1. Первоночальное значение: " +  "\n" +
                            "Byte: " + numByte +  "\n" +
                            "Short: " + numShort +  "\n" +
                            "Int: " + numInt +  "\n" +
                            "Long: " + numLong +  "\n" + "\n");

        System.out.println("2. значение после инкремента на единицу: " +  "\n" +
                            "Byte: " + --numByte +  "\n" +
                            "Short: " + --numShort +  "\n" +
                            "Int: " + --numInt +  "\n" +
                            "Long: " + --numLong +  "\n");

        System.out.println("3. значение после декремента на единицу: " +  "\n" +
                            "Byte: " + ++numByte +  "\n" +
                            "Short: " + ++numShort +  "\n" +
                            "Int: " + ++numInt +  "\n" +
                            "Long: " + ++numLong +  "\n");

        System.out.println("\n" + "5. Перестановка значений переменных" + "\n");

        int num1 = 2;
        int num2 = 5;
        

        System.out.println("1. C помощью третьей переменной " + "\n" +
                           "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        int tmp = 0;
        tmp = num1; 
        num1 = num2; 
        num2 = tmp;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + " num2 = " + num2 + "\n");

        System.out.println("2. C помощью арифметических операций " + "\n" +
                           "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + " num2 = " + num2 + "\n");

        System.out.println("3. с помощью побитовой операции ^ " + "\n" +
                           "Исходные значения переменных: " + "num1 = " + num1 + " num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2; 
        System.out.println("Новые значения переменных: " + "num1 = " + num1 + " num2 = " + num2);

        System.out.println("\n" + "5. Вывод символов и их кодов" + "\n");


    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("task1:");
        int varExampleInt = 777;
        byte varExampleByte = 55;
        short varExampleShort = 3555;
        long varExampleLong = 1234567890;
        float varExampleFloat = 32312.31f;
        double varExampleDouble = 950.55555;

        System.out.println("Значение переменной varExampleInt с типом int равно " + varExampleInt);
        System.out.println("Значение переменной varExampleByte с типом byte равно " + varExampleByte);
        System.out.println("Значение переменной varExampleShort с типом short равно " + varExampleShort);
        System.out.println("Значение переменной varExampleLong с типом long равно " + varExampleLong);
        System.out.println("Значение переменной varExampleFloat с типом float равно " + varExampleFloat);
        System.out.println("Значение переменной varExampleDouble с типом double равно " + varExampleDouble);

        System.out.println("task2:");
        float floatNumber = 27.12f;
        long longNumber = 987678965549L;
        float floatExample2 = 2.786f;
        boolean boolExample = false;
        short shortNumber = 569;
        short shortExample2 = -159;
        short shortExample3 = 27897;
        float floatExample3 = 67.0f;

        //тестовый вывод
        System.out.println("floatNumber="+floatNumber);
        System.out.println("longNumber="+longNumber);
        System.out.println("floatExample2="+floatExample2);
        System.out.println("boolExample="+boolExample);
        System.out.println("shortNumber="+shortNumber);
        System.out.println("shortExample2="+shortExample2);
        System.out.println("shortExample3="+shortExample3);
        System.out.println("floatExample3="+floatExample3);

        int deskCnt = 1;
        byte productType = 5;
        short serialNumber = 31232;
        long rowId = 2321321332423423L;
        float price = 150000.50f;
        double balance = 16600000000.550;
        boolean flPutReport = true;
        char symbol$ = 36;

        //тестовый вывод
        System.out.println("deskCnt="+deskCnt);
        System.out.println("productType="+productType);
        System.out.println("serialNumber="+serialNumber);
        System.out.println("rowID="+rowId);
        System.out.println("price="+price);
        System.out.println("balance="+balance);
        System.out.println("flPutReport="+flPutReport);
        System.out.println("symbol$="+symbol$);

        System.out.println("task3:");
        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;

        int studentsall = studentsLyudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna;

        short paperAll = 480;
        int studentPaper = paperAll / studentsall;
        System.out.println( "На каждого ученика рассчитано " + studentPaper + " листов бумаги");

        System.out.println("task4:");
        byte bottleMachineCapacityInMin = 16 / 2;

        int capacity20Min = bottleMachineCapacityInMin * 20;
        System.out.println("За 20 минут машина произвела бутылок " + capacity20Min + " штук");

        int capacityDay = bottleMachineCapacityInMin * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + capacityDay + " штук");

        int capacity3Day = capacityDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + capacity3Day + " штук");

        int capacityMonth = capacityDay * 31;
        System.out.println("За месяц (31 день) машина произвела бутылок " + capacityMonth + " штук");

        System.out.println("task5:");
        byte allPack = 120;
        byte whiteClassPack = 2;
        byte brownClassPack = 4;
        int classPack = whiteClassPack + brownClassPack;
        int classCnt = allPack / classPack;
        int whitePack = whiteClassPack * classCnt;
        int brownPack = brownClassPack * classCnt;

        System.out.println("В школе, где " + classCnt + " классов, нужно " + whitePack
                + " банок белой краски и " + brownPack + " банок коричневой краски");

        System.out.println("task6:");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 200;
        short egg = 4 * 70;
        int sportsBreakfastGrams = bananas + milk + iceCream + egg;
        System.out.println("Вест спорт-завтрака в граммах: " + sportsBreakfastGrams);

        float sportsBreakfastKg = (float) sportsBreakfastGrams / 1000;
        System.out.println("Вест спорт-завтрака в кг: " + sportsBreakfastKg);

        System.out.println("task7:");
        short excessWeight = 7 * 1000;
        short profitDayMin = 250;
        short profitDayMax = 500;

        int vietaDayMin = excessWeight / profitDayMin;
        System.out.println("На похудание уйдет " + vietaDayMin + " дней если спортсмен будет терять каждый день по 250 грамм");

        int vietaDayMax = excessWeight / profitDayMax;
        System.out.println("На похудание уйдет " + vietaDayMax + " дней если спортсмен будет терять каждый день по 500 грамм");

        int vietaDayAverage = (vietaDayMin + vietaDayMax) / 2;
        System.out.println("В среднем на похудание уйдет " + vietaDayAverage + " дней");
    }
}
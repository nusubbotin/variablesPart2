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
    }
}
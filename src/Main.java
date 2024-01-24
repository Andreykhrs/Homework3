public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int a = 1;
        System.out.println("Значение переменной a с типом int равно " + a + ".");
        byte b = -100;
        System.out.println("Значение переменной b с типом byte равно " + b + ".");
        short c = 10000;
        System.out.println("Значение переменной c с типом short равно " + c + ".");
        long d = 12500000L;
        System.out.println("Значение переменной d с типом long равно " + d + ".");
        float e = 9.458785f;
        System.out.println("Значение переменной e с типом float равно " + e + ".");
        double f = 154.458745869512;
        System.out.println("Значение переменной f с типом double равно " + f + ".");

        System.out.println();
        System.out.println("Задача №2");
        float aa = 27.12f;
        long bb = 987678965549L;
        double cc = 2.786;
        short dd = 569;
        int ee = 569;
        int ff = -159;
        int gg = 27897;
        byte h = 67;

        System.out.println();
        System.out.println("Задача №3");
        int students_L_P = 23;
        int students_A_S = 27;
        int students_E_A = 30;
        int papers = 480;
        System.out.println("На каждого ученика рассчитано " + papers / (students_E_A + students_A_S + students_L_P) + " листов бумаги.");

        System.out.println();
        System.out.println("Задача №4");
        int capacityTwoMinutes = 16;
        int capacityOneMinute = capacityTwoMinutes / 2;
        int time1 = 20;
        int time2 = 24 * 60;
        int time3 = 3 * time2;
        int time4 = 30 * time2;
        System.out.println("За " + time1 + " минут машина произвела " + capacityOneMinute * time1 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + capacityOneMinute * time2 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + capacityOneMinute * time3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + capacityOneMinute * time4 + " штук бутылок.");

        System.out.println();
        System.out.println("Задача №5");
        int allPaints = 120;
        int whitePaintForClass = 2;
        int brownPaintForClass = 4;
        int numberClasses = allPaints/(whitePaintForClass+brownPaintForClass);
        int whitePaints = numberClasses*whitePaintForClass;
        int brownPaints = numberClasses*brownPaintForClass;
        System.out.println("В школе, где "+numberClasses+" классов, нужно "+whitePaints+" банок белой краски и "+brownPaints+" банок коричневой краски.");

        System.out.println();
        System.out.println("Задача №6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int weightBreakfastGr = 5*banana+2*milk+2*iceCream+4*egg;
        int grPerKg = 1000;
        float weightBreakfastKg = weightBreakfastGr/(float)grPerKg;
        System.out.println("Вес завтрака в граммах "+weightBreakfastGr+", а в килограммах "+weightBreakfastKg+".");

        System.out.println();
        System.out.println("Задача №7");
        int loseWeight = 7;
        int diet1Gr = 250;
        int diet2Gr = 500;
        float diet1Kg;
        diet1Kg = diet1Gr/(float)grPerKg;
        float diet2Kg;
        diet2Kg = diet2Gr/(float)grPerKg;
        float numberOfDayDiet1 = loseWeight/diet1Kg;
        float numberOfDayDiet2 = loseWeight/diet2Kg;
        float numberOfDayDiet = (numberOfDayDiet1+numberOfDayDiet2)/(float)2;
        System.out.println("Если спортсмен будет худеть по "+diet1Gr+" грамм в день, то потребуется "+numberOfDayDiet1+" дней.");
        System.out.println("Если спортсмен будет худеть по "+diet2Gr+" грамм в день, то потребуется "+numberOfDayDiet2+" дней.");
        System.out.println("В среднем, чтобы добиться результата похудения на "+loseWeight+" кг, потребуется "+numberOfDayDiet+" день.");

        System.out.println();
        System.out.println("Задача №8");
        int monthOfYear = 12;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float i=1.1f;
        float indexSalaryMasha = salaryMasha*i;
        float indexSalaryDenis = salaryDenis*i;
        float indexSalaryKristina = salaryKristina*i;
        float differenceSalaryYearMasha = (indexSalaryMasha-salaryMasha)*monthOfYear;
        float differenceSalaryYearDenis = (indexSalaryDenis-salaryDenis)*monthOfYear;
        float differenceSalaryYearKristina = (indexSalaryKristina-salaryKristina)*monthOfYear;
        System.out.println("Маша теперь получает "+indexSalaryMasha+" рублей. Годовой доход вырос на "+differenceSalaryYearMasha+" рублей.");
        System.out.println("Денис теперь получает "+indexSalaryDenis+" рублей. Годовой доход вырос на "+differenceSalaryYearDenis+" рублей.");
        System.out.println("Кристина теперь получает "+indexSalaryKristina+" рублей. Годовой доход вырос на "+differenceSalaryYearKristina+" рублей.");




    }
}
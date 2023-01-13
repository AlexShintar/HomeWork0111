public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int jar = 0, add = 15000, month = 0;
        while (jar < 2_459_000) {
            jar += add;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + jar + " рублей");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("\n\nЗадача 3");
        int populationY = 12_000_000, fertility = 17, mortality = 8;
        for (int y = 1; y < 11; y++) {
            populationY += populationY * (fertility - mortality) / 1000;
            System.out.println("Год " + y + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        float amount = 15_000;
        int month = 0;
        while (amount < 12_000_000) {
            month++;
            amount *= 1.07;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) amount + " рублей");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        float amount = 15_000;
        int month = 0;
        while (amount < 12_000_000) {
            month++;
            amount *= 1.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) amount + " рублей");
        }
    }

    public static void task6() {
        System.out.println("\nЗадача 6");
        float amount = 15_000;
        int time = 12 * 9;
        for (int month = 1; month <= time; month++) {
            amount *= 1.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) amount + " рублей");
        }
    }

    public static void task7() {
        System.out.println("\nЗадача 7");
        int firstMonthFriday = 7;
        for (int today = 1; today < 32; today++) {
            if (today % 7 == firstMonthFriday % 7)
                System.out.println("Сегодня пятница, " + today + "-е число. Необходимо подготовить отчет");
        }
    }


    public static void task8() {
        System.out.println("\nЗадача 8");
        int thisYear = 2023, startYear = thisYear - 200, endYear = thisYear + 100;
        int year = startYear / 79 * 79;
        if (year < startYear) year += 79;
        while (year <= endYear) {
            System.out.println(year);
            year += 79;
        }
    }
}
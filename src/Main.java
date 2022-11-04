public class Main {
    public static void main(String[] args) {

        //HW1. Task №1
        System.out.println("ДЗ-1. Задание №1");
        for (int q = 1; q <= 10; q++) {
            System.out.println(q);
        }

        //HW1. Task №2
        System.out.println("");
        System.out.println("ДЗ-1. Задание №2");
        for (int q = 10; q >= 1; q--) {
            System.out.println(q);
        }

        //HW1. Task №3
        System.out.println("");
        System.out.println("ДЗ-1. Задание №3");
        for (int q = 0+2; q < 17; q+=2) {
            System.out.println(q);
        }

        //HW1. Task №4
        System.out.println("");
        System.out.println("ДЗ-1. Задание №4");
        for (int q = 10; q >= -10; q--) {
            System.out.println(q);
        }

        //HW2. Task №1
        System.out.println("");
        System.out.println("ДЗ-2. Задание №1");
        for (int y = 1904; y <= 2096; y = y + 4) {
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
            System.out.println(y + " год является високосным.");
        }

        //HW2. Task №2
        System.out.println("");
        System.out.println("ДЗ-2. Задание №2");
        for (int q = 7; q <= 98; q+=7) {
            System.out.println(q);
        }

        //HW2. Task №3
        System.out.println("");
        System.out.println("ДЗ-2. Задание №3");
        for (int q = 1; q <= 512; q*=2) {
            System.out.println(q);
        }

        //HW3. Task №1
        System.out.println("");
        System.out.println("ДЗ-3. Задание №1");
        int salary = 29000;
        int total = 0;
        for (int q = 1; q <= 12; q++) {
            total = total + salary;
            System.out.println("Месяц " + q + " сумма накоплений равна " + total + " рублей.");
        }

        //HW3. Task №2
        System.out.println("");
        System.out.println("ДЗ-3. Задание №2");
        int salary1 = 29000;
        int total1 = 0;
        for (int q = 1; q <= 12; q++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + q + " сумма накоплений равна " + total1 + " рублей.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println();
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();
        System.out.println("Задание 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задание 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задание 8");

        int money = 29000;
        int months = 0;
        for (int i = 1; i <= 12; i++) {
            months = money + months;
            System.out.println("Месяц " + i + " сумма накоплений равна " + months + " рублей»");
        }

        System.out.println();
        System.out.println("Задание 9");
        int cash = 29000;
        int period = 0;
        double percent = 1D / 100;
        for (int i = 1; i <= 12; i++) {
            period = cash + period;
            period = (int) (period * (1 + percent));
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + period + " рублей");
        }

        System.out.println();
        System.out.println("Задание 10");
        int number = 2;
        int pop = 0;
        for (int i = 1; i <= 10; i++) {
            pop = number * i;
            System.out.println(number + "*" + i + "=" + pop);


        }


    }

}
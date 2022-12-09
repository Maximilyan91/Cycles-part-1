public class Main {
    public static void main(String[] args) {

        // Задача 1.

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация (шаг) цикла " + i );
        }

        // Задача 2.

        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация (шаг) цикла " + i);
        }

        // Задача 3.

        for (int i = 0; i <= 17; i=i+2) {
            System.out.println("Итерация (шаг) цикла " + i);
        }

        // Задача 4.

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация (шаг) цикла " + i);
        }

        // Задача 5.

        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " год является високосным");

        }

        // Задача 6.

        for (int i = 7; i <= 98; i=i+7) {
        System.out.println(i);

        }

        // Задача 7.

        for (int i = 1; i <= 512; i=i*2) {
            System.out.println(i);
        }

        // Задача 8.

        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            int s = salary * i;
            System.out.println("Месяц " + i + " Сумма накоплений составит " + s + " рублей");
        }

        // Задача 9.

        int cashPay = 29000;
        int payOfYear = 0;
        for (int i = 1; i <= 12; i++) {
            payOfYear = payOfYear + payOfYear/100;
            payOfYear = payOfYear + cashPay;
            System.out.println("Месяц " + i + " Сумма накоплений = " + payOfYear);
        }








    }


}
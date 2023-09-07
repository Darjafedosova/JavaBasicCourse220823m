package extraHomework.addHomework1;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя целое
число и печатает на консоль таблицу умножения для этого числа до 10..

 */
public class extraHomework1_3 {
    // ПеРВЫЙ ВАРИАНТ РЕШЕНИЯ

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
       int number = scanner.nextInt();

        System.out.println("Таблица умножения для " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

       scanner.close();

        //ВТОРОЙ ВАРИАНТ РЕШЕНИЯ

       /* System.out.print("Введите целое число: ");
        int number2 = scanner.nextInt();

        System.out.println("Таблица умножения для " + number2 + ":");

        int result1 = number2 * 1;
        int result2 = number2 * 2;
        int result3 = number2 * 3;
        int result4 = number2 * 4;
        int result5 = number2 * 5;
        int result6 = number2 * 6;
        int result7 = number2 * 7;
        int result8 = number2 * 8;
        int result9 = number2 * 9;
        int result10 = number2 * 10;



        System.out.println(number2 + " x 1 = " + result1 );
        System.out.println(number2 + " x 2 = " + result2 );
        System.out.println(number2 + " x 3 = " + result3 );
        System.out.println(number2 + " x 4 = " + result4 );
        System.out.println(number2 + " x 5 = " + result5 );
        System.out.println(number2 + " x 6 = " + result6 );
        System.out.println(number2 + " x 7 = " + result7 );
        System.out.println(number2 + " x 8 = " + result8 );
        System.out.println(number2 + " x 9 = " + result9 );
        System.out.println(number2 + " x 10 = " + result10 );
        */

    }
}

package homework.one2609;

import java.util.Scanner;

/*
26.09.2023
№ 2*
Дано трехзначное число. Вывести на экран все цифры этого числа, которые вы должны получить
 в результате математических действий над этим числом.

Пример: 345
Вывод в консоль: Число 345 -> 3, 4, 5
 */
public class number {
    public static void main(String[] args) {
        //Первый вариант решения
        int a = 345;
        int b = a / 100;
        int c = b + 1;
        int r = c + 1;

        System.out.println("Number " + a + "-> " + b + ", " + c + ", " + r);

        // Второй вариант решения
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int x = scanner.nextInt();

        scanner.close();

        int first = x / 100;
        int second = (x / 10) % 10;
        int third = x % 10;

        System.out.println(" -> " + first + ", " + second + ", " + third);
    }
}

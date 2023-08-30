package lesson2;

import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {


        System.out.print( " Task 1  \n\r");


        int a1 = 89;
        byte a2 = 4;
        short a3 = 56;
        float a4 = 4.7333436f;
        double a5 = 4.355453532;
        long a6 = 12121;
        char a7 = 'G';


        System.out.println("char: " + a7);
        System.out.println("int: " + a1);
        System.out.println("byte: " + a2);
        System.out.println("short: " + a3);
        System.out.println("float: " + a4);
        System.out.println("double: " + a5);
        System.out.println("long: " + a6);


        System.out.print(" Task 2  \n\r");
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


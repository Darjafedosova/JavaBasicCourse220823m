package lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.print(" Task 1  \n\r");
        /*System.out.println();*/

        int a1 = 89;
        byte a2 = 4;
        short a3 = 56;
        float a4 = 4.7333436f;
        double a5 = 4.355453532;
        long a6 = 12121;
        char a7 = 'G';

        System.out.println ("a1 = " + a1 );
        System.out.println ("a2 = " + a2);
        System.out.println ("a3 = " + a3);
        System.out.println ("a4 = " + a4);
        System.out.println ("a5 = " + a5);
        System.out.println ("a6 = " + a6);
        System.out.println ("a7 = " + a7);


        System.out.print(" Task 2  \n\r");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int x = scanner.nextInt();

        scanner.close();

        int first = x / 100;
        int second = ( x / 10) % 10;
        int third = x % 10;

        System.out.println( " -> " + first + ", " + second + ", " + third);

    }
    }

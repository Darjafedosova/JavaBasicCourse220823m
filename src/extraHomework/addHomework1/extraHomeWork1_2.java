package extraHomework.addHomework1;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашиваеn
имя пользователя и выводит на консоль текст:Hello имя пользователя!

 */
public class extraHomeWork1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();


        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}

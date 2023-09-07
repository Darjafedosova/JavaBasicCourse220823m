package extraHomework.addHomework1;
/*
Написать консольную программу, которая запрашивает у пользователя
два вещественных числа (числа с запятой) и выводит на консоль результаты:
 сложения, вычитания, умножения и деления. Вещественные числа можно запрашивать с
 консоли используя обьект Scanner следующим образом:  
 Scanner scanner = new Scanner(System.in); 
 double firstDoubleNumber = scanner.nextDouble();
 */
import java.util.Scanner;

public class extraHomework1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое вещественное число: ");
        double firstDoubleNumber = scanner.nextDouble();


        System.out.print("Введите второе вещественное число: ");
        double secondDoubleNumber = scanner.nextDouble();


        double sum = firstDoubleNumber + secondDoubleNumber;
        double difference = firstDoubleNumber - secondDoubleNumber;
        double product = firstDoubleNumber * secondDoubleNumber;
        double quotient  = firstDoubleNumber / secondDoubleNumber;



        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);

        scanner.close();
    }
}


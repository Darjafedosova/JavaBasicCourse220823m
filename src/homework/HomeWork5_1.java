package homework;
/*
Реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
 */
import java.util.Scanner;

public class HomeWork5_1 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите сумму в евро: ");
            double euro = scanner.nextDouble();

            double exchangeRate = 1.07;
            double dollar= euro * exchangeRate;

            System.out.println("Сумма в долларах: " + dollar);

            scanner.close();

    }
}

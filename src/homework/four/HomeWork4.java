package homework.four;

import java.util.Scanner;

/*
Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
 */
public class HomeWork4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Введите температуру первой колбы: ");
            int temperature1 = scanner.nextInt();

            System.out.print("Введите температуру второй колбы: ");
            int temperature2 = scanner.nextInt();

            boolean isDeviceWorking = checkDevice(temperature1, temperature2);
            System.out.println("Устройство работает корректно: " + isDeviceWorking);

            scanner.close();
        }

        public static boolean checkDevice(int temperature1, int temperature2) {
            return temperature1 > 100 && temperature2 < 100;
        }
    }


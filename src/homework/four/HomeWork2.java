package homework.four;

import java.util.Scanner;

/*

Создайте две переменные isWeekend и isRain.
Создайте переменную canWalk, значение которой должно быть истинным,
если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
 */
public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;

        if (canWalk) {
            System.out.println("Верно , можно идти на прогулку ");
        } else {
            System.out.println("Не верно, остаемся дома , делать домашку по JAVA");
        }
    }
}

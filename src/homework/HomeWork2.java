package homework;

import java.util.Scanner;

/*
Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества
букв.
Нужно получить слово, состоящее из первой половины первого слова и второй
половины второго слова. распечатать на консоль.
Например:
ввод - mama, papa
вывод - mapa

 */
public class HomeWork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово (четное количество букв): ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово (четное количество букв): ");
        String word2 = scanner.nextLine();

        scanner.close();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {

            int mid1 = word1.length() / 2;
            int mid2 = word2.length() / 2;


            String firstHalf = word1.substring(0, mid1);
            String secondHalf = word2.substring(mid2);


            String mergedWord = firstHalf + secondHalf;

            System.out.println("Результат: " + mergedWord);
        } else {
            System.out.println("Не вверно введены слова.");
        }
    }


}

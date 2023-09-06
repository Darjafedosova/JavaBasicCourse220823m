package homework;
/*
1 Создайте строку через new - I study Basic Java!
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().
 */
public class HomeWork1 {
    public static void main(String[] args){
        String myString = "I study Basic Java!";
        printString(myString);

    }
    public static void printString(String inputString) {
        System.out.println(inputString);


        char preLastChar = inputString.charAt(inputString.length() - 2);
        System.out.println("Пред последний символ: " + preLastChar);


        boolean containsJava = inputString.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        String stringWithoutJava = inputString.substring(0, inputString.indexOf("Java"))
                + inputString.substring(inputString.indexOf("Java") + 4);
        System.out.println("Строка без 'Java': " + stringWithoutJava);

        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedString);


        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);



    }

}

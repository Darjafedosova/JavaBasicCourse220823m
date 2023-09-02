package homework3;
public class HomeWork3 {
    public static void main(String[] args){
        String myString = new String("I study Basic Java!");
        printString(myString);

    }
    public static void printString(String inputString) {
        System.out.println(inputString);


        char preLastChar = inputString.charAt(inputString.length() - 2);
        System.out.println("Пред-последний символ: " + preLastChar);


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

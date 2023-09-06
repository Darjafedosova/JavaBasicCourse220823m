package homework;
/*
1. Переведите число 333 из 16-ричной в 10-ричную
2. Переведите число 819 из 10-ричной в 16-ричную
3. 101101 в двоичной, переведите в 10-ричную
4. 124 в десятичной, переведите в 2-ичную
 */
public class HomeWork4 {
    public static void main(String[] args) {

        String hexNumber = "333";
        int Number1 = Integer.parseInt(hexNumber, 16);

        System.out.println("Число 333 из 16-ричной в 10-ричную: " + Number1);

        int Number3 = 819;
        String Number4 = Integer.toHexString(Number3).toUpperCase();
        System.out.println("Число 819 из 10-ричной в 16-ричную: " + Number4);

        String Number5 = "101101";
        int Number6 = Integer.parseInt(Number5, 2);
        System.out.println("Число 101101 из двоичной в 10-ричную " + Number6);

        int Number7 = 124;
        String Number8 = Integer.toBinaryString(Number7);
        System.out.println("Число 124 из десятичной в 2-ичную: " + Number8);


    }
}

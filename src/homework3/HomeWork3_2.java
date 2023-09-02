package homework3;

public class HomeWork3_2 {
        public static void main(String[] args) {
            MathOper calc = new MathOper();

            calc.x = 300;
            calc.y = 100;

            System.out.println("Результат сложения: " +calc.add());

            double resultOfSub = calc.sub();
            System.out.println("Результат вычитания: " + resultOfSub);

            System.out.println("Результат умножения: " + calc.mult());

            double resultOfDiv = calc.div();
            System.out.println("Результат деления: " + resultOfDiv);

        }
}


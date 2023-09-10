package homework.four;
/*
07.09.2023
Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
 Чтобы решить эту проблему, предположим,
 что каждый квадратный сантиметр пиццы содержит 40 калорий.
 */
public class HomeWork6 {
    public static void main(String[] args) {
    double diameterSmallPizza = 24.0;
    double diameterLargePizza = 28.0;


    double areaSmallPizza = Math.PI * Math.pow(diameterSmallPizza / 2, 2);
    double areaLargePizza = Math.PI * Math.pow(diameterLargePizza / 2, 2);

    int caloriesPerSquareCentimeter = 40;


    int caloriesSmallPizza = (int) (areaSmallPizza * caloriesPerSquareCentimeter);
    int caloriesLargePizza = (int) (areaLargePizza * caloriesPerSquareCentimeter);


    int extraCalories = caloriesLargePizza - caloriesSmallPizza;


        System.out.println("Калории в маленькой пицце: " + caloriesSmallPizza + " калорий");
        System.out.println("Калории в большой пицце: " + caloriesLargePizza + " калорий");
        System.out.println("Лишние калории при покупке большой пиццы: " + extraCalories + " калорий");
}
}


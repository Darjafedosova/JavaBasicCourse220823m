package homework.four;
/*
Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
 Чтобы решить эту проблему, предположим,
 что каждый квадратный сантиметр пиццы содержит 40 калорий.
 */
public class HomeWork6 {
    public static void main(String[] args) {
    double diameterSmallPizza = 24.0; // Диаметр маленькой пиццы в см
    double diameterLargePizza = 28.0; // Диаметр большой пиццы в см

    // Площадь пицц
    double areaSmallPizza = Math.PI * Math.pow(diameterSmallPizza / 2, 2);
    double areaLargePizza = Math.PI * Math.pow(diameterLargePizza / 2, 2);

    // Калории на единицу площади
    int caloriesPerSquareCentimeter = 40;

    // Расчет калорий
    int caloriesSmallPizza = (int) (areaSmallPizza * caloriesPerSquareCentimeter);
    int caloriesLargePizza = (int) (areaLargePizza * caloriesPerSquareCentimeter);

    // Вычисление лишних калорий
    int extraCalories = caloriesLargePizza - caloriesSmallPizza;

    // Вывод результатов
        System.out.println("Калории в маленькой пицце: " + caloriesSmallPizza + " калорий");
        System.out.println("Калории в большой пицце: " + caloriesLargePizza + " калорий");
        System.out.println("Лишние калории при покупке большой пиццы: " + extraCalories + " калорий");
}
}


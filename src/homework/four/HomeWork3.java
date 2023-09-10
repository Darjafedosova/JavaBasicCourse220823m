package homework.four;
/*
Создайте две переменные isEdekaOpen и isReweOpen, значения которых
 зависят от того, открыты магазины или нет. Реализуйте логический метод canBuy,
 возвращающий true / false Значение этой переменной должно быть true, если хотя бы
 один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение
 */
public class HomeWork3 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true; // open
        boolean isReweOpen = false; //close

        boolean canBuyFood = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + (canBuyFood ? "возможно" : "невозможно"));
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}

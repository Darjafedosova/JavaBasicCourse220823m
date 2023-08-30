package lesson3;

public class Main {
    public static void main(String[] args) {
        int car1= 1;
        int car2= 2;

        //...

        Dog firstDog = new Dog();

        System.out.println(firstDog);

        firstDog.name ="Sharik";
        firstDog.breed= "Doberman";
        firstDog.color= "Black";
        firstDog.isMale= true;
        firstDog.age= 2;
        firstDog.weight= 45.5;


        //

        Dog secondDog = new Dog();

        System.out.println(secondDog);



        secondDog.name= "Barbos";
        secondDog.breed= "Pudel";
        secondDog.color= "Silver";
        secondDog.isMale= false;
        secondDog.age= 4;
        secondDog.weight= 15.5;

        System.out.println ("Собака номер один ");
        System.out.println("Порода " + firstDog.breed + " кличка "+ firstDog.name);
        System.out.println("Порода "+ firstDog.age);
        System.out.println("Вес "+ firstDog.weight);
        System.out.println("Цвет "+ firstDog.color);


        System.out.println("++++++++++++ ");

        System.out.println ("Собака номер два ");
        System.out.println("Порода " + secondDog.breed + " кличка "+ secondDog.name);
        System.out.println("Порода "+ secondDog.age);
        System.out.println("Вес "+ secondDog.weight);
        System.out.println("Цвет "+ secondDog.color);









    }
}

package src.main.java.lesson10.Projekt1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Volvo");
        Car car4 = new Car("Mercedes");
        Car car5 = new Car("Opel");

        LinkedList<Car> cars = new LinkedList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);

        cars.addFirst(car4);
        cars.addLast(car5);
        System.out.println(cars);

        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());

        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());
        System.out.println(cars);
        System.out.println("____________-");

        //преобразование
        Car []  cars1 = cars.toArray(new Car[3]);
        System.out.println(Arrays.toString(cars1));


    }


}

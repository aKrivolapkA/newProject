package src.main.java.lesson5.Vehicle;

import src.main.java.lesson5.Vehicle.Vehicle;

public class VehicleProject {
    public static void main(String[] args) {

        //создаем обьект внутренего класса
        Vehicle.Car car = new Vehicle.Car();
        car.km =100;

        System.out.println(car.km);
    }
}

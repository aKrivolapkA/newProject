package src.main.java.lesson11.vehicle;

public class Car extends Vehicle implements iMove{

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Car "+ getName() + " is moving");

    }
}

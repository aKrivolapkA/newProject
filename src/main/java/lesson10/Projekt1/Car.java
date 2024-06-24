package src.main.java.lesson10.Projekt1;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "car model: " + model;
    }

}

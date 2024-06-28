package src.main.java.lesson11.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car[]cars = new Car[]{new Car("BMW"), new Car("Zeekr")};
        Train[]trains = new Train[]{new Train("Minsk-Gomel"), new Train("Gomel-Minsk")};

        Garage<Car> carGarage =  new Garage<>(cars);
        carGarage.info();

        Garage<Train> trainGarage =  new Garage<>(trains);
        trainGarage.info();
    }

}
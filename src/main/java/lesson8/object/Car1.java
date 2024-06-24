package src.main.java.lesson8.object;

public class Car1 implements Cloneable { //чтобы сделать клонирование implements  Cloneable
    private String carName;
    private Driver driver;

    public Car1(String carName, Driver driver) {
        this.carName = carName;
        this.driver = driver;
    }

// конструктор клонирования
    public Car1(Car1 otherCar) {
        this(otherCar.getCarName(),otherCar.getDriver());
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    //глубокое клонирование
    public Car1 clone() throws CloneNotSupportedException {
        Car1 newCar = (Car1) super.clone();
        Driver driver = this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "carName='" + carName + '\'' +
                ", driver=" + driver +
                '}';
    }
}

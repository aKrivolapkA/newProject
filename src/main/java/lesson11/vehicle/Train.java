package src.main.java.lesson11.vehicle;

public class Train extends Vehicle implements iMove{

    public Train(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Train "+ getName() + " is moving");

    }
}

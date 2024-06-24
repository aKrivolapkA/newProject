package src.main.java.lesson6.Exercise;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(4);

        Circle circle = new Circle();
        circle.setRadius(3);

        circle.setCenter(point);

        circle.printInformation();

    }
}

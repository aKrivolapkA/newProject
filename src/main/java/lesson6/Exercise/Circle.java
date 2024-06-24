package src.main.java.lesson6.Exercise;

public class Circle extends GeometricalFigure {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }
    public Circle(){

    }
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Point center) {
        super(center);
    }

    @Override
    public String getFigerType() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean containsPoint(Point point) {
        return false;
    }

    @Override
    public void printInformation() {
        System.out.println("КРУГ:  \n" + "координаты центра:  " + super.getCenter().getX() + ", " + super.getCenter().getY() + " радиус круга: " + radius);
    }

}

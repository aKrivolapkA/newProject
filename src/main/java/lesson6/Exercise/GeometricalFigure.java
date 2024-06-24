package src.main.java.lesson6.Exercise;

public abstract class GeometricalFigure {

    private Point center;
    public void setCenter(Point center) {
        this.center = center;
    }

    public GeometricalFigure(Point center) {
        this.center = center;
    }
    public GeometricalFigure(){

    }

    public Point getCenter() {
        return center;
    }

    public abstract  String  getFigerType();
    public abstract  double  getArea();
    public abstract  double  getPerimeter();
    public abstract  boolean  containsPoint(Point point);

    public void printInformation() {
        System.out.println("Координаты центра: " + " x: " + getCenter().getX() + " y: " + getCenter().getY());
    }
}

package src.main.java.lesson6.Exercise;

public class Rectangle extends GeometricalFigure {
    private double width;
    private double height;

    public Rectangle(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(Point center) {
        super(center);
    }

    public Rectangle() {
        super();
    }

    @Override
    public String getFigerType() {
        return null;
    }

    @Override
    public double getArea() {
        return 0; // площа
    }

    @Override
    public double getPerimeter() {
        return 0;// перемитр
    }

    @Override
    public boolean containsPoint(Point point) {
        return false; //будет проверять принаддежит ли точка обьекту  подсказка координаты точки по иксу и по игрику если координа точки больше чем центр точки
    }

    @Override
    public void printInformation() {
        System.out.println("ПРЯМОУГОЛЬНИК \n" + "Фигура в общем: " + "Ширина: " + getHeight() + "Высота: " + getWidth());

    }
}

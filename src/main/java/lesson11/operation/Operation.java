package src.main.java.lesson11.operation;

public class Operation {
    double x,y;
    public double getSum(){
        return x+y;
    }

    public <T extends Number>Operation(T x, T y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }
}

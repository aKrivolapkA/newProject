package src.main.java.lesson15;

public interface Operatinable { // лямда выражения
    int calculate(int x, int y);

    public static void main(String[] args) {
        Operatinable operatinable=(x,y) -> x+y; //(x,y) -> x+y лямда выражение
        int result = operatinable.calculate(2,4);
        System.out.println(result);

    }
}

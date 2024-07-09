package src.main.java.lesson15;

public class LamdaUp { // так как ниже написано не очень удобно / слишком много кода
    public static void main(String[] args) {
        Operatinable operatinable = new Operatinable() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        int result = operatinable.calculate(1,4);
        System.out.println(result);
    }
}

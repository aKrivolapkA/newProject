package src.main.java.lesson15;

public class LamdaApp3 {
    public static void main(String[] args) {

        Operatinable operatinable =(x,y) -> {
            if ( y==0)
                return 0;
            else
                return x/y;
        };
        System.out.println(operatinable.calculate(10,5));

    }
}

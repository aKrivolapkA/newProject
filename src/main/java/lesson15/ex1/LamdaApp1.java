package src.main.java.lesson15.ex1;

import src.main.java.lesson15.ex1.Operatinable1;

public class LamdaApp1 {
    static int x  = 10;
    static int y  = 20;

    public static void main(String[] args) {
        Operatinable1 operatinable =() -> {
            x= 30;
            return  x+y;
        };
        System.out.println(operatinable.calculate());
        System.out.println(x);
    }
}

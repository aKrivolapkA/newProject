package src.main.java.lesson15.ex7;

import src.main.java.lesson15.Operatinable;

public class LamdaApp4 {
    public static void main(String[] args) {
        Operatinable function = action(1);
        int a = function.calculate(5,6);
        System.out.println(a);

        int b = action(2).calculate(6,3);
        System.out.println(b);

    }
    private static Operatinable action(int number){
        switch (number){
            case 1:
                return (x,y)-> x+y;
            case 2:
                return (x,y)-> x-y;
            case 3:
                return (x,y)-> x*y;
            default:
                return (x,y)->0;

        }
    }
}

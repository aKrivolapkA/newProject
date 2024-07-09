package src.main.java.lesson15.ex2;

import src.main.java.lesson15.ex1.Operatinable1;

public class LamdaApp2 {


    public static void main(String[] args) {
        int x  = 10;
        int y  = 20;
        Operatinable1 operatinable =() -> {
           // x= 30; //переменную на уровне метода нельзя изменить
            return  x+y;
        };
        System.out.println(operatinable.calculate());
        System.out.println(x);
    }
}

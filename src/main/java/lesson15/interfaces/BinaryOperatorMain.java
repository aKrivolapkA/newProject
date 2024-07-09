package src.main.java.lesson15.interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x,y) -> x*y;
        System.out.println(multiply.apply(1,2));
        System.out.println(multiply.apply(4,-4));
    }
}

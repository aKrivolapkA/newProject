package src.main.java.lesson15.interfaces;

import java.util.function.Predicate;

public class PredicateMain {  // встроенный метод

    public static void main(String[] args) {
        Predicate<Integer> isPositive = x-> x>0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-5));
    }

}

package src.main.java.lesson15.interfaces;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<Integer,String> convert = x-> String.valueOf(x) + " dollarow"; // первый параметр что приобразуем / второй параметр к какому ипу преобразуем
        System.out.println(convert.apply(5));


    }
}

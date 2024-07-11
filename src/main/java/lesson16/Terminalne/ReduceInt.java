package src.main.java.lesson16.Terminalne;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceInt {
    public static void main(String[] args) {
        Stream<Integer> numsStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer>result = numsStream.reduce((x,y) -> x*y);//reduce перемножит все элементы
        System.out.println(result.get());

    }
}

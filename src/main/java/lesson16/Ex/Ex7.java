package src.main.java.lesson16.Ex;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex7 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("paris","london","Madrid");
        citiesStream.forEach(s-> System.out.println(s));


        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.forEach(i-> System.out.println(i));

        DoubleStream doubleStream = DoubleStream.of(1.2,2,3,4,5);
        doubleStream.forEach(i-> System.out.println(i));

        LongStream longStream = LongStream.of(100,233,344,554,665);
        longStream.forEach(i-> System.out.println(i));
    }
}

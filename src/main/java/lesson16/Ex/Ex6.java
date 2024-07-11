package src.main.java.lesson16.Ex;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ex6 {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5});
        intStream.forEach(i-> System.out.println(i));

        DoubleStream doubleStream = Arrays.stream(new double[]{1.2,2,3,4,5});
        doubleStream.forEach(i-> System.out.println(i));

        LongStream longStream = Arrays.stream(new long[]{100,233,344,554,665});
        longStream.forEach(i-> System.out.println(i));

    }
}
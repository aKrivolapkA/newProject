package src.main.java.lesson16.Ex;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {

        Stream<String> citiesStream = Arrays.stream(new String[]{"paris","london","Madrid"});
        citiesStream.forEach(s -> System.out.println(s));

    }
}

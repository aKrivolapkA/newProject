package src.main.java.lesson16.Ex;

import java.util.stream.Stream;

public class Ex8 {
    public static void main(String[] args) {

        Stream<String> citiesStream = Stream.of("paris","london","Madrid");
        citiesStream.forEach( System.out::println);
    }
}

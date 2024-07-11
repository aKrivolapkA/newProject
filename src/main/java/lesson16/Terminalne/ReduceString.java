package src.main.java.lesson16.Terminalne;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceString {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "from", "Me");
        Optional<String> sentence = stringStream.reduce((x, y) -> x + " " + y); // переменная типа оптионал
        System.out.println(sentence.get());
    }
}

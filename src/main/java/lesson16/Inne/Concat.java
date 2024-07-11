package src.main.java.lesson16.Inne;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {

        Stream<String> people1 =Stream.of("Tom","Bob","Sam");
        Stream<String> people2 =Stream.of("Alice","Kate","Sam");

        Stream.concat(people1,people2) // обьединяет потоки
                .forEach(System.out::println);

    }
}

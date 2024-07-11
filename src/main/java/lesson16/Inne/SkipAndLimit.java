package src.main.java.lesson16.Inne;

import java.util.stream.Stream;

public class SkipAndLimit {
    public static void main(String[] args) {
        Stream<String> phones = Stream.of("phone1","phone333","phone22","phone5555","phone4444");
        phones
                .skip(1) // пропустить какой элемент
                .limit(2) // количество которое берем
                .forEach(System.out::println);

    }
}

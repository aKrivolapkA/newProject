package src.main.java.lesson16.Inne;

import java.util.stream.Stream;

public class Distinct {

    public static void main(String[] args) {

        Stream<String>  people =Stream.of("Tom","Bob","Sam","Alice","Kate","Sam");
       people
               .distinct() //выводит уникальные элементы
               .forEach(System.out::println);
    }
}

package src.main.java.lesson16.parallel;

import java.util.Optional;
import java.util.stream.Stream;

public class PaallelStringMain {
    public static void main(String[] args) {

        Stream<String> strStream = Stream.of("hello","world","!");
        String result = strStream.parallel().reduce("Результат: ", (x,y)-> x+ " " +y );
        System.out.println(result); //Результат:  hello Результат:  world Результат:  ! // потому что паралелльно

    }
}

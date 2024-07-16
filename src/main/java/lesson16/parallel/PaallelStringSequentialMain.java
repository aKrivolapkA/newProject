package src.main.java.lesson16.parallel;

import java.util.stream.Stream;

public class PaallelStringSequentialMain {// распаралерование
    public static void main(String[] args) {

        Stream<String> strStream = Stream.of("мама","мыла","!");
        String result = strStream.parallel()
                .filter(s->s.length()<5)
                .sequential()//чтобы преобразовать паралельный поток в обычный
                .reduce("Результат: ", (x,y)-> x+ " " +y );
        System.out.println(result);

    }
}

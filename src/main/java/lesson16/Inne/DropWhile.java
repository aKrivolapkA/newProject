package src.main.java.lesson16.Inne;

import java.util.stream.Stream;

public class DropWhile {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3,-2,-1,0,1,2,3,-4,-5);
        numbers
                .sorted()
                .dropWhile(n-> n<0)// пропускает элементы которые соответствует нашему элемениту  из потока и выводит то что не соотвествует
                .forEach(System.out::println);

    }
}

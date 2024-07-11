package src.main.java.lesson16.Inne;

import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3,-2,-1,0,1,2,3,-4,-5);
        numbers
                .takeWhile(n-> n<0)// выбирает из потока элементы до тех пор пока они соотвутсвуют условию нашему
                .forEach(System.out::println);

    }
}

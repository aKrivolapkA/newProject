package src.main.java.lesson16.Inne;

import java.util.stream.Stream;

public class TakeWhileSorted {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3,-2,-1,0,1,2,3,-4,-5);
        numbers
                .sorted()// сортирует по возрастанию
                .takeWhile(n-> n<0)// выбирает из потока элементы до тех пор пока они соотвутсвуют условию нашему
                .forEach(System.out::println);

    }
}

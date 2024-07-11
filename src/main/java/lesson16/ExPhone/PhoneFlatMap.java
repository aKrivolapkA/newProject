package src.main.java.lesson16.ExPhone;

import java.util.stream.Stream;

public class PhoneFlatMap {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1",5000),
                new Phone("phone2",900),
                new Phone("phone3",2500)
        );

        //String.format - можем записать в переменную
      // String x = String.format("название : %s,цена : %d",название, цена ));
      // System.out.println(String.format("название : %s,цена : %d",название, цена ));


        phoneStream
                .flatMap(p-> Stream.of(// flatMap используется если из одного элемента нужно получить несколько
                        String.format("название %s цена без скидки %d",p.getName(),p.getPrice()),
                        String.format("название %s цена со  скидкой  %f",p.getName(),p.getPrice()*0.9)))
                .forEach(System.out::println);




    }
}

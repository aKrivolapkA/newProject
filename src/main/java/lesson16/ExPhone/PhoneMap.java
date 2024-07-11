package src.main.java.lesson16.ExPhone;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.stream.Stream;

public class PhoneMap {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1",5000),
                new Phone("phone2",900),
                new Phone("phone3",2500)
        );
        phoneStream
                .map(p -> "название "+ p.getName() + " Price : "+ p.getPrice())// позволяет изображать в нужном виде
                .forEach(System.out::println);

    }
}

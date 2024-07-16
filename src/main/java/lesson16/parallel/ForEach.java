package src.main.java.lesson16.parallel;

import src.main.java.lesson16.ExPhone.Phone;
import src.main.java.lesson16.ExPhone.PhoneComparator;

import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        Stream<Phone> phoneStream =Stream.of(
                new Phone("phone1","apple",300),
                new Phone("phone3333","Samsung",200),
                new Phone("phone5555","Samsung",300),
                new Phone("phone444","Xiaomi",2500)
        );
        phoneStream.parallel()
                .sorted(new PhoneComparator())
                .unordered()//убирает то что отсортировали
                .forEachOrdered(s-> System.out.println(s.getName())); //forEachOrdered сортировка при паралельно запуске
    }
}

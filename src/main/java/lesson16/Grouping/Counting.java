package src.main.java.lesson16.Grouping;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Counting { // посчитать количество
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1", "apple", 300),
                new Phone("phone3333", "Samsung", 200),
                new Phone("phone5555", "Samsung", 300),
                new Phone("phone444", "Xiaomi", 2500)
        );

        Map<String, Long> phonesByCompany = phoneStream.collect( //counting возвращает тип лонг нельзя другой
                Collectors.groupingBy(Phone::getCompany, Collectors.counting()));

        for (Map.Entry<String, Long> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());

        }

    }
}

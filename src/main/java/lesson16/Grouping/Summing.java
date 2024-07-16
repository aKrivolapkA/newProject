package src.main.java.lesson16.Grouping;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summing { //для подсчета суммы
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1", "apple", 300),
                new Phone("phone3333", "Samsung", 200),
                new Phone("phone5555", "Samsung", 300),
                new Phone("phone444", "Xiaomi", 2500)
        );
        Map<String, Integer> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));
        for (Map.Entry<String, Integer> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

    }
}

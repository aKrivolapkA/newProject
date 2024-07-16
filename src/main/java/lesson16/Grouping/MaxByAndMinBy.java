package src.main.java.lesson16.Grouping;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxByAndMinBy { // чтобы подсчитать минимальное и максимальное  для каждого обьекта
    public static void main(String[] args) {
        Stream<Phone> phoneStream =Stream.of(
                new Phone("phone1","apple",300),
                new Phone("phone3333","Samsung",200),
                new Phone("phone5555","Samsung",300),
                new Phone("phone444","Xiaomi",2500)
        );

        Map<String, Optional<Phone>> phonesByCompany  = phoneStream.collect( //Optional  класс чтобы получать различные значения функции
                Collectors.groupingBy(Phone::getCompany, Collectors.minBy(Comparator.comparing(Phone::getPrice))));

        for (Map.Entry<String, Optional<Phone>> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

    }
}
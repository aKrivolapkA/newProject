package src.main.java.lesson16.Grouping;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizing { //статистика
    public static void main(String[] args) {
        Stream<Phone> phoneStream =Stream.of(
                new Phone("phone1","apple",300),
                new Phone("phone3333","Samsung",200),
                new Phone("phone5555","Samsung",300),
                new Phone("phone444","Xiaomi",2500)
        );

        Map<String, IntSummaryStatistics> phonesByCompany  = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany, Collectors.summarizingInt(Phone::getPrice)));

        for (Map.Entry<String, IntSummaryStatistics> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

    }
}

package src.main.java.lesson16;

import java.util.*;
import java.util.stream.Collectors;

public class CollectListAndSet {
    public static void main(String[] args) {

        ArrayList<String> phones = new ArrayList<>();
        phones.addAll(Arrays.asList("Ahone1", "ahone1", "phone333", "phone55555", "phone4444"));
        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toList());
        for (String s : filteredPhones) {
            System.out.println(s);
        }

        System.out.println("----------------");

        Set<String> filteredPhonesSet = phones.stream() // set - уникальные значения
                .filter(s -> s.length() < 10)
                .collect(Collectors.toSet());
        for (String s : filteredPhonesSet) {
            System.out.println(s);
        }


    }
}

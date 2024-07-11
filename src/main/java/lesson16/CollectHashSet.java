package src.main.java.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectHashSet {
    public static void main(String[] args) {

        ArrayList<String> phones = new ArrayList<>();
        phones.addAll(Arrays.asList("Ahone1", "ahone1", "phone333", "phone55555", "phone4444"));

        HashSet<String> filteredPhonees = phones.stream()
                .filter( s-> s.length()<10)
                .collect(Collectors.toCollection(HashSet::new));
        filteredPhonees.forEach(System.out::println);

    }
}

package src.main.java.lesson16;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMap {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("phone1", 5000),
                new Phone("phone2", 900),
                new Phone("phone3", 2500)
        ));
        Map<String,Integer> phonesMap =phones.stream() //maps - ключ и выражение
                .collect(Collectors.toMap(
                        n-> n.getName(),
                        p->p.getPrice()
                ));
        phonesMap.forEach((k,v)-> System.out.println(k + ":  "+ " v "+ v));

    }

}
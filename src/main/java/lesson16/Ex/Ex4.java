package src.main.java.lesson16.Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> citties = new ArrayList<>();
        Collections.addAll(citties,"paris","london","Madrid");

        Stream<String>citiesStream = citties.stream();//получаем поток
        citiesStream =citiesStream.filter(s->s.length()==6);
        citiesStream.forEach(s-> System.out.println(s));

        // то что ниже нельзя делать тк уже была терминальная операция!!! будет ошибка
        //long number = citiesStream.count();
        //System.out.println(number);
    }
}

package src.main.java.lesson16.Ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> citties = new ArrayList<>();
        Collections.addAll(citties,"paris","london","Madrid");
        citties.stream()//получаем поток
                .filter(s->s.length()==6)// в скобках лямда выражение
                .forEach(k -> System.out.println(k)); //выведим все элементы которые длина как в условии выше

    }
}

package src.main.java.lesson10.Map;

import java.util.Map;

public class LinkedHashMap { //хранит  в порядке добавления
    public static void main(String[] args) {

        Map<Integer, String> states = new java.util.LinkedHashMap<>();
        states.put(1, "Germany");
        states.put(2, "France");
        states.put(4, "UK");
        states.put(3, "Spain");
        System.out.println(states);


        for (Map.Entry<Integer, String> item : states.entrySet()) {//entrySet получить набло значений

            System.out.printf("Key :%d,valuje: %s", item.getKey(), item.getValue());
            System.out.println();
        }
    }
}
package src.main.java.lesson10;
import java.util.Map;

public class TreeMap { // хранит в порядке возрастания ключей
    public static void main(String[] args) {
        Map<Integer, String> states = new java.util.TreeMap<>();
        states.put(1, "Germany");
        states.put(2, "France");
        states.put(4, "UK");
        states.put(3, "Spain");
        System.out.println(states);


        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key :%d,valuje: %s", item.getKey(), item.getValue());
            System.out.println();
        }
    }
}


package src.main.java.lesson10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public Map<String, Integer> getRainbowColors() {
        Map<String, Integer> color = new HashMap<>();
        color.put("Red", 1);
        color.put("Orange", 2);
        color.put("Yellow", 3);
        color.put("Green", 4);
        return color;
    }

    public void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.printf("Key :%s,value: %d", item.getKey(), item.getValue());
            System.out.println();
        }
    }


    public void evenAndOdd(Set<Integer> set) {
        Map<Integer, String> evenAndOdd = new HashMap<>();
        for (Integer key : set) {
            if (key % 2 == 0) {
                evenAndOdd.put(key, "четное");
            } else {
                evenAndOdd.put(key, "nie четное");
            }
            evenAndOdd.forEach((a, b) -> System.out.println(a + "=" + b));
        }

    }


}

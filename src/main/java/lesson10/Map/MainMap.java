package src.main.java.lesson10.Map;

import src.main.java.lesson10.Map.MyMap;

import java.util.HashSet;
import java.util.Set;

public class MainMap { // хранит так как удобно
    public static void main(String[] args) {
     //  Map<Integer, String> states = new HashMap<>();
     //  states.put(1, "Germany");
     //  states.put(2, "France");
     //  states.put(4, "UK");
     //  states.put(3, "Spain");
     //  System.out.println(states);


     //  for (Map.Entry<Integer, String> item : states.entrySet()) {//entrySet получить набло значений

     //      System.out.printf("Key :%d,valuje: %s", item.getKey(), item.getValue());
     //      System.out.println();
     //  }

        System.out.println("---------------------");

        System.out.println();
        MyMap myMap = new MyMap();
        myMap.getRainbowColors();

        myMap.printMap(myMap.getRainbowColors());
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2 );
        set.add(3 );
        myMap.evenAndOdd(set);


    }
}
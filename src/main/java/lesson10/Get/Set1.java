package src.main.java.lesson10.Get;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>(); // уникальные значения должны быть
        set.add(1);// при добавлении генерируется хэш код и проверется есть ли такой хэщ код/ если нет-то добавляет
        set.add(2);
        set.add(3);
        for (Integer el :set){
            System.out.println(el);
        }
        LinkedHashSet <String> lss = new LinkedHashSet<>();// связаны и добавление в начало
        lss.add("A");
        lss.add("b");
        lss.add("c");
        System.out.println(lss);


        TreeSet <String> treeSet = new TreeSet<>(); //элементы сортируются сами
        treeSet.add("Germany");
        treeSet.add("Italy");
        treeSet.add("UK");
        System.out.println(treeSet);


    }
}

package src.main.java.lesson11.Oczeredi.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GenericsMain {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Hello");
        //String text =list.get(0) + "World!";
       // System.out.println(text);
       // list.add(123);
        for (Object el : list){
            System.out.println((String)el);
        }
        List<String> list1 = new ArrayList<>();
        list1.add("Hellooo");
        String test1 = list1.get(0);
        System.out.println(test1);

        ArrayList<String> arrayList = new ArrayList<>(); //алмазный синтексис алмазная запись  или даймонд

      //  List<String> list2 = Arrays.asList("tesat","rrrr");
      //  List<Integer> list3 = new ArrayList<>(list2); // неправильно разный тип данных
      //  System.out.println(list3);


    }
}

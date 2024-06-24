package src.main.java.lesson10;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {

        ArrayList<String> states  = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Uk");
        states.add("Spain");
        System.out.println(states.get(1));

        states.set(1,"Italy");
        System.out.println(states.get(1));

        System.out.printf("w spiskie %d elemetow \n", states.size()); //states.size() длина нашей листы %d int znaczenie
        //вывод чтобы было крассиво а не в []
        for (String str :states) {
            System.out.println(str);

        }

        if (states.contains("Germany")){ // .contains проверка есть ли такой элемент в листе
            System.out.println("Germany jest");
        }

        states.remove("Germany");
        System.out.println(states);

        states.remove(0);
        System.out.println(states);

        System.out.println("--------------");

        Object [] countris = states.toArray();
        for (Object obj : countris){
            System.out.println(obj);
        }


    }
}

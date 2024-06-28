package src.main.java.lesson11.Oczeredi;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {// двух направленная очередь
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.push("UK");
        states.addLast("Spain");
        states.add("Italy");


        System.out.println(states);
        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states.size());

        System.out.println("----------");
        while (states.peek() != null){
            //извлечение из начала с удаленем
            System.out.println(states.pop());
        }
        System.out.println(states.size());
    }
}

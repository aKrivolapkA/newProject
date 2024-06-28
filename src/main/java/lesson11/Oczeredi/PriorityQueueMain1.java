package src.main.java.lesson11.Oczeredi;

import java.util.PriorityQueue;

public class PriorityQueueMain1 {
    public static void main(String[] args) {
        PriorityQueue<Integer > priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        for ( int element : priorityQueue){
            System.out.println(element);
        }
        priorityQueue.remove(2); //удаление по значению а не по номеру
        System.out.println("after removing");
        for ( int element : priorityQueue){
            System.out.println(element);
        }
    }
}

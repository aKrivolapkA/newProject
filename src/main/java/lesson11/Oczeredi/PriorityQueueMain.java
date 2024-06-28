package src.main.java.lesson11.Oczeredi;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        //добавляем элементы в конец очереди
        PriorityQueue<Integer > priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        for ( int element : priorityQueue){
            System.out.println(element);
        }
        priorityQueue.remove(); //удаляет голову ( первый элемент) очереди)если нет элементов - то будет ошибка
        System.out.println("after removing");
        for ( int element : priorityQueue){
            System.out.println(element);
        }

        System.out.println("-----------PRIOrity q2");
        PriorityQueue<Integer > priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add(1);
        priorityQueue2.add(2);
        priorityQueue2.add(3);
        for ( int element : priorityQueue2){
            System.out.println(element);
        }
        priorityQueue2.poll();//удаляет голову ( первый элемент) очереди)если нет элементов - не  будет ошибка
        System.out.println("after removing");
        for ( int element : priorityQueue2){
            System.out.println(element);
        }
    }
}

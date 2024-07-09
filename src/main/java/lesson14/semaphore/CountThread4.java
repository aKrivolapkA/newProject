package src.main.java.lesson14.semaphore;

import src.main.java.lesson14.sinchronizacjaPotokow.CommonResource3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class CountThread4 implements Runnable {
    CommonResource4 result;
    Semaphore semaphore;// 2 констпуктора 1- какое количество может иметь доступ/ 2 - тоже самое +  порядок
    String name;


    public CountThread4(CommonResource4 result, Semaphore semaphore, String name) {
        this.result = result;
        this.semaphore = semaphore;
        this.name = name;

    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешение");
            semaphore.acquire();//получение 1  разрешения
            result.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + " : " + result.x);
                result.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();// освобождаем 1 разрешение
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);// 1- количество разрещений
        CommonResource4 commonResource4 = new CommonResource4();
        new Thread(new CountThread4(commonResource4,semaphore,"Thread 1")).start();
        new Thread(new CountThread4(commonResource4,semaphore,"Thread 2")).start();
        new Thread(new CountThread4(commonResource4,semaphore,"Thread 3")).start();
    }
}
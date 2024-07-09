package src.main.java.lesson14.Store2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Store2 {
    private int product = 0;
    ReentrantLock locker;
    Condition condition;

    public Store2() {
        locker = new ReentrantLock(); // создаем блокировку
        condition = locker.newCondition(); //создем условие для конкретной блокировки
    }

    private boolean available = false;

    public  void get() {
        try {
            locker.lock();
            while (product < 1) {
                condition.await();
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println(" товароы на складе " + product);
            condition.signalAll(); //все остальные потоки могут скоро  забрать монитор в управление
        } catch (InterruptedException ex) {

        } finally {
            locker.unlock(); //убираем блокировку
        }
    }

    public  void put() {
        try {
            locker.lock();
            while (product >= 3) {
                condition.await();
            }
            product++;
            System.out.println("производитель сделал  1 товар");
            System.out.println(" товароы на складе " + product);
            condition.signalAll(); //все остальные потоки могут скоро  забрать монитор в управление
        } catch (InterruptedException ex) {
        } finally {
            locker.unlock(); //убираем блокировку
        }
    }
}

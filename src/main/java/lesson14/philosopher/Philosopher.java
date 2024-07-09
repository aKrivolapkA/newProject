package src.main.java.lesson14.philosopher;

import java.util.concurrent.Semaphore;

public class Philosopher  extends Thread{
    // только два философа одновременно могут сидеть за столом
    Semaphore semaphore;
    int eatingNum = 0;// количество приемов пищи
    int id; // номер философа

    Philosopher ( Semaphore semaphore, int id){
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run(){
        try{
            while (eatingNum<3){// пока количество приемов пищи не будет равно 3 мы запрашиваем у симоформа  разрещение  на выполнение кода
                semaphore.acquire();
                System.out.println("Философ " + id + " садиться за стол");
                Thread.sleep(500);
                eatingNum++;
                System.out.println("Философ " + id + " выходит из за стола");
                semaphore.release(); //освобождаем
                Thread.sleep(500);
            }
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i <6 ; i++) {
            new Philosopher(semaphore,i).start();
        }
    }

}

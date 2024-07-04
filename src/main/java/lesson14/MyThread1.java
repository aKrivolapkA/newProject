package src.main.java.lesson14;

public class MyThread1 implements Runnable {

    MyThread1() {
    }

    @Override
    public void run() {
        System.out.printf("Потом %s начал работу\n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("потом прерван ");
        }
        System.out.printf("Потом %s заверщил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Главнй поток стартовал ");
        new Thread(new MyThread1(),"myThread1").start(); //создаем поток,не экземпляр
        System.out.println("Главнй поток завершил работу");
    }

}

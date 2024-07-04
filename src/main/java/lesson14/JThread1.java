package src.main.java.lesson14;

public class JThread1 implements Runnable  {

    @Override
    public void run() {
        System.out.printf("Потом %s начал работу\n", Thread.currentThread().getName());
        int counter = 1;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("цикл " + counter++);
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(Thread.currentThread().getName() + "поток прерван ");
                System.out.println(Thread.currentThread().isInterrupted());
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Потом %s заверщил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главнй поток стартовал ");
        Thread thread= new Thread(new JThread1());
        thread.start();
        try {
            Thread.sleep(150);
            thread.interrupt();
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            System.out.println("поток прерван");
        }
        System.out.println("Главнй поток завершил работу");
    }


}
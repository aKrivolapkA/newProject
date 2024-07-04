package src.main.java.lesson14;

public class MyThread extends Thread { // Thread поток

    MyThread(String name) {
        super(name);
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
        //создание и запуск и одного потока
       //System.out.println("Главнй поток стартовал ");
       //new MyThread("My tr").start();
       //System.out.println("Главнй поток завершил работу");

        //создание и запуск и нескольких  потоков
        System.out.println("Главнй поток стартовал ");
        for (int i = 1; i < 6; i++) {
            new MyThread("My tr" + i ).start(); // два метода run i start  -> метод start нужно вызывать - он сам обращается к методу ран
        }
        System.out.println("Главнй поток завершил работу");
    }

}

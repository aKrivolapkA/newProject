package src.main.java.lesson14;

public class JThread extends Thread { // втрой способ прервать поток

    JThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.printf("Потом %s начал работу\n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()) {
            System.out.println("цикл " + counter++);
        }
        System.out.printf("Потом %s заверщил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Главнй поток стартовал ");
        JThread jThread = new JThread("JThread");
        jThread.start();
        try {
            Thread.sleep(25);
            jThread.interrupt();
            Thread.sleep(25);
        } catch (InterruptedException ex) {
            System.out.println("поток прерван");
        }
        System.out.println("Главнй поток завершил работу");
    }


}
package src.main.java.lesson14;

public class MyThread2 implements Runnable {

    private boolean isActive;

    public void disable() {
        isActive = false;
    }

    MyThread2() {
        isActive = true;
    }

    @Override
    public void run() {
        System.out.printf("Потом %s начал работу\n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) { // (isActive) = означает тру  пока правда - будеь делать то что ниже
            System.out.println("цикл " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("потом прерван ");
            }

        } System.out.printf("Потом %s заверщил работу\n", Thread.currentThread().getName());
    }


    public static void main(String[] args) {

        System.out.println("Главнй поток стартовал ");
        MyThread2 myThread2=new MyThread2();
        new Thread(myThread2,"myThread2").start();
        try{ // прерывание потока
            Thread.sleep(1100);
            myThread2.disable();// прерывание потока  по времени
            Thread.sleep(1100);

        }catch (InterruptedException ex){
            System.out.println("поток прерван");
        }
        System.out.println("Главнй поток завершил работу");
    }

}

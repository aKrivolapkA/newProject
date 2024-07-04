package src.main.java.lesson14;

public class Main {
    public static void main(String[] args) {

        System.out.println("Главнй поток стартовал ");
        MyThread myThread = new MyThread("myThread");
        MyThread myThread1 = new MyThread("myThread1");
        myThread.start();
        myThread1.start();
        try{
            myThread.join();//  главный( текущий)  поток ждет пока завеощитсчя этот поток ( для которого метод join)
            myThread1.join();

        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Главнй поток завершил работу");
    }
}

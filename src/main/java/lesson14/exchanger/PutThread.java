package src.main.java.lesson14.exchanger;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable{
    Exchanger<String> exchanger;
    String message;

    public PutThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = " hello from PutThread";
    }

    public void run() {
        try{
            message = exchanger.exchange(message);
            System.out.println("PutThread  получил " +  message);
        }catch ( InterruptedException ex){
            System.out.println( ex.getMessage());
        }
    }
}

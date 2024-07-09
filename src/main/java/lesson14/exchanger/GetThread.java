package src.main.java.lesson14.exchanger;

import java.util.concurrent.Exchanger;

public class GetThread  implements Runnable{
    Exchanger<String> exchanger; // указываем тип данных которыми будем обмениваться
    String message;

    public GetThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = " hello from GetThread";
    }

    public void run() {
        try{
            message = exchanger.exchange(message);
            System.out.println("GetThread  получил " +  message);
        }catch ( InterruptedException ex){
            System.out.println( ex.getMessage());
        }
    }
}

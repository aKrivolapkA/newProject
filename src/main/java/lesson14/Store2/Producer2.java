package src.main.java.lesson14.Store2;

import src.main.java.lesson14.Store1.Store1;

public class Producer2 implements  Runnable {
    Store2 store2;

    public Producer2(Store2 store2) {
        this.store2 = store2;
    }

    @Override
    public void run() {
        for( int i =1; i<6;i++){
            store2.put();
        }

    }
}

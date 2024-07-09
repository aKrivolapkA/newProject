package src.main.java.lesson14.Store2;

import src.main.java.lesson14.Store1.Customer1;
import src.main.java.lesson14.Store1.Producer1;
import src.main.java.lesson14.Store1.Store1;

public class Main2 {
    public static void main(String[] args) {
        Store2 store2 = new Store2();
        Producer2 producer2 = new Producer2(store2);
        Customer2 customer2 = new Customer2(store2);
        new Thread(producer2).start();
        new Thread(customer2).start();
    }
}

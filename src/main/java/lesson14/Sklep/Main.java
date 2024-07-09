package src.main.java.lesson14.Sklep;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        new Producer(store).start();
        new Consumer(store).start();



    }
}

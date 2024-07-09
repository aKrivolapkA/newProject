package src.main.java.lesson14.Store1;

public class Main1 {
    // задача на складе одновременно может храниться только 3 товара
    // производитель доожен произвети 5 товаров и покупать должен купить 5 товаров
    public static void main(String[] args) {

        Store1 store1 = new Store1();
        Producer1 producer1 = new Producer1(store1);
        Customer1 customer1 = new Customer1(store1);
        new Thread(producer1).start();
        new Thread(customer1).start();
    }
}

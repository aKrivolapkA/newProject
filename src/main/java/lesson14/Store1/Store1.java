package src.main.java.lesson14.Store1;

public class Store1 {
    private  int  product =0;
    private  boolean available = false;

    public synchronized void get(){
        while (product<1){
            try {
                wait(); //метод класса Object
            }catch (InterruptedException ex){
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println(" товароы на складе " + product);
        notify();// прервать wait те  разрешаем другому потоку перехватить монитор ( управление)
    }

    public synchronized void put(){
        while (product>=3){
            try {
                wait();
            }catch (InterruptedException ex){
            }
        }
        product++;
        System.out.println("продавец положил  1 товар");
        System.out.println(" товароы на складе " + product);
        notify();
    }


}

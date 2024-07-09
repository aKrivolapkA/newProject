package src.main.java.lesson14.Sklep;

public class Consumer extends  Thread {
    Consumer (Store store){
        this.store= store;
    }
    Store store;// обьект магазина

    int product =0; // текущее количество купленных товаров

    @Override
    public void run(){
        try {
            while (product<5){
                product = product +  store.get();
                System.out.println("покупатель   купил  " + product + " товаров");
                sleep(150);// время простоя
            }
        }catch (InterruptedException ex){
            System.out.println("поток покупателя прерван");
        }
    }
}

package src.main.java.lesson14.Sklep;

public class Producer  extends Thread{
Producer (Store store){
    this.store= store;
}
    Store store;// обьект магазина

    int product =5; //количество товаров которое нужно произвести

    @Override
    public void run(){
        try {
            while (product>0){
                product = product - store.put();
                System.out.println("Производителю осталось произвести " + product + " товаров");
                sleep(100);// время простоя
            }
        }catch (InterruptedException ex){
            System.out.println("поток производителя прерван");
        }
    }

}

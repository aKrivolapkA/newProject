package src.main.java.lesson5;

public class Counter {
    public static final double PI=3.14; // вызов с большой буквы потому что константа из- за статик// // не внутри метода/ внутри класса она

    static int count;

    public static void increment(){
        count++;
        System.out.println("Текущее значение счетчика "+ count);
    }

    public static void main(String[] args) {
        System.out.println(Counter.PI);
        Counter.increment();// он пренадлежит классу поэтому можем его вызвать без создания
        Counter.increment();
        Counter.increment();
    }
 // статические методы образаться могут только к статическим методам и статическим переменным

}

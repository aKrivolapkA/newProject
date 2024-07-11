package src.main.java.lesson16.Ex;

import java.util.stream.IntStream;

public class Ex2 { //стримы  могут быть промежуточные и терминальная/ стрим не хранит элементы в отличии от коллекции
    public static void main(String[] args) {

         long count= IntStream.of(-5,-4,-3,-2,-1,0,1,2,3,4,5)
                 .filter(n->n>0).count();//.count(); терминальная операция
        System.out.println(count);

    }
}

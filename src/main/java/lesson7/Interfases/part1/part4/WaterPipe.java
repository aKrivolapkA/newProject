package src.main.java.lesson7.Interfases.part1.part4;

public class WaterPipe implements Stateable{

    @Override
    public void printState(int n) {
        if ( n ==OPEN){// rjy\\\константу можно использовать сразу
            System.out.println("Water is open");
        }else if(n ==CLOSE){
            System.out.println("Water is closed");
        }else {
            System.out.println("invalid state");
        }
    }
}

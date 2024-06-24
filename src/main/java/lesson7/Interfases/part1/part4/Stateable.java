package src.main.java.lesson7.Interfases.part1.part4;

public interface Stateable {
    int OPEN =1; //konstanta нке нужно указывать паблик статик файнал
    int CLOSE =0;

    void printState(int n);
}

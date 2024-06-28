package src.main.java.lesson11.account;

public interface Accountable <T>{// обобщенный параметр
    T getId();
    int getSum();
    void setSum(int sum);
}

package src.main.java.lesson11.account;

public class DepositAccount9<T> extends Account9{
    private T sum;
    public DepositAccount9(int id,T sum) {
        super(id);
        this.sum =sum;
    }

    public T getSum() {
        return sum;
    }

    public static void main(String[] args) {
        DepositAccount9<Integer> depositAccount = new DepositAccount9<>(2,400);
        System.out.println(depositAccount.getId());
        System.out.println(depositAccount.getSum());
    }
}
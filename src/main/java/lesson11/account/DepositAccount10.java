package src.main.java.lesson11.account;

public class DepositAccount10<T> extends Account8<T>{

    public DepositAccount10(T id) {
        super(id);
    }

    public static void main(String[] args) {
        DepositAccount10<Integer> depositAccount10 = new DepositAccount10<>(5);
        Account8<Integer> account8 = (Account8<Integer>) depositAccount10; //приведение типа  - (Account8<Integer>)
        System.out.println(account8.getId());
    }
}
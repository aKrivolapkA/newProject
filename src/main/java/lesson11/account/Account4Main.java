package src.main.java.lesson11.account;

public class Account4Main {
    public static void main(String[] args) {
        Account4<String,Double> account = new Account4<>("123",123.123);
        String id = account.getId();
        Double sum = account.getSum();
        System.out.printf(" id: %s, sum: %.2f ",id,sum); // !!! NIE PRINLN !!!


    }
}

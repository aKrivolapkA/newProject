package src.main.java.lesson11.account;

public class Account3Main {
    public static void main(String[] args) {

        Account3 <String> account1 = new Account3<>("234",550);
        Account3 <Integer> account2 = new Account3<>(123,550);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
    }
}

package src.main.java.lesson11.account;

public class Account2Main {
    public static void main(String[] args) {

        Accountable <String> account  = new Account2<>("1234",500);// создание от интерфейса

        Account2 <String> account2 = new Account2<>("234",550);// новый экземляр класса
        System.out.println(account.getId());
        System.out.println(account2.getId());
    }
}

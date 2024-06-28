package src.main.java.lesson11.account;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account(234,500);
        int accountId = (int)account.getId();
        System.out.println(accountId);

// тут будет ошибка
      //  Account1 account1 = new Account1("234",500);
      //  int account1Id = (int)account1.getId();
      //  System.out.println(account1Id);
//
    }
}

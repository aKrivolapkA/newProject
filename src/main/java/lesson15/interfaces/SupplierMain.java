package src.main.java.lesson15.interfaces;

import src.main.java.lesson15.ex6.User;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {

        Supplier<User> userFactory =()-> {
            Scanner in = new Scanner(System.in);
            System.out.println("wwedite Imie: ");
            String name = in.nextLine();
            return  new User(name);
        };

        User user1= userFactory.get();
        User user2= userFactory.get();

        System.out.println("name 1 "+ user1.getName());
        System.out.println("name 2 " + user2.getName());
    }
}

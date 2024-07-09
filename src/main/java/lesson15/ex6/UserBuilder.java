package src.main.java.lesson15.ex6;

public interface UserBuilder {
    User create( String name);

     static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Dan");
        System.out.println(user.getName());

    }
}
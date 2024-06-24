package src.main.java.lesson6;

public class Person { // если класс finall то наследовать нельзя будет -  public  final class Person

    private String name;
    private  String surname;

    public  Person( String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void displayInfo() {
        System.out.println("ИМЯ "+ this.name + "\n"+ "Фамилия" + this.surname );
    }

}

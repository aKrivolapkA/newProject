package src.main.java.lesson6.bank;

public class Employee1 extends Person1 {
    private  String bank;
    public Employee1(String name, String surname,String bank){
        super(name,surname);
        this.bank =bank;
    }
    public Employee1(String name, String bank){
        super(name);
        this.bank =bank;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public void displayInfo(){
         System.out.println("name " + super.getName() + "ФАмилия" +super.getSurname()+ "bank " + bank); // второй вариант вывода
    }
}

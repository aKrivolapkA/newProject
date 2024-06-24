package src.main.java.lesson6.bank;

public class Manager1 extends Employee1 {
    public  Manager1 (String name,String bank){
        super(name,bank);
    }

    public void displayInfo(){
        System.out.println("name "+ super.getName() + ", bank "+  super.getBank());
    }
}

package src.main.java.lesson6;

public    class Employee extends Person {//public  abstract  class Employee extends Person  = абстрактный класс/ у него нельзя создать экземпляр
    private  String company;
    public Employee(String name, String surname,String company){
        super(name,surname);// отсылка на супер класс  в конструкторе
        this.company=company;
    }

    // @Override переопределение метода /можем использовать уже что есть плюс добавить например вывод еще одного поля

    @Override
    public void displayInfo(){
        super.displayInfo(); //сначала выведит то что в классе персон а потом название кампании и вызываем мето или переменную
        System.out.println("Company " + this.company);
       // System.out.println("name " + super.getName() + "ФАмилия" +super.getSurname()+ "company " + company); // второй вариант вывода
    }
}

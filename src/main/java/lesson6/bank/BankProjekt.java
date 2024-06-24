package src.main.java.lesson6.bank;

public class BankProjekt {
    public static void main(String[] args) {

        Object employee = new Employee1("Alex","Sidorowa","VTB");
        Person1 person1 = new Client1("tom","Kin", "VTB");

   // //преобоазование
   // ((Employee1)employee).displayInfo(); //сделала приобразование
   // person1.displayInfo(); //не нужно делать преоьразования потому что в классе первон 1 уже есть такой метод
   // String  bank =((Client1)person1). getBank();//  в первых (к какому типу преобразовыввем )

   // //String  bank =person1. getBank();// не скомпилируется тк у у класса персон нет   метода  getBank()  / необходимо преобразование типов



   // Employee1 man = new Manager1("Alena","BNB");//восходящее преобразование  / все гуд
   // man.displayInfo();


   // Manager1 manager1 =new  Employee1("test","test bank");// нисходящее преобразование / будет проблема и нужно сделать преобразование




    }
}

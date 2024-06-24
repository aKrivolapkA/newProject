package src.main.java.lesson6;

public class Main {
    public static void main(String[] args) {

        Get get = new Get();
       //get.name = " ";
       //get.age = -100;
       //get.wejght = 0; этот код работать не будет тк поля privet

        Get barsik = new Get(" Barsik",5,3);
        String barsikName = barsik.getName();
       // int barsikAge= barsik.getAge();
        int barsikWejght = barsik.getWejght();

       // System.out.println("Name " + barsikName+ " Age "+ barsikAge + " wes " +barsikWejght);

        barsik.setAge(-1);

     //   System.out.println( " wes " +barsik.getAge());


    }
}

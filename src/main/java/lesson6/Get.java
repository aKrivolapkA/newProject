package src.main.java.lesson6;

public class Get  extends  Creature {
    private String name;
    private int age;
    private int wejght;

    public Get(String name, int age, int wejght) {
        this.name = name;
        this.age = age;
        this.wejght = wejght;
    }

    public Get() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("nieprawilnyj wozrast");
        }
    }



    public int getWejght() {
        return wejght;
    }

    public void setWejght(int wejght) {
        this.wejght = wejght;
    }

    public void sayMeow() {
        System.out.println("Meow");
    }
}

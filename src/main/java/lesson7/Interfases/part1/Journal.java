package src.main.java.lesson7.Interfases.part1;

public class Journal implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print");
    }
}

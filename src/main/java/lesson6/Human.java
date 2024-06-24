package src.main.java.lesson6;

public class Human extends Creature {
    private String job;

    public Human(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void work() {
        System.out.println("I'm " + getName() + "I'm working as " + job);
    }

    public Human() {

    }

    @Override
    public void eat() {
        System.out.println("I'm eating like a gentleman! ");
    }


}

package src.main.java.lesson5;

public class Boing737 {
    private int creationYear;
    private static int maxPassengersCount= 300;

    Boing737(int creationYear){
        this.creationYear =creationYear;
    }

    public int getCreationYear() {
        return creationYear;
    }
    public static class Drawing{
        public static int getMaxPessengersCount(){
            return maxPassengersCount;
        }
    }
}
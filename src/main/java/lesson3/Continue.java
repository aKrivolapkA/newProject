package src.main.java.lesson3;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i<10;i++){
            if (i==2){
                continue; // осуществляет переход в начало условного выражения
            }
            System.out.println(i);
        }

    }
}

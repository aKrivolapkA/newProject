package src.main.java.lesson4;

public class Console {
    public static void main(String[] args) {

        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");

        int x =1;
        int y = 2;

        System.out.printf("x =%d;y=%d\n",x,y ); //printf + %d // \n - переход на следующую строкуb
        //%f - вещественные значения
        //%s- строковые  значения
        //%c -символьные ( одиночные) значения

        System.out.println("-------------");
        String name = "Алена";
        int age = 18;
        float height =1.7f;
        System.out.printf("Имя :%s,\nAge:%d,\nРост:%.3f", name,age,height); // через запятую перечесляем переменные какие подставить/\nРост:%.3f" - .3 сколько знаков после запятой

    }

}

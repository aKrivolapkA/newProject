package src.main.java.lesson4;

public class Box {

    double width;
    double height;
    double depth;

    Box(){
        width=0;
        height=0;
        depth=0;
    }
    Box(double width,double h,double depth){
        this.width=width;
        height=h ; //чтобы понять что это параметр а не поля класса
        this.depth=depth;
    }
}
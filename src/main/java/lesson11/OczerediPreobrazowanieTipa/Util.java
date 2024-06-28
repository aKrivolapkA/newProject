package src.main.java.lesson11.OczerediPreobrazowanieTipa;

public class Util {
    public static  <T> T getValue(Object  object,Class <T> class1 ){ //<T> T не знаем какой тип будет возвращать и принимать /любая буква может бытб
        return (T) object;
    }

    public static  <T> T getValue(Object  object){
        return (T) object;
    }
}

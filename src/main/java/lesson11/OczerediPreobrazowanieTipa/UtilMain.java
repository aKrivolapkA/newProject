package src.main.java.lesson11.OczerediPreobrazowanieTipa;


import java.util.Arrays;
import java.util.List;

public class UtilMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello ", "World");
        for ( Object object :list){
            String data = Util.getValue(object, String.class); //String.class чтобы преобразовать к типу класс
            System.out.println(data);
            System.out.println(Util.<String> getValue(object));
        }

        List list1 =Arrays.asList(2,3);
        for( Object element : list1){
            System.out.println(Util.<Integer>getValue(element) +1 );
        }
    }
}

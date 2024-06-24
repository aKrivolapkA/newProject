package src.main.java.lesson9.strings;

public class StringSplit {
    public static void main(String[] args) {

        String str ="this is a string";
        String[] parts = str.split(" ");//split разделить и какой разделитель в данном случае spacja

        for ( String s :parts){
            System.out.println(s);
        }

        // String pool
        String str1 ="hello";
        String str2 ="hello"; //в динмической памяти храниться только 1 обьект hello


    }
}

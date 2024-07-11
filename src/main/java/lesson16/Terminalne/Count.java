package src.main.java.lesson16.Terminalne;

import java.util.ArrayList;
import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("tom","sam","Bob","Alice"));

        System.out.println(names.stream().filter(m ->m.length()<=3).count());

    }
}

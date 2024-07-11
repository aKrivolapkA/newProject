package src.main.java.lesson16.Terminalne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class FindFirstFindAny {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("tom","sam","Bob","Alice"));

        Optional<String> first = names.stream().findFirst(); //findFirst первый элемент возвращает
        System.out.println(first);

        Optional<String> any = names.stream().findAny();//findAny рандомный элемент возвращает
        System.out.println(any);

    }
}

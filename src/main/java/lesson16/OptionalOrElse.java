package src.main.java.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalOrElse {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        Optional<Integer> min = nums.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); //orElse альтернативное значение которое будет возвращаться если условие не выполниться

        nums.addAll(Arrays.asList(new Integer[]{14,5,6,7,8,9}));
        min = nums.stream().min(Integer::compare);
        System.out.println(min.orElse(-1));
    }
}

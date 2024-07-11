package src.main.java.lesson16.Inne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SkipAndLimitForPages {
    public static void main(String[] args) {

        List<String> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(new String[]{
            "phone1","phone333","phone22","phone5555","phone4444",
                "phone6","phone777","phone88","phone99","phone10"
        }));
        int pageSize= 3;
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("input number of page: ");
            int page = scanner.nextInt();

            if( page<1){
                break;
            }
            phones.stream()
                    .skip((page -1) * pageSize)
                    .limit(pageSize)
                    .forEach(System.out::println);
        }
    }
}

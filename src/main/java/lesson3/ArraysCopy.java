package src.main.java.lesson3;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;// один массивю поменяв одно меняешь другое
        int[] c = {1, 0, 0,4,5};
        b[0] =50;
        for(int el : a) {
            System.out.println(el);
        }
        System.arraycopy(a,1,c,1,2);//skad, z jakiego elementu,  w jaki wrzucamy masiw
        System.out.println(Arrays.toString(c));

    }
}

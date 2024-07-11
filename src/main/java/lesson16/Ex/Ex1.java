package src.main.java.lesson16.Ex;

public class Ex1 {
    public static void main(String[] args) {
        // пример до появления Stream api
        int[] numbers = {-5,-4,-3,-2,-1,0,1,2,3,4,5};

        int count= 0;

        for (int i:numbers) {
            if( i>0){
                count++;

            }
        }
        System.out.println(count);
    }
}

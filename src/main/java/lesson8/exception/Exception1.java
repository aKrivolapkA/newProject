package src.main.java.lesson8.exception;

public class Exception1 {// обработка исключения  програма благодаря этому не останавливается а идет дальше

    public static void main(String[] args) {

        int d, a;
        try {
            d = 0;
            a = 50 / d;
            System.out.println("eto nie budet wywedeno ");
        } catch (ArithmeticException e) {
            System.out.println("error delenia na 0 wyzwalo iskluczenie \n" + e);
        }
        System.out.println("kod posle operatora cath");
        System.out.println("________________________________");


        try {
            int b = args.length;
            System.out.println("b = " + b);
            int c = 10 / b;
            int [] m = {1};
            m[10]=999;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("error delenia na 0 wyzwalo iskluczenie \n" + e);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("error index za predelami \n "+ exception ); //сюда уже не попадем
        }
        System.out.println("kod posle operatora cath");


        try {
            int a1 =0;
            int b1=10/a1;

        }catch (Exception ex){ //ArithmeticException идет от супер класса Exception поэтому перехват и не получится// от более узкого класса в нужно начинать
            System.out.println("perechwat iskluczenia obsego klassa ");
      //  }catch (ArithmeticException exception){
       //     System.out.println("etot kod niedostezym");
        }
    }
}

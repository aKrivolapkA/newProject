package src.main.java.lesson9.exception;

public class Exception4 {
    static String helloWorld(){
        try{
            return "Trying string";
        }catch (Exception e){
            return "catch Sting";
        }finally { //finally - в любом случае будет это сделано
            return "Finally String";
        }
    }

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }
}

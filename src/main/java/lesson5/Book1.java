package src.main.java.lesson5;

public class Book1 {
    private String name;

    public String getName() { //getter возвращает переменную
        return name;
    }

    public void setName(String name) { // setter принимает значение и передает значение переменной
        this.name = name;
    }
    //конструтор
    public Book1(String name){
        this.name =name;
    }
    private static void  read(Book1 book){
        book.setName("Неизвестная книга");
    }
    private static void read ( String title){
        title="Неизвестная книга";
    }
    public static void main(String[] args) {
        Book1 book1 =new Book1("Война  и мир");
        read(book1); //поменялось значение потому что обьект  меняется значение в ячейке памяти/ лбьект передается по ссылке//ссылочный тип даных
        System.out.println(book1.getName());

        int n = 5;

        //read(n);//не поменялось значение потому что примитиынй тип данных ( был создан новый обьек
        //System.out.println(n);

        String title =" cos innego";
        read(title); // не поменяется потому  String
        System.out.println(title);


    }
}

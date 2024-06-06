package src.main.java.lesson5;

public class Bicycle {
    private String model;
    private int wejght;
    private int seatPostDiametr;

    Bicycle(String model, int wejght) {
        this.model = model;
        this.wejght = wejght;
    }

    Bicycle(String model, int wejght, int seatPostDiametr) {
        this.model = model;
        this.wejght = wejght;
        this.seatPostDiametr = seatPostDiametr;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    //  public static Seat createSeat(){ // этот код не скомпилируется тк в статическом методе внещнего класса нельзя создать обьект внутреннего клааса
    //      return new Seat();
    //  }

    public Seat createSeat() { // этот код скомпилируется  тк не статический
        return new Seat();
    }

    public class SteetingWeel {
        public void right() {
            System.out.println("Руль вправо");

        }

        public void left() {
            System.out.println("Руль влево");

        }
    }

    public class Seat {
        //public  static  String x =""; // во внутреннем нельзя создавать статические переменные и методы во внутреннем класса до java 16

        public   void up() {
            System.out.println("Сидение поднято выше");

        }

        public void down() {
            System.out.println("Сидение опущено ниже");

        }

        public void getSeatParameter() {
            //у обьектов внутреного класса есть доступ к переменным внешнего класса, даже если они privet
            System.out.println("Паоаметр сиденья " + Bicycle.this.seatPostDiametr);
        }

    }
}

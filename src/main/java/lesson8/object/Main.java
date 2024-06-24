package src.main.java.lesson8.object;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        int age = 18;
        System.out.println("Age " + age);

        // // под капотом вот что происходит
        // String s = String.valueOf(18);
        // String result = "Age " +18;

        Student student = new Student("Ivan");
        System.out.println("Student is " + student);


        Man man = new Man("blue", 123);
        Man man1 = new Man("blue", 123);
        Man man2 = new Man("blue", 1234);
        Woman woman = new Woman("blue", 123);


        System.out.println(man.equals(woman)); // разные классы поэтому будет ошибка! нельзя выполнить преобразование классов // false, потому что разные классы
        // ( потом мы добавили  if(getClass()!=o.getClass()){ // проверка равны ли обьекты ( то есть с одного класса) return false; и все ок

        System.out.println(man.equals(man1));//true
        System.out.println(man.equals(man2));//false

        System.out.println("---------------------------");

        Auto ferrari1 = new Auto("Ferrari", 1990, 1000);
        Auto ferrari2 = new Auto("Ferrari", 1990, 100);
        System.out.println("равны ли эти обьекты друг другу ? ");
        System.out.println(ferrari1.equals(ferrari2));

        System.out.println("Какие у них hashcode ? ");
        System.out.println(ferrari1.hashCode());
        System.out.println(ferrari2.hashCode());
        System.out.println("---------------------------");

        Car1 car = new Car1(" gruzowik", new Driver("Wasili", 40));
        Car1 clonedCar = car.clone();
        System.out.println("1 car: " + car);
        System.out.println("Klonirowana " + clonedCar);

        // меняем значение для кланированой мащины
        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Kolia");

        System.out.println("pierwaja maszyna posle izmenienia  " + clonedCar);

        System.out.println("---------------------------");

        Car1 car1 = new Car1("legowaja",new Driver("petia",30));
        Car1 car2 = new Car1(car1);
        System.out.println(car1);
        System.out.println(car2);

        car2.setDriver(new Driver("ivan",25));
        System.out.println(car1);
        System.out.println(car2);
    }
}

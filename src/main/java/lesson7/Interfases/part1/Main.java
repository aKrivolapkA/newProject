package src.main.java.lesson7.Interfases.part1;

import src.main.java.lesson7.Interfases.part1.part7.ErrorMonitoringSystem;
import src.main.java.lesson7.Interfases.part1.part7.GeneralMonitoringSystem;
import src.main.java.lesson7.Interfases.part1.part7.MonitoringSystem;
import src.main.java.lesson7.Interfases.part1.part7.SecurityMonitoringSystem;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("aaaa", "ddd", 2);
        book.print();


        // Printable printable = new Printable()  экземпляр интервейса нельзя создать

        Journal journal = new Journal("adaf");
        journal.print();
        journal.print1();


        Printable.read(); // тк метод статический можем сразу к нему так образаться

        //part 7
        GeneralMonitoringSystem generalMonitoringSystem = new GeneralMonitoringSystem();
        ErrorMonitoringSystem errorMonitoringSystem = new ErrorMonitoringSystem();
        SecurityMonitoringSystem securityMonitoringSystem = new SecurityMonitoringSystem();
        generalMonitoringSystem.startMonitoring();
        errorMonitoringSystem.startMonitoring();
        securityMonitoringSystem.startMonitoring();

        //удобнее записать тк ниже потому что более читабельно и не нужно создавать 3 лищний классов

        MonitoringSystem general = new MonitoringSystem() { //анонимный класс имеет доступ к переменным главного( в котором находиться) классе,
            // но наобороь нет!  нельзя вызвать метод  анонимного класса за пределами метода в котором он определен
            // еще особеность/ ято анонимный класс не может быть статическим
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общий стартовал.");
            }
        };
        MonitoringSystem error = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг ошибок стартовал.");
            }
        };
        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг security стартовал.");
            }
        };
        general.startMonitoring();
        error.startMonitoring();
        security.startMonitoring();
    }
}

package src.main.java.lesson7.Interfases.part1.part7;

public class SecurityMonitoringSystem implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал.");
    }
}

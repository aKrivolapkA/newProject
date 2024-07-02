package src.main.java.lesson5.Bicycle;

import src.main.java.lesson5.Bicycle.Bicycle;

public class BicycleProjekt {
    public static void main(String[] args) {

        Bicycle aist = new Bicycle("Аист",120);
        Bicycle.SteetingWeel wheel = aist.new SteetingWeel();
        Bicycle.Seat seat = aist.new Seat();

        seat.up();
        aist.start();
        wheel.left();
        wheel.right();
        seat.down();




        Bicycle bicycle = new Bicycle("aist",120,10);
        Bicycle.Seat seat1 = bicycle.new Seat();
        seat1.getSeatParameter();


    }
}

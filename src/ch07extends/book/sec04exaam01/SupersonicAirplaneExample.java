package ch07extends.book.sec04exaam01;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane o1 = new SupersonicAirplane();
        o1.takeoff();
        o1.fly();
        o1.flyMode = SupersonicAirplane.SUPERSONIC;
        o1.fly();
        o1.flyMode = SupersonicAirplane.NORMAL;
        o1.fly();
        o1.land();
    }
}

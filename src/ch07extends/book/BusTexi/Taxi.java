package ch07extends.book.BusTexi;

import ch07extends.book.Tire.Vehicle;

public class Taxi  extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}

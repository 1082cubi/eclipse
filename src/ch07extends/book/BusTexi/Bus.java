package ch07extends.book.BusTexi;

import ch07extends.book.Tire.Vehicle;

public class Bus  extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}

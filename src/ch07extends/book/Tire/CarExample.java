package ch07extends.book.Tire;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        int i;

        i =3 ;

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}

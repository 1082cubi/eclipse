package ch13generic.book.p573;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv,String> product1 = new Product();

        product1.setkind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv =product1.getKind();
        String tvModel = product1.getModel();
        Product<Car, String> product2 = new Product<>();

        product2.setkind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}

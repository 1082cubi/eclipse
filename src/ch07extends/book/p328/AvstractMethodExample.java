package ch07extends.book.p328;

public class AvstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }
    public  static void animalSound(Animal animal) {
        animal.sound();
    }
}

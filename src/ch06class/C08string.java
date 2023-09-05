package ch06class;

public class C08string {
    public static void main(String[] args) {
    MyClass08 o1 = new MyClass08();
    o1.name ="java";
    o1.printName();


        MyClass08.name = "Spring";
        MyClass08.printName();
    }
}
class MyClass08 {
    static String name;

    static void printName() {
        System.out.println("name +" + name);
    }
}
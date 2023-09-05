package ch06class;

public class C09static {
    public static void main(String[] args) {
        MyClass09 o9= new  MyClass09();
        o9.printName();
    }
}
class MyClass09 {
    String name;

    static String model;

    void printName() {
        System.out.println("model = " + model);

        System.out.println("name = " + name);
    }
}
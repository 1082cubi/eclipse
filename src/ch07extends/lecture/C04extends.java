package ch07extends.lecture;

public class C04extends {
    public static void main(String[] args) {
        MyClass041 o1 = new MyClass041();
        o1.method1();
        o1.method2();

        MyClass042 o2 = new MyClass042();
        o2.method1();
        o2.method3();

    }
}
class MyClass04 {
    void method1() {
        System.out.println("MyClass04.method1");
    }
}
class MyClass041 extends MyClass04{
    void method2() {
        System.out.println("MyClass041.method2");
    }
}
class MyClass042 extends MyClass04 {
    void method3() {
        System.out.println("MyClass042.method3");
    }
}

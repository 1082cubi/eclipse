package ch07extends.lecture;

public class C02extedns {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();

        o1.name = "spring";

        o1.method3();
    }
}

class MySubClass02 {
    String name;

    void method3() {
        System.out.println("name = " + name);
    }
}

class MySubClass021 extends MySubClass02 {
}
    //MyClass02 : 상위 클래스, 부모 클래스, Super class
    //MySubClass021 : 하위 클래스, 자식 클래스,Sub class
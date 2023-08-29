package ch07extends.lecture;

public class C08super {
    public static void main(String[] args) {
        MySubClass081 o1 = new MySubClass081();
        o1.method();
    }

}
class MySubClass081 extends MyClass08 {
    void method() {
//        super.method();
        System.out.println("자식 메소드");
    }
}
class MyClass08 {
    void method() {

        System.out.println("부모의 메소드!");
    }
}

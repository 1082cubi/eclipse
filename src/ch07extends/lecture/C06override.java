package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MyClass061 o1 = new MyClass061();
        o1.method10();      //자식클래스의 메소드
    }
}
class MyClass061 extends MyClass06 {
    //코드 작성
//    @Override // 컴파일시 재정의한 메소드인지 검증함
    public void method10() {
        System.out.println("자식클래스");
    }
}
class MyClass06 {
    public void method10() {
        System.out.println("부모클래스의; 메소드");
    }
}

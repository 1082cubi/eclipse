package ch08interface.leture;

public class C12prive {
}
interface MyInterface12 {
    default void method1() {
        System.out.println("어떤기능");
        System.out.println("어떤기능");
    }
    default void method2() {
        // public instance 메소드
        someFeature();
        System.out.println("어떤 기능");

    }
    private void someFeature() {
        //private instance 메소드
        System.out.println("어떤 기능");
    }
}


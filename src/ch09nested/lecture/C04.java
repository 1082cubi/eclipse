package ch09nested.lecture;

public class C04 {
    // static member 는 instance member 에 접근할 수  없다.

    int instanceField;
    static int staticField;

    static class StaticNestedClass {
        void method1() {
            System.out.println(staticField);
        }
    }
    class InnerClass {
        void method1() {
            System.out.println(instanceField);
            System.out.println(staticField);
        }
    }

}

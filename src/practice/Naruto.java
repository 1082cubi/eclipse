package practice;

import java.util.StringTokenizer;

public class Naruto {
    public static void main(String[] args) {

        A b =new B();
        A d = new D();

        b.method1();
        b.method2();

        d.method1();
        d.method3();
        System.out.println();
        A a1 = new B();

        }
    }
    interface A {
    void method1();
    default void method2() {

    }
    default void method3() {

    }
    }
    class B implements A {
        public void method1() {
            System.out.println("1번아이");
        }
        public void method2() {
            System.out.println("두번째 아이");
        }

    }

        class D implements A {
            public void method1() {
                System.out.println("첫번째 아이");
            }

            public void method3() {
                System.out.println(" 4번째 아이");
            }
        }


package practice;

public class Naruto20230830 {
    public static void main(String[] args) {
        A a1 = new A(10, 20);
//        a1.sum();
    }
}


class A {
    int a, b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a);
    }

    void sum() {
//        System.out.println(a + b);
    }
}
package ch09nested.lecture;

public class C05 {
    String name;
    class InnerClass {
        String name;

        void method() {
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(C05.this.name);
        }
    }
    public static void main(String[] args) {
        C05 o2 = new C05();
        InnerClass o1 = o2.new InnerClass();
        o1.method();
    }
}

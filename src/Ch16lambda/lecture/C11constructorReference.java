//package Ch16lambda.lecture;
//
//public class C11constructorReference {
//    public static void main(String[] args) {
//        MyInterface111 o1 = z -> new MyClass11(z);
//        MyClass11.MyInterface111 o2 = MyClass::new;
//        MyInterface112 o3 = (a,b) -> new MyClass11(a,b);
//    }
//}
//class MyClass11{
//    MyClass11(int a ) {
//
//    }
//    @FunctionalInterface
//    interface MyInterface111 {
//        MyClass11 method(int x);
//    }
//    interface MyInterface112 {
//        MyClass11 someMethod();
//    }
//}

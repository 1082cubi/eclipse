package ch11exception.lecture;

public class C20polymrphism {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    public static void method1() throws ClassNotFoundException {
        method2();
    }
    public static void method2() throws ClassNotFoundException{
}
}
package ch07extends.lecture;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
        // private 멤버 접근 가능

    }

    void publicMethod() {
        System.out.println("MyClass30.privateMethod");
        // private 멤버 접근 가능
        // private 멤버(필드,생상자,메소드) 접근 가능
        // privateMethod();
    }

    void packageprivateMethod() {
        System.out.println("MyClass30.packageprivateMethod");
        //private 멤버 접근 가능
        privateMethod();
        protectedMehod();
    }

    protected void protectedMehod() {
        System.out.println("MyClass30.protectedMehod");

        privateMethod();
        packageprivateMethod();
        publicMethod();
    }
}

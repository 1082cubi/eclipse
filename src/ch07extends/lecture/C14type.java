package ch07extends.lecture;

public class C14type {
    // 기본 타입
    int a= 3;
    double f = 3.2;
    double g = 32;
    String b = "java";

    Object o = "java";

    child c = new child();
    parent d = new child();
}
class parent {}
class child extends parent {}

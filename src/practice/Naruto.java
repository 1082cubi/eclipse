package practice;

public class Naruto {
    public static void main(String[] args) {
        A a = new A();
        int num = a.g(4,2);
        System.out.println(num);
    }
    }
class A {
    int g (int a, int d) {
        int num = 0;
        if (a>d) {
            num = a;
        } else
            num = d;
        return num;

    }
}
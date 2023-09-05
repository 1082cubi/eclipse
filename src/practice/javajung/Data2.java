package practice.javajung;

public class Data2 {
    int x;
}
class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x=10;
        System.out.println("main" + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main :" + d.x) ;
    }
    static  void change (Data2 c) {
        c.x = 1000;
        System.out.println("change : " + c.x);
    }
}

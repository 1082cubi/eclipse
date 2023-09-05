package Ch16lambda.lecture;



public class C02lambda {
    public static void main(String[] args) {

        MyInterface02 o1 = () -> {
            System.out.println("C02lambda.main");
        };
        o1.method1();

        MyInterface02 o2 = ()-> System.out.println("메소드 내 코드가 한줄");
        o2.method1();
    }
}
interface MyInterface02{
    void method1();
}

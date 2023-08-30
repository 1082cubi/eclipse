package ch07extends.lecture;

public class C17cast {
    public static void main(String[] args) {
        Anima17 ani1 = new Dog17();
        Anima17 ani2 = new Cat17();

        if (ani1 instanceof  Dog17) {
            Dog17 d1 = (Dog17) ani1; // 된다.
            d1.bark();
        }
        else {
            System.out.println("dog 형변환 안됨");
        }
        if(ani1 instanceof Cat17) {    //안됨
            Cat17 c1 = (Cat17) ani1;
            c1.red();
         }else {
            System.out.println("Cat 로 형변환 안됨");
        }
        if (ani2 instanceof Dog17) {
            Dog17 d2 = (Dog17) ani2;    //안됩 false
            d2.bark();
        }else {
            System.out.println("도그로 형변한 안됩");
        }
        if (ani2 instanceof Cat17){
            Cat17 c2 = (Cat17) ani2;  // 됨
            c2.red();
        }else  {
            System.out.println("캣으로 형변환 안됨");
        }
        System.out.println("프로그램 종료");
    }
}
class Anima17{}
class Dog17 extends Anima17{
    public void bark() {
        System.out.println("멍멍 !");
    }
}
class Cat17 extends Anima17{
    public void red() {
        System.out.println("야옹~");
    }
}

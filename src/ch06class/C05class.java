package ch06class;

public class C05class {
    public static void main(String[] args) {
        Myclass05 o1 = new Myclass05();
        Myclass05 o2 = new Myclass05();


        System.out.println("o1의 참조값" + System.identityHashCode(o1));

        o1.age = 30;
        o1.model = "java";      //권장하지 않음.
        Myclass05.model = "spring";

        System.out.println("o1.age = " + o1.age);

        System.out.println("o2.age = " + o2.age);

        System.out.println("o1.model = " + o1.model);

        System.out.println("o2.model = " + o2.model);
    }
}

class Myclass05 {
    // 속성 fields
        int age; //instance fieild
            // static //fieild, class field, 정적필드
            static String model;
    //기능
}

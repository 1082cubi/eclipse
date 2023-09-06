package ch12api.lecture;

public class C10wrapper {
    public static void main(String[] args) {


    //wrapper class : 기본타입을 감싸고 있는 클래스

    // 기본타입 : byte,short,int , long, float, bouble,char,boolea
    // wrapper class : Byte, Shot, Integer,Long,Float,Double,Character,Boolean

    // boxing : 기본타입-> 참조타입
    // unboxing : 참조타입 -> 기본타입

        int i = 500;
//        Integer j = new Integer(i); //boxing
        Integer k = Integer.valueOf(i); //boxing

        System.out.println(i);
//        System.out.println(j);
        Integer l = Integer.valueOf(1000);
        int m = l.intValue(); // unboxing

        System.out.println(l);
        System.out.println(m);

        //auto boxing
        int n = 777;
        Integer o = n; // auto boxing
        // ayto     unboxing
        Integer p = Integer.valueOf(888);
        int q = p;// auto boxing
}
}

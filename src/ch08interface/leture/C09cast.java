package ch08interface.leture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c = "java";

        String s = (String) c; //ok
        Object o = (Object) c; //ok
        Serializable se = (Serializable) c;
        Comparable co = (Comparable) c;
        Constable con = (Constable) c;
        ConstantDesc cd = (ConstantDesc) c;

//        Number
        System.out.println("프로그램 종료");
    }
}

package ch08interface.leture;

import ch08interface.book.p363.Searchable;

import java.io.Serializable;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i =3;

        // 상위타입으로 형변환 하는 코드 최대한 많이 작성해 보기
        Number n = i;
        Object o = i;
        Serializable s = i;


    }
}

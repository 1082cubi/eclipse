package ch12api.book.p561moonje5;

import java.util.*;

public class StudentExample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new  HashSet<>();

        //Studet 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 Student  수: " + hashSet.size());
    }
}

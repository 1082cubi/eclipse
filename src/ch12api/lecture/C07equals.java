package ch12api.lecture;

import java.util.Objects;

public class C07equals {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07("박지성");
        MyClass07 o2 = new MyClass07("박지성");
        MyClass07 o3 = new MyClass07("김민재");

        System.out.println(o1 == o2); // false
        System.out.println(o1.equals(o2)); // true

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}

class MyClass07 {
    private String name;

    public MyClass07(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass07 myClass07 = (MyClass07) o;

        return Objects.equals(name, myClass07.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

package ch06class;

public class C10capsule {
    public static void main(String[] args) {
        MyClass10 o10 = new MyClass10();
        o10.setName("이름");
        System.out.println(o10.getName());
    }
}
class MyClass10 {
        //특별함 이유가 없다면
        // 필드는 private으로
        //관련된 메소드(주고 getter, setter)를 public으로 작성
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

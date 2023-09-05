package ch12api.lecture;

public class C04getterSetter {
    public static void main(String[] args) {
        MyClass04 myClass04 = new MyClass04();
        myClass04.setName("손흥민");
        myClass04.setName("thsgmd");
    }
}

class MyClass04 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "MyClass04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }
}
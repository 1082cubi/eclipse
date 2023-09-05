package Ch16lambda.lecture;

public class C12comstructorReference {
    public static void main(String[] args) {
        for(int i = 1; i <10; i++) {
            Student s = new Student(i);
            System.out.println(s);
        }

    }
}

class Student {
    private int number;
    Student(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                '}';
    }
}
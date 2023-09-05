package Ch16lambda.book.p707;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();


        person.action(Computer :: staticMethod);

        Computer com = new Computer();

        person.action(com :: intanceMethod);
    }
}

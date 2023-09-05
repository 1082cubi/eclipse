package Ch16lambda.book.p710;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person=new Person();
        person.ordering(String :: compareToIgnoreCase);
    }
}

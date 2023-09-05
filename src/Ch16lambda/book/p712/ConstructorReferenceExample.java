package Ch16lambda.book.p712;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();

//        person.getMember2((a,b)->new Menber(a,b);
        Member m2 = person.getMember2(Member :: new);
        System.out.println(m2);
    }
}

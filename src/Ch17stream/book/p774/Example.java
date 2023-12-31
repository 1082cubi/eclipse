package Ch17stream.book.p774;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );
        System.out.println("개발자");
        list.stream()
                .filter(s ->s.getJob().equals("개발자"))
                .toList()
                .forEach(System.out::println);

        System.out.println("디자이너");

        list.stream()
                .filter(n->n.getJob().equals("디자이너"))
                .toList()
                .forEach(System.out::println);
    }


}

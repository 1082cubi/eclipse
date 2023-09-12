package Ch17stream.book.p771.moonje6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동",30),
                new Member("신용권",40),
                new Member("감자바",26));

        list.stream()
                .map(m -> m.getAge())
                .forEach(System.out::println);
    }
}

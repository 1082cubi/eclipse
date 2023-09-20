package ch12api.lecture;

public class C33annotation {
    @MyAnnotation33(number = 3, name = "son")
    public static void main(String[] args) {
        @MyAnnotation33(number = 5, name = "lee",address = "jaju")
                int value;
    }
}
@interface MyAnnotation33 {
    // parameter
    // argumert
    // attribute
    // element *

    int number();
    String name();

    String address() default "seoul";
}

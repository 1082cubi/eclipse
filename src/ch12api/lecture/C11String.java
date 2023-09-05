package ch12api.lecture;

public class C11String {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b); //true
        System.out.println(a == c);//fjlse

        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c));//true

    }
}

package ch12api.lecture;

public class C05hashcode {
    public static void main(String[] args) {
        Object o2 = new Object();
        Object o3 = new Object();

        int hashCode1 = o3.hashCode();
        int hashCode2 = o2.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(o3.hashCode());

    }
}

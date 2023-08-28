package ch06class;

public class C04 {
    public static void main(String[] args) {
        int[] a = {3,5};

        System.out.println("a[0] =" + a[0]);

        a = method1();
        System.out.println("a[0] =" + a[0]);
    }
    public static int[] method1() {
        System.out.println("메소드드드");
        int[] k ={22,33};

        return k;
    }
}

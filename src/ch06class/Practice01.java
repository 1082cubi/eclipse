package ch06class;

public class Practice01 {



    public static void main(String[] args) {
        int[] asd = {123, 235, 645};
        int[] fff = asd;

        System.out.println(System.identityHashCode(asd));
        System.out.println(System.identityHashCode(fff));

        fff[0]= 888;
        System.out.println(asd[0]);
        System.out.println(fff[0]);
        System.out.println(System.identityHashCode(asd));
        System.out.println(System.identityHashCode(fff));
    }
    public void b () {

    }
}


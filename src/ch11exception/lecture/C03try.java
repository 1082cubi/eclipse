package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {
        System.out.println("code 1 ..");
        System.out.println("code 2 ..");

        try {
            int i = 0;
            int j = 3 / i; //Arithmetic Exception
        } catch (ArithmeticException e) {
            //catch block :
            // 발생한 exception
            System.out.println("exception 발생 시 실행되는 코드1");
            System.out.println("exception 발생 시 실행되는 코드2");
        }

        System.out.println("code 3 ..");

    }
}
package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 0};
            int i = 3 / arr[2];

            System.out.println("try 내의 흐름");
            //try block 에서
            // 여러
        } catch (ArithmeticException e) {
            System.out.println("잘못된 연산");

        }catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 참죠!!");
        }

        System.out.println("실행을 이어감");
    }
}

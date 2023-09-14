package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        } catch (NullPointerException e) {
            // 동일한 예외처리코드
        } catch (ArithmeticException e) {
            // 동일한 예외처리코드
        }
        try {
            //NullpointerException
            //ArithmeticException
        } catch (RuntimeException e) {
            //여러 exception 의 상위 타입으로 한번에 잡을 수 있음
            // turowable 까지만 가능
            //동인한 예외처리코드
        }
    }
}

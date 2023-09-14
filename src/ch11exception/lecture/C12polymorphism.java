package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            //ClassCastException
            //NullpointerException
            //ArithmeticException
        } catch (ClassCastException e) {
            //ClassCastException
            //예외처리
        } catch (RuntimeException e) {
            //ClassCastException
            //NullpointerException
            //예외처리
        }
    }
}

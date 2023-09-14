package ch11exception.book.p468;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try{
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재 합니다");

        }catch (ClassNotFoundException e ){
            e.printStackTrace();;

        }
        System.out.println();

        try{
            Class.forName("javalang.String2");
            System.out.println("java.lang.String2 클래스가 존재 합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("실행이 흐름 이어감");
    }
}

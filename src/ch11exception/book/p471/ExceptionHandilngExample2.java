package ch11exception.book.p471;

public class ExceptionHandilngExample2 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]:" + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                System.out.println("실행에 문제가 있습니다");
            }
        }
    }
}

package ch11exception.book.p478;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
        findClass();
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}

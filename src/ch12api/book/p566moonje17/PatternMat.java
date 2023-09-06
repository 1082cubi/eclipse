package ch12api.book.p566moonje17;

public class PatternMat {
    public static void main(String[] args) {
        String id = "3Angel1004";
        String regExp = "[a-zA-Z][0-9a-zA-Z]{7,11}";
        boolean ismatch =  id.matches(regExp);
        if (ismatch) {
            System.out.println("ID로 사용할 수 있습니다");
        } else {
            System.out.println("ID로 사용할 수 없습니다");
        }
    }
}

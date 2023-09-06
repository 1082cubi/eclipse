package practice;

public class Naruto20230830 {
    public static void main(String[] args) {
        String str = "자동자 가격은 300000000원 입니다";
        str = str.replaceAll("[8-9]","F");
        System.out.println(str);
    }

    }


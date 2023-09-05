package ch12api.book;

public class TostringExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("삼성전자","안드로이드");

        String strObj = myphone.toString();
        System.out.println(strObj);

        System.out.println(myphone);
    }
}

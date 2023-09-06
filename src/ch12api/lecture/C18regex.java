package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        //regular expression : 정규표현식(정규식,정규식표현)
        //문자열의 패턴을 나타내는 기호들

        //문자
        System.out.println("x".matches("x"));   //true
        System.out.println("a".matches("a"));   //true
        System.out.println("a".matches("x"));   //false

        //문자들
        System.out.println("xyz".matches("xyz"));   //true
        System.out.println("xxx".matches("xxx"));   //true
        System.out.println("xxx".matches("x"));     //false

        //수량자(quantifiers)
        System.out.println("xxx".matches("x{3}"));  //true
        System.out.println("aaa".matches("a{3}"));  //true
        System.out.println("aa".matches("a{3}"));   //false
        System.out.println("aaa".matches("a{1,3}")); //true
        System.out.println("aa".matches("a{1,3}")); //true
        System.out.println("a".matches("a{1,3}")); //true

        System.out.println("dog".matches("do{1,3}g"));  //true
        System.out.println("dooog".matches("do{1,3}g"));//true
        System.out.println("doog".matches("do{1,3}g")); //true

        //그룹 : () : 그룹패턴
        System.out.println("dodog".matches("(do){1,3}g"));  //true
        System.out.println("dododog".matches("(do){1,3}g"));//true
        System.out.println("dog".matches("(do){1,3}g"));    //true

        //수량 :
        System.out.println("dog".matches("do{1,}g"));
        System.out.println("doog".matches("do{1,}g"));
        System.out.println("dooog".matches("do{1,}g"));
        System.out.println("doooog".matches("do{1,}g"));
        System.out.println("doooooog".matches("do{1,}g"));


        //? : 없거나 한번
        System.out.println("dg".matches("do?g"));
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g"));

        // * :0번 이상
        System.out.println("dg".matches("do*g"));
        System.out.println("dog".matches("do*g"));
        System.out.println("doog".matches("do*g"));
        System.out.println("dooog".matches("do*g"));
        System.out.println("doooog".matches("do*g"));

        // + 1번 이상

        System.out.println("dg".matches("do+g"));   //flase
        System.out.println("dog".matches("do+g"));  //true
        System.out.println("doog".matches("do+g")); //true
        System.out.println("dooog".matches("do+g")); //true
        System.out.println("doooog".matches("do+g"));//true

        // 문자 분류(Character classes)
        System.out.println("dog".matches("d[oi]g")); //true
        System.out.println("dig".matches("d[oi]g")); //true
        System.out.println("dag".matches("d[io]g")); //flase

        System.out.println("dog".matches("d[^io]g")); //flase
        System.out.println("dig".matches("d[^io]g")); //flase
        System.out.println("dag".matches("d[^io]g")); //true

        System.out.println("dag".matches("d[a-z]g")); //true a부터z까지


        System.out.println("dag".matches("d[a-cx-z]g")); //true a c x z까지
        System.out.println("dcg".matches("d[a-cx-z]g")); //true a c x z까지
        System.out.println("dgg".matches("d[a-cx-z]g")); //true a c x z까지인데 g는false
        System.out.println("dxg".matches("d[a-cx-z]g")); //true a c x z까지
        System.out.println("dzg".matches("d[a-cx-z]g")); //true a c x z까지


        //문자 분류 기호
        System.out.println("0".matches("[0-9]")); //true
        System.out.println("7".matches("[0-9]")); //true
        System.out.println("0".matches("[\\d]")); //true
        System.out.println("7".matches("[\\d]")); //true

        System.out.println("a".matches("[a-zA-Z_0-9]")); //true
        System.out.println("_".matches("\\w")); //true
        System.out.println("8".matches("\\w")); //true

        // 예제 : 숫자로 시작하면 안되고, 영문대소문자,_,$
        System.out.println("az".matches("[a-z]z"));

        //전화번호 패턴
        //010-9999-9999
        //02-9999-9999
        //02-999-9999
        String number = "[0-9-0-9-0-9]*";
        System.out.println("010".matches(number));
        System.out.println("010-5687-9090".matches(number));
        System.out.println("9999".matches(number));
        System.out.println("9999".matches(number));
        System.out.println("99999999999999999999999999999999999999999".matches(number));

        String nun = "\\d{2,3}-?\\d{3,4}-?\\d{4}";

        // 모든 문자 :
        System.out.println("".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));
        System.out.println(".".matches("."));

        // . : \.
        System.out.println("".matches("\\."));
        System.out.println("a".matches("\\."));
        System.out.println("3".matches("\\."));
        System.out.println("+".matches("\\."));
        System.out.println(".".matches("\\."));

        //이메일 패턴
        // * : 없거나 한개 이상
        // ? : 없거나 하나
        //영문소문자,숫자가 여러개 @ 영문소문자,숫자 여러개.영문소자,숫자 여러개
        String n = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";
        System.out.println("1082cubi@hanmil.net.net".matches(n));

        //. : 아무캐릭터
        //* : 0개이상
        //or : |
        System.out.println("auefhdogsod".matches(".*dog.*"));
        System.out.println("832catlkd".matches(".*cat.*"));
        System.out.println("auefhdogsod".matches(".*(dog|cat).*"));

    }
}

package Basic_05;

public class Inter_Class {		//부모클래스 =상위클래스=super
	static String so = "야옹";
	static String vis = "멍멍";// cat 클래스 멤버변수
	static void sori(String sound) {	//클래스 멤버 함수
		System.out.printf("%s 프로그램\n" , sound);
	}
	
	public static class Cat { //내부 클래스=자식클래스=하위클래스=sup클래스
		
		static void Cat_method (String name) {//cat 클래스 멤버함수
			System.out.printf("\n전달 받은 소리 : %s ",name);
			
		}
	}
	
	static class dog {
		
		static void dog_method (String name_1) {
			System.out.printf("\n 강이지 소리 : %s",name_1);
		}
	}
	
	
	public static void main(String[] args) {
//		Cat.Cat_method("고양이");
		sori("소리를 찾아서");
		Cat.Cat_method(so);
		dog.dog_method(vis);

	}

}

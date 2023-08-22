package Basic_04;

public class Inter_sorri {
	
//	static void sori( String sound ) {		// 멤버함수(메소드)
//		System.out.println("동뮬의 소리");
//	}
	
	static class Cat{ // 내부 클래스
		static String so ="야옹";			//cat 클래스 멤버변수
		static void cat_method(String name) {
			System.out.printf("고양이 소리 : %s\n", name);
		}
	}
	static class tig{ // 내부 클래스
		static String so = "어흥"; 		// Tig 클래스 멤버 변수
		static void tig_method( String name) {		// Tig 클래스 멤버함수
			System.out.printf("\n 동물의 왕의 소리 : %s /n", name);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//cat 내용
			System.out.println("고양이 특징");
			System.out.printf("고양이 소리는 %s\n", Cat.so);
			Cat.cat_method(Cat.so);
			
			
			System.out.println("호랑이 특징");
			System.out.printf("호랑이 소리는 %s\n", tig.so);
	}

}

package Basic_04;

public class Bak_Inter_05 {
	static String name="홍길동";       //클래스 멤버변수
	static int count=0;				 //클래스 멤버변수
	
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			Who.Who_point();
			Iam.iam_point();
		}

	}
	
	
	static class Who {
		static void Who_point() {
			System.out.println("\n넌 누구니?");
		}
	}
	static class Iam {
		static void iam_point() {
			System.out.printf("난 %d번째 난장이야",++count);
		}
	}
}

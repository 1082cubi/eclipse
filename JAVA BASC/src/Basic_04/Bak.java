
   //클래스 멤버변수와 클래스 멤버함수로만 만들기
//package Basic_04;
//
//public class Bak {
//	static String name_1 ="난쟁이";
//	static int su = 0;
//	static void name_1() {
//		for(int i=0; i<7; i++) {
//			su++;
//			System.out.println("\n 넌 누구니");
//			
//			System.out.printf("%s %d 이야",name_1,su);
//		}
//	}
//	public static void main(String[] args) {
//		
//		name_1();
//		
//		
//		
//
//	}
//
//}

package Basic_04;

public class Bak {
	String name = "홍길동";
	int count = 0;
	void who() { System.out.println("\n넌 누구니?"); }
	void iam() { System.out.printf("난 " + (++count) + " 번째 %s이야 \n",name); }
	
	
	public static void main(String[] args) {
		Bak isis = new Bak();
		for(int i=0; i<=7; i++) {
		isis.who();
		isis.iam();
		}
	}
	}
		
		
		
		
		

	



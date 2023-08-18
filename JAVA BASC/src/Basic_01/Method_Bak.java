package Basic_01;

import java.util.Scanner;

public class Method_Bak {
	// 클래스 영역 : 멤버변수, 멤버함수

	static void who() {
		System.out.println("넌 누구니?");
	}
	
	static void iam( int no) {
		Scanner scanf = new Scanner(System.in);
		String name;
		
		System.out.printf("이름을 입력하세요 : "); name = scanf.next();
		
		System.out.printf("번호 %d:%s\n",no,name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		who();			iam(1);
//		who(2);			iam(2);
//		who();			iam(3);
//		who(4);			iam(4);
//		who(5);			iam(5);
//		who(6);			iam(6);
//		who(7);			iam(7);
//		who(8);			iam(8);
//		Scanner scanf = new Scanner(System.in);
//		String name = scanf.next();
		who();
		iam(1);
	
//		System.out.println(name + "입니다.");
//		
		
	
		
	}

}

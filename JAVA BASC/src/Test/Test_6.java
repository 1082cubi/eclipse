package Test;

import java.util.Scanner;

public class Test_6 {
	int a, b,c;
	void func() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		a = sc.nextInt();
		
		System.out.println("두번째 수 : ");
		b = sc.nextInt();
		
		c=a>b ? a:b;						// 조건 ? 참 : 거짓; 삼항연산자
		System.out.printf("두 수 중 큰 값은 %d,",c);
		
	}
	public static void main(String[]args) {
		Test_6 test = new Test_6();
		test.func();
		
	}
}

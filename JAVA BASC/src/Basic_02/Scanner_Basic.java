package Basic_02;

import java.util.Scanner;

public class Scanner_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		
		System.out.println("정수를 입력해 주세요 : ");
		int n = scanf.nextInt();
		System.out.println("입력하신 숫자는 : " + n);
		
		System.out.println("단어를 입력해 주세요 : ");
		String m = scanf.next();
		System.out.println("입력하신 단어는 : " + m);
		
		System.out.println("실수를 입력해 주세요");
		double b = scanf.nextDouble();
		System.out.println("입력하신 소수점은 : " + b);
		
		System.out.printf("일력한 정수 :  %d \n 입력한 문자 : %s \n "
				+ "입력한 소수: %.4f ", n,m,b);
		
	}

}

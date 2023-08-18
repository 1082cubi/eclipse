package Basic_01;

import java.util.Scanner;

public class Scam {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		
		int su,str,f;
		String str1="";
		System.out.println("숫자를 입력 하세요");
		su = scanf.nextInt();
		System.out.println("입력한 값 : "  + su);
		
		System.out.println("문자를 입력 하세요");
		str1 = scanf.next();
		System.out.println("입력한 문자는 : " + str1);
	}

}

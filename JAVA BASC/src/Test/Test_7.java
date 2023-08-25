package Test;

import java.util.Scanner;

public class Test_7 {
	int gum;
	
	void rut() {
	Scanner sc = new Scanner(System.in);
	System.out.println("점수 입력 0~100");
	gum=sc.nextInt();
	
	if (gum<0||gum>100) {			// || 이게 뭘까 복습때 알아보
		System.out.println("오류");
	}
	else 
		System.out.printf(" 입력한 점수: %d ",gum);
	
	}
	public static void main(String[] args) {
		
		Test_7 Test = new Test_7();
		Test.rut();
	}

}

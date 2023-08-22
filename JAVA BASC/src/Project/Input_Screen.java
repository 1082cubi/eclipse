package Project;

import java.util.Scanner;

public class Input_Screen {
		String name;
		String tel;
		int sung;
		
		
		void input_mode() {
		Scanner scnf = new Scanner(System.in);
		
		
		System.out.println("입력 화면 ");
		System.out.println("1. 이름 :  ");
		name = scnf.next();
		
		System.out.println("2. 전화  : ");
		tel = scnf.next();
		
		System.out.println("3. 나이 : ");
		sung = scnf.nextInt();
		
		System.out.println("4. 수정할 번호 ");
		System.out.println("5. 작업 번호를 선택 하세요 ");
		int no = scnf.nextInt();
		if(no == 1);
	
	}
}

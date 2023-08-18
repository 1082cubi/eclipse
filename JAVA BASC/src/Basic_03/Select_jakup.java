package Basic_03;

import java.util.Scanner;

public class Select_jakup {
	
	
	static void input_screen() {
		System.out.println("입력 화면 입니다.");
		
	}
	static void input1_screen() {
		System.out.println("조회 화면 입니다.");
		
	}
	static void input2_screen() {
		System.out.println("수정 화면 입니다.");
		
	}
	static void input3_screen() {
		System.out.println("출력 화면 입니다.");
		
	}
	static void input4_screen() {
		System.out.println("종료 화면 입니다.");
		
		
	}
	

	public static void main(String[] args) {
	
		
		
		
		
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int jakup;
		String yn;
		
		
		System.out.println("1.입력");
		System.out.println("2.조회");
		System.out.println("3.수정");
		System.out.println("4.출력");
		System.out.println("5.종료");
		System.out.println("작업 번호를 누르세요 : ");
		jakup = sc.nextInt();
		
		switch (jakup) { //no는 숫자, 문자,수식 : (int)(54/10); ==> 결과 5)
		case 1 : { 
			input_screen();
		}break;
		case 2 : { 
			input1_screen();
		}break;
		case 3 : { 
			input2_screen();break;
		}
		case 4 :{
			input3_screen();break;
		}
		case 5 :{
			input4_screen();break;
		}
		default :{
			System.out.println("선택 번호 제대로 확인하고 눌러 아..눌러주세요");
		}
		
				
		}
		
	}
		
		
	}
	


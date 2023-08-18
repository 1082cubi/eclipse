package Basic_03;

import java.util.Scanner;


public class If_else {

	public static void main(String[] args) {
		
//		int jumsus;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("점수를 입력해주세요");
//		jumsus = sc.nextInt();
//		if (jumsus >= 90 ) {
//			System.out.println("A 입니다");
//		}
//			else if( jumsus >= 80 ){
//				System.out.println("B 입니다");
//			
//		} else
//			System.out.println("c");

		
//		
//		int num=(int)(Math.random()*10) +1 ;  // 1~10사이 숫자를 만들어 내라 1~9
//		System.out.printf("랜덤 숫자 : %d 숫자가 만들어 졌습니다" , num);	
//		
//		for(int i=1; i<=6; i++) {
//			 num=(int)(Math.random()*45) +1 ;
//		System.out.println(" 로또번호"+num);
//			}
		
		
		
		//정수를 입력하는데 1~3 사이의 숫자를 입력하라 그 외에 숫자는 "오류"를 출력하고 끝내라 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1~3 아무거나 입력해주세용♥");
//		int no = sc.nextInt();
//		
//		if(no == 2 || no == 3) {
//			System.out.println("꽝");
//		}
//		else if (no == 1) {
//			System.out.println("당첨");
//			
//		}
//		else 
//			System.out.println("다시입력하시오");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1~3 아무거나 입력해주세용♥");
//		int no = 1;
//		while (no<5) {
//			no = sc.nextInt();
//		switch(no) {
//		case 1 : 
//			System.out.println("너는 잘생겼어"); break;
//		
//		case 2 : System.out.println("너는 최고야");break;
//		
//		
//		case 3 : System.out.println("너는 몸이 너무 좋아");break;
//		
//		
//		case 4 : System.out.println("너는 나중에 크게 될 아이야");break;
//		int num=(int)(Math.random()*10) +1 ;  // 1~10사이 숫자를 만들어 내라 1~9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요 :  ");
		
		double jum = sc.nextDouble();
		int mum = (int)(Math.round(jum/10)*10);
		switch(mum) {
		case 90 : System.out.println("A급 입니다");break;
		case 80 : System.out.println("B급 입니다");break;
		case 70 : System.out.println("C급 입니다");break;
		case 60 : System.out.println("D급 입니다");break;
		default : System.out.println("아쉽습니다 포기 하지 말고 다시 한번 도전해 보세요");
		
		 
		
		}
		
		

	}
	}


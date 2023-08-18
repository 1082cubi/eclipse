package Basic_03;

import java.util.Scanner;

public class For_while {
	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) 
//			System.out.printf("\n [%d] 입니다  ",i);
//		
//		for(int i=1; i<=5; i++) {
//			System.out.printf("\n [%d] 입니다  ",i);		
	
	
//		int sum = 0;
//		for(int i=0; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지 " + sum);
//	}
		
		
//		int sum =0, gor =0, sld=0;
//		for(int i=0; i<=100; i++) {
//			if(i%2 == 0)
//				gor+=i;
//			else 
//				sld+=i;
//			
//			    sum +=i;
//			
//		}
//		System.out.printf("\n [ %d ] 입니다",sum);
//		System.out.printf("\n [ %d ] 입니다",gor);
//		System.out.printf("\n [ %d ] 입니다",sld); //짝수 홀수 총 값
		
		
		
//		
//		for (int i=1; i<=9; i++)
//			System.out.printf("\n 3 * %d = %3d" ,i , 3*i); //구구단 3
//		
//		Scanner sc = new Scanner(System.in);
//		int i,sim;
//		System.out.println("숫자를 입력해 주세요");
//		 sim= sc.nextInt();
//		
//		for( i =0; i<=9; i++) {
//			System.out.printf("\n %2d * %2d = %3d ",sim,i,sim*i ); // 1~~9까지 구구단
		
//		}
		
//		int i,sim; //가로로 구구단
//		for( i =1; i<=9; i++) {
//			for(sim=2; sim<=9; sim++) {
//				System.out.printf("%2d * %2d = %2d",sim,i,sim*i);
//			}
//		
//			System.out.println();
//		}
//		예재while -1
//		int co =0;
//		while(co< 5 ) {
//			co++; 증가연산자
//			System.out.printf("\n 할수 잇다 %d",co );
//		}
//		예재while -2
//		int so =0;
//		while (so < 500 ) {
//			if(so>5)
//				break;
//			else
//				so++;
//			System.out.printf("%d",so);
//		}
	
	
	
	
		
//		예재while -3 else 없어도 가능하다
//		int so =0;
//		while (so < 500 ) {
//			if(so>5)
//			break;
//		
//				so++;
//			System.out.printf("\n %d",so);
//		}
		
//		예재while -3 또 할거니 (y/n) ? n이면 종료하는 프로그램을 작성하라
		Scanner co = new Scanner(System.in);
		String str; 
		int sc=0;
		
		 
		while(true) {
			sc++;
			System.out.printf("\n 나는 언제까지 찍을 것인가?...",sc);
			
			System.out.println("y/n");
			str=co.nextLine();
			if(str.equals("n"))
					break;
			
			
			}
			
	}
}	
		
		
		
		
		
		
	

package Basic_01;

import java.util.Scanner;

public class Jumun {

	public static void main(String[] args) {
		
			Scanner scanf = new Scanner(System.in);
			
			System.out.println("메뉴 선택 프로그램");
			System.out.println("1. 새우 햄버거");
			System.out.println("2. 불고기 햄버거");
			System.out.println("3. 치킨버거");
			System.out.println("4. 또 오세요");
			
			int no =scanf.nextInt();
			if (no==1) {
				System.out.println("새우 햄버거");}
			else if(no == 2) {System.out.println("불고기 버거");}
			
			else if(no == 3) {System.out.println("치킨 행버거");}
			
			else 
			{System.out.println("또 오세요");}
		}
			
	}
		
	



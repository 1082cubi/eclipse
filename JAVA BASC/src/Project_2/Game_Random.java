package Project_2;

import java.util.Scanner;

public class Game_Random extends Game_SoGae {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int i,no;
		System.out.println("원하는 구구단 입력 : ");
		no = sc.nextInt();
		
		for(i=0; i<9; i++) {
			System.out.printf("%d * %d = %d",no,i,no*i);
			System.out.println();
		}
		
		
	}
	
}

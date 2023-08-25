package Project_2;

import java.util.Scanner;

public class Game_Gugudan  {
	static int i,su;
	
	static void gigi () {
		for(i=0; i<=9; i++) {
			System.out.printf("\n %d * %d = %d ", su,i,su*i);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해");
		su=sc.nextInt();
		gigi();
}
}

package Project_2;

import java.util.Scanner;

public class Game_SoGae {
	static int i,no;
		static void gugu() {
			for(i=0; i<=9; i++) {
				System.out.printf("\n %d * %d = %d",no,i,no*i);
			}
		}
		
public static void main(String[] args) {
					
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력해 주세요");
	no = sc.nextInt();
			gugu();
	
	
}
}
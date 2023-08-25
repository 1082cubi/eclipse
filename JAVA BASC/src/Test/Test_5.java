package Test;

import java.util.Scanner;

public class Test_5 {
		double area;
		int up,side;
		
		void run() {
			Scanner sc = new Scanner(System.in);
			System.out.println("삼각형의 넓이 구하기");
			
			System.out.println("밑변입력 :");
			up = sc.nextInt();
			System.out.println("높이 입력 :");
			side = sc.nextInt();
			area = (double)(up * side) /2;
			
			System.out.printf("넓이 : %.2f",area);
		}
	public static void main(String[] args) {
			Test_5 test= new Test_5();
			test.run();
	}

}

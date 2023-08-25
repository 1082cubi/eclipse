package Test;

import java.util.Scanner;

public class Test_9 {
	long no,no1,no2,ccc;
	double rer;
	
	void run() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.:");
		 no =sc.nextLong();
		 
		 System.out.println("2.:");
		 no1 =sc.nextLong();
		 
		 System.out.println("3.:");
		 no2 =sc.nextLong();
		
		ccc = no+no1+no2;
		rer = (double)ccc/ 3.0;
		
		System.out.println("합계 : \n" + ccc);
		System.out.printf("평균 : %.2f \n" , rer);
		
	}
	public static void main(String[] args) {
		Test_9 test = new Test_9();
		test.run();
	}

}

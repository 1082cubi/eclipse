package Project_2;

import java.util.Scanner;

public class Pro_Main {
     static String name = "홍길동";
     static int number = 0;
     
     static void who() { 
    	 System.out.println("\n넌 누구니");
    	 }
     static void iam() { 
    	 System.out.printf("나는" + (++number) +"번째 %s이야",name); 
    	 }
     
     
     
	public static void main(String[] args) {
		
		
			for(int i=0; i<4; i++) {
				who();
				iam();
			
		}
	}
}



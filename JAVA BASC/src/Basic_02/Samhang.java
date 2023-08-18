package Basic_02;

import java.util.Scanner;

public class Samhang {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			Scanner fff = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요");
			int bin = fff.nextInt();
			System.out.println("숫자를 입력해주세요");
			int bin1 = fff.nextInt();
			
			if(bin>bin1)
				System.out.println(bin+"숫자가 크다"+bin1);
			else if (bin<bin1)
				System.out.println(bin+"숫자가 작다"+bin1);
			else
				System.out.println(bin+"숫자가 같다"+bin1);
		

	}


	
	}



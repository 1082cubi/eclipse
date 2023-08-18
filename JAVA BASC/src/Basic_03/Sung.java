package Basic_03;

import java.util.Scanner;

public class Sung {

	public static void main(String[] args) {
		
		Scanner self =new Scanner(System.in);
		int kor, eng, mat;
		double sun, men, htr;
		String hhh,nnn,mmm;
		
		nnn = "y"; 
		mmm = "n";
		while(nnn.equals("y")) {
		
		System.out.println("국어 :  ");
		kor=self.nextInt();
		
		System.out.println("영어 : ");
		eng = self.nextInt();
		
		System.out.println("수학 : ");
		mat = self.nextInt();
		
		sun = kor + eng + mat;
		men = sun /3;
		
		if(men>60) {
			System.out.println("햡격");
			}
		else 
			System.out.println("불합격");
		
		if(men>90) {
			System.out.println("A");
		}
		else if (men>80) {
			System.out.println("B");
		}
		else 
			System.out.println("F");
		
		System.out.printf("\n 총점 : %.1f",sun);
		System.out.printf("\n 평균 : %.2f",men);
		
		System.out.println(" 계속 하실 건가요? 그만해 이제 (y/n) : ");
		self.nextLine();
		nnn = self.nextLine();  
		
		}
		
		}
}

		
			
	



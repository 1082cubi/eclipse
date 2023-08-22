package Basic_04;

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String s;
		
//		String[] str_1 = {"홍길동","이동수","김철수" };
//		
//		System.out.println( str_1[0] );
//		System.out.println( str_1[1] );
//		System.out.println( str_1[2] );
//		System.out.println("-------------");
//		
//		for(i=0; i<3; i++)
//			System.out.println(str_1[i]);
//		
//		System.out.println("-------------");
//		str_1[1] = "이다혜";
//		//str_1[3] = "한의혁";    // 배열 크기는 변경할 수 없다.
//		for(i=0; i<str_1.length; i++)
//			System.out.printf("\n [%d] : %s,",i, str_1[i] );
		
//		String[] wet = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
//		
//		for(i=0; i<wet.length; i++)
//			System.out.println( wet[i]);
		
//		

//		String[] name= {"홍길동","이동수","김철수","강수진","최영숫"};
//		String [] num = {"011","012","013","014","015"}; 			//011->0부터 시작하는 것은 컴퓨터가 계산하기 때문에 String으로 지정해줘야한다.
//		
//		for(i=0; i<5; i++)
//			System.out.printf("\n %d : %s : %s",i+1,name[i],num[i]);
		
		//입력 횟수를 입력해서 그 횟수 만큼 배열 선언하여 그 곳에 입력된 점수를 출력하자
			Scanner ca = new Scanner(System.in);
			
			System.out.println("몇개의 점수를 입력하실건가요?");
			int [] junsu = new int[ca.nextInt()];
			
			for(i=0; i<junsu.length; i++) {
				System.out.println("점수를 입력 : ");
				junsu[i] = ca.nextInt();}
				

				for(i=0; i<junsu.length; i++)
					System.out.printf("\n %d ",junsu[i]);
				
				
				
				
			
		
			
		

	}

}

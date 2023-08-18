package Basic_02;

import java.util.Scanner;

public class Cast_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			char c1,c2;
//			c1 = 'A'; 	c2 = '홍';
//			System.out.println(c1 + "영문자를 숫자로 " + c2 + " ");
//			System.out.printf("\n영문자를 숫자로 %d, 한글 홍을 숫자로 %d", (int)c1,(int)c2);
//			
			
			
//			
//			Scanner scanf = new Scanner(System.in);
//			String ch;
//			for(int i = 1; i<130; i++) {
//				System.out.printf("\n숫자 %d : %c",i,(char) i);
//				if (i%10 == 0) {
//					System.out.println("\n----------more");
//				ch =scanf.nextLine();
//				if(ch.equals(""))
//					continue;
//				else
//					break;
//				}
//				
//			}
//			String str = "abcd";			//문자열은 배열 (데이터를 순서대로 기억하는 기억장소)
////			System.out.printf("문자열 : %s  %c", str,str.charAt(3) );
//			for(int i=0; i<str.length(); i++) {
//			System.out.printf("\n{%d} %c",i, str.charAt(i) );
//			
//	}
//					Scanner scant = new Scanner(System.in);
//					int dan;
//					System.out.println("숫자를 입력하시요 구구단 입니다");
//					dan = scant.nextInt();
//					
//					if( dan == 0 )
//						break;
//					
//					for(int i=1; i<=9; i++) {
//						System.out.println(dan + " * " + i +  " = "+ i *dan  );
//						
//						}
					
					//영문자만 입력 가능하고 " 로그인 되었음 " 그 외의 문자는 " 다시 입력하세요 " 라는 메세지를 
					// 'A'는 65			'Z'는 91   소문자 'a' 97  소문자 'z'는 122
					
		        Scanner scanf = new Scanner(System.in);
		        String str;
		        
		        System.out.println("아이디를 입력하세요");
		        str = scanf.next();
		        
		        System.out.printf(" 입력된 문자열은 %s",str);
		        for(int i=0; i<str.length(); i++) {
		        	System.out.printf("[%d]문자: %c",str.charAt
		        			
		        			[i] );
		        }
							
					
					
	}		
	}


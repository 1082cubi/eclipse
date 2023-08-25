package Test;

import java.util.Scanner;

public class Test_8 {
	int no;
	char alpa;
	
	void func() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		 alpa = sc.nextLine().charAt(0);
		int no =(int)alpa;
		
		System.out.printf("입력한 문자 : %c \n ",alpa);
		//강제 형변환 cast연산자 : 변수 앞에 (괄호안에 기본형 디입)변수
		System.out.printf("입력한 문자 : %d",(int)alpa);
		
		for(int i=65; i<=122; i++) {
			//강제 형변환 숫자를 문자로 : (char)i
			System.out.printf("입력한 문자 : %d \n\n",i,(char)i);
		}
		
	}

	public static void main(String[] args) {
		
		Test_8 test = new Test_8();
		test.func();
		}

	}



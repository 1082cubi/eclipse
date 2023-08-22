package Basic_04;

public class Person_Method_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name2();
		Person_Method_03 ssss = new Person_Method_03();
		ssss.name__2();
	}
	
	static String name_1 = "홀길동";
	static String job = "개발자";
	static int age = 20;
	static void name2() {
		System.out.printf("이름 %s  직업 %s 나이%d",name_1,job,age);
		
		
		
	}
	//클래스 멤버 변수 선언
	String name_2="홍길동";
	String job_2 ="개발자";
	int age_2 = 20;
	
	//클래스 멤버 함수 선언
	void name__2() {
		System.out.printf("\n 이름 %s 직업 %s 나이%d",name_2,job_2,age_2);
	}
}

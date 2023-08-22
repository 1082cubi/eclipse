package Basic_04;

public class Car_Method_2 {
	
	String handle = "우회전";
	int ball = 10;
	int rotate = 20;
	
//	ball = 4;
	
	void car_run() { 		//인스턴스 멤버
		handle ="90동 회전";
		ball=40;
		System.out.printf("1번 코너에서 %s 하세요",handle);
		if(ball<10)
			System.out.printf("1번 코너에서 %sd 하세요",rotate);
		else 
			System.out.printf("1번 코너에서 %d 화전 하세요",rotate+50);
	}
	public static void main(String[] args) {
		System.out.println("클래스 변수를 출력 : " + name_1);
		sogae_1();
		
		Method_01 ins = new Method_01();
		System.out.println("인스턴스 변수를 출력 : " + ins.name_2);

	}

}

package Basic_06_E;

public class OverLoad {
	
	static void car() {
		System.out.println("자동차 소개");
		
	}
	static void car(int value) {
		System.out.println("자동차 가격은 : " + value);
	}
	static void car(String name) {
		System.out.println("자동차 이름은 : " + name );
	}
	 static void car(int year, int speed) {
		 System.out.println("출시 년도 : "+ year);
		 System.out.println("자동차 속도 : "+ speed);
	 }
	 static void car(double y, double d) {
		 System.out.println("제조년도 : " + y );
		 System.out.println("자동차 속도 : " + d );
	 }
	public static void main(String[] args) {
		car();			//메소드 호출
		car(500);
		car("제네시스");
		car(2023,300);
		car(10, 11.5);
	}

}

package Basic_05;

public class Constr_Car_01 {

		public static void main(String[] args) {
			// car 객체가 생성자가 있는지 확인하고 자동 실행
			Car car = new Car();
			
			Car2 car2 = new Car2("제니시스",4000);
			
			Car3 car3 = new Car3("suv",250,"파랑색"); // suv, 250, 파랑색
			
			
		}
}

class Car {
	int speed;
	Car() {
		System.out.println("Car 클래스의 생성자가 만들어 졌습니다");
	}
}


class Car2 {			//멤버함수는 멤버변수를 사용한다.
	String name;
	int price;
	
	Car2(String n, int a ) {		//클래스 이론과 똑같다. 생성자
		name =n; price = a;
		System.out.println("이름 : " + n + " 가격은 : "+ a);
	}
}
class Car3 {
	String maun;
	int speed ;
	String color;
	
	Car3(String su, int a, String bl) {
		maun=su;
		speed = a;
		color = bl;
		System.out.println("차 종류 :"+su+" 최고속력 : "+a + " 색깔 : " +bl );
	}
}



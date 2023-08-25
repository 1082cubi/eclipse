package Basic_07_Multi;

public class Main {

	public static void main(String[] args) {
		Car car = new Bus();		// 결론 : 대형성은 부모(자식) 클래스의 결정에 따라 다양한 (메소드 선택과정) 선택을 할 수 있다.
		car.run();
		car.road();
		
		Tru tru = new Tru();
		tru.a();
		tru.a("문자");
		tru.a(10, "문자");
		 
	}

}
class Car  {
	String name;
	String speed; 
	
	void run() {
		System.out.println("아들 부모가 이번엔 먼저야");
	}
		void road() {
			name="테슬라 모델s";
			
			System.out.println("자동차 이름은 : " + name);
		}
	}
class Bus extends Car {
	void run() {
		name="테슬라 모델x";
		super.run();
		System.out.println("자동차 이름은 : " + name);
	}
	void road() {
		name="테슬라 모델s";
		
		System.out.println("자동차 이름은 : " + name);
	}
}
class Tru extends Car {
		void a() { System.out.println("대개변수없다 0");  }
		void a(String a) { System.out.println("대개변수없다 1" + a);  }
		void a( int b, String c) { System.out.println("대개변수없다 2" + b + "," + c);  }
}

package Basic_06_E;

public class Car_Once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Bus car_bus = new Car_Bus();
		car_bus.run();
		
		Car_Trux car_trux = new Car_Trux();
		car_trux.run();
		
	}

}
class Car_All {
	String right ="밝기";
	String handle ="파워 핸들";
	int ball = 4;
	
	
	void run() {
		System.out.println("달린다");
		System.out.println("조명 : " + right);
		System.out.println("파워 핸들 : " + handle);
		System.out.println("바퀴 : " + ball);
		
	}
}
class Car_Bus extends Car_All{
	
}
class Car_Trux extends Car_All{
}

	

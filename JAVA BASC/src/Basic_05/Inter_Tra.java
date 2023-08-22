package Basic_05;

public class Inter_Tra {
	static String speed = "60";
	static void run(String runing) {
		System.out.printf("\n시속이 몇이야? : %s",runing);
	}
	
	static class Bus {
		static String speed="100";
		static void bus_run (String name) {
			System.out.printf("\n 버스 시속은 : %s",name);
		}
	}
	static class Car {
		static String speed = "150";
		static void car_run() {
			System.out.printf("\n 자동차 시속은 %s 입니다",speed);
			System.out.println("부모 속도 : " + Inter_Tra.speed);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(speed);
		Bus.bus_run(Bus.speed);
		run(speed);
		Car.car_run();
		
		
	}

}

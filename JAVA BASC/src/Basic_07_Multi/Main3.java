package Basic_07_Multi;

import java.util.Scanner;

public class Main3 {
	static int input;
	public static void main(String[] args) {
		
		Car_Class car_class;		//String str;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
		System.out.println("\n 1. 버스 \n 2. 트럭 \n 3. 종료 \n \n선택하세요 : ");
			input = sc.nextInt();
			if (input == 1) {
				car_class = new Bus_Class();
				car_class.run();
		} 
			else if ( input == 2) {
				car_class = new Tru_Class();
				car_class.run();
		}
			else if (input == 3) {
				System.out.println("종료하겠습니다");
				break;
		}
			else  
				System.out.println("저희 자동차는 두가지 밖에 없어요 다시 입력 부탁드릴게요");
				continue;	
	   }
	}
}
class Car_Class {
	String name;
	int speed;
	void run() {
		System.out.printf("자동차 종류 : %s \n 자동차 속도 : %d",name, speed);
	}
}
class Bus_Class extends Car_Class {
	Bus_Class() {
		name="버스";
		speed=60;
		
	}
}
class Tru_Class extends Car_Class {
	Tru_Class() {
		name = "트럭";
		speed = 100;
	}
}
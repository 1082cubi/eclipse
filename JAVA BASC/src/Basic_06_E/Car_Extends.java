package Basic_06_E;

public class Car_Extends {
	String name;	
	int speed,price;
	
	public void setOption(int speed,int price) {
		this.speed = speed;
		this.price = price;
	
	}
	public void total() {
		System.out.println("자동차 속도 : " + this.speed + " 가격 : " + price);
		
	}
	public void pandan() {
		System.out.println("자동차를 잘 샀다");
	}
		
	public static void main(String[] args) {
		Child child = new Child();
		child.setOption(300,4000);
		child.total();
		child.pandan();
		child.right();
		
	}

}

class Child extends Car_Extends { // 자식 클래스
	public void right( ) {
		System.out.println("내가 조명을 달았어요");    //확장 했다.
	}
	
}

package Basic_07_Multi;

public class House {

	public static void main(String[] args) {
		Apt apt = new Apt();		// Apt 타입으로 apt 인스턴스를 Apt() 형태로 객체화 시킨다.
		apt.door();
		
		Dan dan = new Dan();
		dan.door();
		System.out.println("-------------------");
		
		Apt apt2 = new Dan();  // Apt 타입으로 apt2 인스턴스를 만들고 Dan() 형태로 객체화 시켰다.
		apt2.door();			// 오버라이딩 된 것을 먼저 읽는다.(문법이그래)
	}

}
class Apt {
	int room=3;
	void door() {				//static 없는 것은 인스턴스
		System.out.println("문이 열쇠");
	}
}
class Dan extends Apt {
	void door() {
		System.out.println("문을 도어락");   // 오버라이딩 : 내용만 바뀐다.
	}
}
package Basic_06_E;

public class Parent {
	
	int age = 50;
	String name = "부모";
	
	Parent() {			//기본 생성자
		System.out.println("나는 부모 생성자");
	}
	
	public void pr(int age, String name) {
		System.out.println("자식 클래스에서 호출되어 출력 나이 : " + age + )
	}

	public static void main(String[] args) {
		Hong hong = new Hong(10);
		hong.pr(10,"홍길동");
	}

}
class Hong extends Parent {
	Hong(int age,String name) {
	super( 50, "부모이름");
	}
}

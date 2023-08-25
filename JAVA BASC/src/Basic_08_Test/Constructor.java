package Basic_08_Test;

public class Constructor {

	public static void main(String[] args) {
	
		par p1 = new par("홍길동",20);
		System.out.printf("이름 : %s  나이는 : %d \n",p1.name,p1.age);
		System.out.println("-----------------------------------------");
		
		par p2 = new par("이동수",30);
		String str = p2.str();
		System.out.println(str);
	}

}
class par {
	String name;
	int age;
	par(String name,int age) {
		this.name = name;
		this.age=age;
	}
	String str() {
		return String.format("이름 :%s, 나이 : %d",name,age);
	
	
		
	}
	
}